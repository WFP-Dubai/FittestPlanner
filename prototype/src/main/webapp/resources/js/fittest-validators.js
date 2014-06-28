window.ParsleyValidator
  .addValidator('greaterthan', function (value, requirement) {
    return $(requirement).val() < value;
  }, 32)
  .addMessage('en', 'greaterthan', 'This value should be greater than %s');