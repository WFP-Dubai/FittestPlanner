from django.db import models
from django.contrib.auth.models import User

# Create your models here.
class UserProfile(models.Model):
    user = models.OneToOneField(User)
    fname = models.CharField("First Name",max_length=50)
    lname = models.CharField("Last Name",max_length=50)

class ContactItem(models.Model):
    user = models.ForeignKey(User)
    contactType = models.CharField(max_length=20)
    contactCode = models.CharField(max_length=50)


class Mission(models.Model):
    missionName = models.CharField(max_length=50)
    startDate= models.DateField(blank=True, null=True)
    endDate = models.DateField(blank=True, null=True)
    startNoLaterThan = models.DateField(blank=True, null=True)
    endNoLaterThan = models.DateField(blank=True, null=True)
    missionLength = models.IntegerField()
    assingee = models.ForeignKey(User)