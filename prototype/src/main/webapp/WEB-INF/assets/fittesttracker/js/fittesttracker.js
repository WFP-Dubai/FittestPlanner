$(document).ready(function($) {
  var active_page = window.location.pathname.split('/')[2];
  if (active_page) {
    $('#sidebar li.active').removeClass('active');
    $('#sidebar a[href$="' + active_page + '"]')
      .parents('li:first')
      .addClass('active');
  }
  
  var hash = window.location.hash;
  hash && $('ul.nav a[href="' + hash + '"]').tab('show');

  $('.nav-tabs a').click(function (e) {
    $(this).tab('show');
    var scrollmem = $('body').scrollTop();
    window.location.hash = this.hash;
    $('html,body').scrollTop(scrollmem);
    e.preventDefault();
  });

  $('.navbar-toggle').click(function (e) {
    e.preventDefault();
    $('.nav-sm').html($('.navbar-collapse').html());
    $('.sidebar-nav').toggleClass('active');
    $(this).toggleClass('active');
  });

  var $sidebarNav = $('.sidebar-nav');

  $(document).mouseup(function (e) {
    if (!$sidebarNav.is(e.target)
        && $sidebarNav.has(e.target).length === 0
        && !$('.navbar-toggle').is(e.target)
        && $('.navbar-toggle').has(e.target).length === 0
        && $sidebarNav.hasClass('active')
       )
    {
      e.stopPropagation();
      $('.navbar-toggle').click();
    }
  });

  $('.btn-close').click(function (e) {
    e.preventDefault();
    $(this).parent().parent().parent().fadeOut();
  });
  $('.btn-minimize').click(function (e) {
    e.preventDefault();
    var $target = $(this).parent().parent().next('.box-content');
    if ($target.is(':visible'))
      $('i', $(this))
      .removeClass('glyphicon-chevron-up')
      .addClass('glyphicon-chevron-down');
    else
      $('i', $(this))
      .removeClass('glyphicon-chevron-down')
      .addClass('glyphicon-chevron-up');
    $target.slideToggle();
  });

  $('.default-dataTable').dataTable({
  });
  $('.simple-dataTable').dataTable({
    searching: true,
    info: false,
    lengthChange: false,
    pageLength: 5
  });
  
  $('[data-toggle="tooltip"]').tooltip();
  $('select').select2();
  $('.datepicker').datepicker({ dateFormat: 'dd/mm/yy' });
  
  var defaultTheme = 'cerulean';
  var currentTheme = $.cookie('currentTheme') == null ? defaultTheme : $.cookie('currentTheme');
  switchTheme(currentTheme);
  
  $('#themes a').click(function (e) {
    e.preventDefault();
    currentTheme = $(this).attr('data-value');
    $.cookie('currentTheme', currentTheme, {expires: 365});
    switchTheme(currentTheme);
  });
  
  function switchTheme(themeName) {
    if (themeName == 'classic') {
      $('#bs-css').attr(
        'href',
        '/fittesttracker/external/css/bootstrap.min.css');
    } else {
      $('#bs-css').attr(
        'href',
        '/fittesttracker/external/css/bootstrap-' + themeName + '.min.css');
    }

    $('#themes i')
      .removeClass('glyphicon glyphicon-ok whitespace')
      .addClass('whitespace');
    $('#themes a[data-value=' + themeName + ']')
      .find('i')
      .removeClass('whitespace')
      .addClass('glyphicon glyphicon-ok');
  }
});
