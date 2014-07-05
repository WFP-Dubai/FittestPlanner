package org.wfp.fittest.dao;

import java.util.Date;
import java.util.List;

import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.entity.Country;
import org.wfp.fittest.entity.Language;
import org.wfp.fittest.entity.ProfileType;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.entity.ConfirmedType;
import org.wfp.fittest.entity.StaffRole;
import org.wfp.fittest.entity.StaffType;

public interface StaffDao {

	/* ====================================================================== */
	// Staff
	/* ====================================================================== */

	public List<Staff> findAllStaff();
	
	public Staff findStaffByIndex(Integer staffIndex);

	public List<Staff> findStaffByFirstName(String firstName);

	public List<Staff> findStaffByLastName(String lastName);

	public List<Staff> findStaffByFirstNameAndLastName(String firstName,
			String lastName);

	public List<Staff> findStaffByTitle(String title);

	public Staff findStaffByMobile(String mobile);

	public Staff findStaffByThuraya(String thuraya);

	public List<Staff> findStaffByDateOfBirth(Date dateOfBirth);

	public List<Staff> findStaffByStaffType(StaffType staffType);

	public List<Staff> findStaffByColorCode(String colorCode);

	public List<Staff> findStaffByAllOfLanguages(List<Language> languages);

	public List<Staff> findStaffByAnyOfLanguages(List<Language> languages);
	
	public List<Staff> findStaffByActivityType(ActivityType activityType);
	
	public List<Staff> findStaffByActivityTypeInDate(ActivityType activityType, Date fromDate);
	
	public List<Staff> findStaffByActivityTypesInDate(List<ActivityType> activityTypes, Date fromDate);
	
	public List<Staff> findStaffAvailable(Date fromDate);

	public List<Staff> findStaffNotAvailable(Date fromDate);
	
	/* ====================================================================== */
	// Country
	/* ====================================================================== */

	public List<Country> findAllStaffNationalities();

	/* ====================================================================== */
	// Language
	/* ====================================================================== */

	public List<Language> findAllStaffLanguages();

	/* ====================================================================== */
	// Staff Type
	/* ====================================================================== */

	public List<StaffType> findAllStaffTypes();
	
	/* ====================================================================== */
	// Staff Confirmed Type
	/* ====================================================================== */
	
	public List<ConfirmedType> findAllConfirmedTypes();
	
	/* ====================================================================== */
	// Staff Role
	/* ====================================================================== */

	public StaffRole findStaffRoleById(Integer staffRoleID);
	
	public List<StaffRole> findAllStaffRoles();
	
	public List<StaffRole> findStaffRolesActiveInDate(Date activeDate);

	/* ====================================================================== */
	// Profile Type
	/* ====================================================================== */

	public List<ProfileType> findAllProfileTypes();

}
