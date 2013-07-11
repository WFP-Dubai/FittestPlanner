from django.db import models
from django.contrib.auth.models import User
from django.db.models.signals import post_save

# Create your models here.


class ContactItem(models.Model):
    user = models.ForeignKey(User)
    contactType = models.CharField(max_length=20)
    contactCode = models.CharField(max_length=50)


class Assignment(models.Model):
    missionName = models.CharField(max_length=50)
    startDate= models.DateField(blank=True, null=True)
    endDate = models.DateField(blank=True, null=True)
    startNoLaterThan = models.DateField(blank=True, null=True)
    endNoLaterThan = models.DateField(blank=True, null=True)
    missionLength = models.IntegerField()
    assingee = models.ForeignKey(User)



class Mission(models.Model):
    """Mission Model consists of many Assignments"""
    
    name = models.CharField(_('Name'), max_length=250, blank=True, null=True, help_text="")
    place = models.ForeignKey(Place)
    description = models.CharField(_('Description'), max_length=500, blank=True, null=True, help_text="")    
    
 
    class Meta:
        ordering = ['name',]

 
    def __unicode__(self):
        return "%s" % (self.name)
 
    @models.permalink
    def get_absolute_url(self):
        return ('')