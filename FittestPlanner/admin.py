from FittestPlanner.models import *
from django.contrib import admin
from django.contrib.auth.admin import UserAdmin
from django.contrib.auth.models import User

#class UserProfileInline(admin.TabularInline):
#    model = UserProfile
#    fk_name = 'user'
#    max_num = 1


class ContactItemInline(admin.TabularInline):
    model = ContactItem
    fk_name = 'user'


class CustomUserAdmin(UserAdmin):
    inlines = [ContactItemInline,]
    list_display = ('username', 'email', 'first_name', 'last_name', 'is_staff', 'is_active')


admin.site.unregister(User)
admin.site.register(User, CustomUserAdmin)

admin.site.register(Mission)
#admin.site.register(UserProfile)
admin.site.register(ContactItem)