package org.wfp.fittest.dao;

import java.util.Date;
import java.util.List;

import org.wfp.fittest.entity.Country;
import org.wfp.fittest.entity.Language;
import org.wfp.fittest.entity.ProfileType;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.entity.StaffConfirmedType;
import org.wfp.fittest.entity.StaffType;

public interface StaffDao {

	/* ====================================================================== */
	// Staff
	/* ====================================================================== */

	public List<Staff> findAllStaff();

	public List<Staff> findStaffByFirstName(String firstName);

	public List<Staff> findStaffByLastName(String lastName);

	public List<Staff> findStaffByFirstNameAndLastName(String firstName,
			String lastName);

	public List<Staff> findStaffByTitle(String title);

	public Staff findStaffByMobile(String mobile);

	public Staff findStaffByThuraya(String thuraya);

	public List<Staff> findStaffByDateOfBirth(Date dateOfBirth);

	public List<Staff> findStaffByAge(Integer age);

	public List<Staff> findStaffByAgeLessThan(Integer age);

	public List<Staff> findStaffByAgeGreaterThan(Integer age);

	public List<Staff> findStaffByNationality(Country nationality);

	public List<Staff> findStaffByLanguage(Language language);

	public List<Staff> findStaffByStaffType(StaffType staffType);

	public List<Staff> findStaffByColorCode(StaffType staffType);

	public List<Staff> findStaffByProfileType(ProfileType profileType);

	public List<Staff> findStaffByAllOfLanguages(List<Language> languages);

	public List<Staff> findStaffByAnyOfLanguages(List<Language> languages);

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
	
	public List<StaffConfirmedType> findAllStaffConfirmedTypes();
	
	/* ====================================================================== */
	// Staff Role
	/* ====================================================================== */

	public List<StaffType> findAllStaffRoles();

	/* ====================================================================== */
	// Profile Type
	/* ====================================================================== */

	public List<ProfileType> findAllProfileTypes();

}
