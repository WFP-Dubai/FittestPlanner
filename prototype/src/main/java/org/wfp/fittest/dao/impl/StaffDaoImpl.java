package org.wfp.fittest.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.wfp.fittest.dao.StaffDao;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.entity.Country;
import org.wfp.fittest.entity.Language;
import org.wfp.fittest.entity.ProfileType;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.entity.StaffConfirmedType;
import org.wfp.fittest.entity.StaffRole;
import org.wfp.fittest.entity.StaffType;

@Repository
public class StaffDaoImpl extends AbstractDaoImpl implements StaffDao {

	@Override
	public List<Staff> findAllStaff() {
		return findAll(Staff.class);
	}

	@Override
	public List<Staff> findStaffByFirstName(String firstName) {
		return findByPropertyEqual(Staff.class, "firstName", firstName);
	}

	@Override
	public List<Staff> findStaffByLastName(String lastName) {
		return findByPropertyEqual(Staff.class, "lastName", lastName);
	}

	@Override
	public List<Staff> findStaffByFirstNameAndLastName(String firstName,
			String lastName) {
		Criteria criteria = createCriteria(Staff.class);
		criteria.add(Restrictions.eq("firstName", firstName));
		criteria.add(Restrictions.eq("lastName", lastName));
		return findByCriteria(criteria);
	}

	@Override
	public List<Staff> findStaffByTitle(String title) {
		return findByPropertyEqual(Staff.class, "title", title);
	}

	@Override
	public Staff findStaffByMobile(String mobile) {
		return findOneByPropertyEqual(Staff.class, "mobile", mobile);
	}

	@Override
	public Staff findStaffByThuraya(String thuraya) {
		return findOneByPropertyEqual(Staff.class, "thuraya", thuraya);
	}

	@Override
	public List<Staff> findStaffByDateOfBirth(Date dateOfBirth) {
		return findByPropertyEqual(Staff.class, "dataOfBirth", dateOfBirth);
	}

	@Override
	public List<Staff> findStaffByStaffType(StaffType staffType) {
		return findByPropertyEqual(Staff.class, "staffType", staffType);
	}

	@Override
	public List<Staff> findStaffByColorCode(String colorCode) {
		return findByPropertyEqual(Staff.class, "colorCode", colorCode);
	}

	@Override
	public List<Staff> findStaffByAllOfLanguages(List<Language> languages) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> findStaffByAnyOfLanguages(List<Language> languages) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Country> findAllStaffNationalities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Language> findAllStaffLanguages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StaffType> findAllStaffTypes() {
		return findAll(StaffType.class);
	}

	@Override
	public List<StaffConfirmedType> findAllStaffConfirmedTypes() {
		return findAll(StaffConfirmedType.class);
	}

	@Override
	public List<StaffRole> findAllStaffRoles() {
		return findAll(StaffRole.class);
	}

	@Override
	public List<ProfileType> findAllProfileTypes() {
		return findAll(ProfileType.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Staff> findStaffByActivityType(ActivityType activityType) {
		Criteria criteria = getCurrentSession()
				.createCriteria(Staff.class, "staff")
				.createAlias("staff.staffRoles", "staffRole")
				.createAlias("staffRole.activityRoles", "activityRole")
				.createAlias("activityRole.activity", "activity")
				.createAlias("activity.activityType", "activityType")
				.add(Restrictions.eq("activityType.ID", activityType.getID()));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Staff> findStaffByActivityTypeInDate(ActivityType activityType,
			Date fromDate) {
		Criteria criteria = getCurrentSession()
				.createCriteria(Staff.class, "staff")
				.createAlias("staff.staffRoles", "staffRole")
				.createAlias("staffRole.activityRoles", "activityRole")
				.createAlias("activityRole.activity", "activity")
				.createAlias("activity.activityType", "activityType")
				.add(Restrictions.eq("activityType.ID", activityType.getID()));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return criteria.list();
	}

	@Override
	public List<Staff> findStaffAvailable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> findStaffAvailable(Date fromDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> findStaffNotAvailable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Staff> findStaffNotAvailable(Date fromDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StaffRole> findStaffRolesActiveInDate(Date activeDate) {
		return findByDurationAround(StaffRole.class, activeDate);
	}
}
