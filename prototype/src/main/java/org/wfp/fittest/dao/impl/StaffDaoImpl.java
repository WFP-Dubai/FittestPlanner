package org.wfp.fittest.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.wfp.fittest.dao.ActivityDao;
import org.wfp.fittest.dao.StaffDao;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.entity.ConfirmedType;
import org.wfp.fittest.entity.Country;
import org.wfp.fittest.entity.Language;
import org.wfp.fittest.entity.ProfileType;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.entity.StaffRole;
import org.wfp.fittest.entity.StaffType;

@Repository
public class StaffDaoImpl extends AbstractDaoImpl implements StaffDao {

	@Autowired
	private ActivityDao activityDao;

	@Override
	public List<Staff> findAllStaff() {
		return findAll(Staff.class);
	}

	@Override
	public Staff findStaffByIndex(Integer staffIndex) {
		return findById(Staff.class, staffIndex);
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
	public List<ConfirmedType> findAllConfirmedTypes() {
		return findAll(ConfirmedType.class);
	}

	@Override
	public List<StaffRole> findAllStaffRoles() {
		return findAll(StaffRole.class);
	}

	@Override
	public List<ProfileType> findAllProfileTypes() {
		return findAll(ProfileType.class);
	}

	private Criteria getStaffByActivityTypeCriteria(ActivityType activityType) {
		return getStaffByActivityTypesCriteria(Arrays.asList(activityType));
	}

	private Criteria getStaffByActivityTypesCriteria() {
		Criteria criteria = getCurrentSession()
				.createCriteria(Staff.class, "staff")
				.createAlias("staff.staffRoles", "staffRole")
				.createAlias("staffRole.activityRoles", "activityRole")
				.createAlias("activityRole.activity", "activity")
				.createAlias("activity.activityType", "activityType");
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		return criteria;
	}

	private Criteria getStaffByActivityTypesInDateCriteria(Date fromDate) {
		Criteria criteria = getStaffByActivityTypesCriteria().add(
				Restrictions.le("staffRole.startDate", fromDate)).add(
				Restrictions.ge("staffRole.endDate", fromDate));
		return criteria;
	}

	private Criteria getStaffByActivityTypesCriteria(
			List<ActivityType> activityTypes) {
		List<Integer> activityTypeIds = new ArrayList<Integer>();
		for (ActivityType activityType : activityTypes)
			activityTypeIds.add(activityType.getID());
		Criteria criteria = getStaffByActivityTypesCriteria().add(
				Restrictions.in("activityType.ID", activityTypeIds.toArray()));
		return criteria;
	}

	private Criteria getStaffByActivityTypeInDateCriteria(
			ActivityType activityType, Date fromDate) {
		return getStaffByActivityTypesInDateCriteria(
				Arrays.asList(activityType), fromDate);

	}

	private Criteria getStaffByActivityTypesInDateCriteria(
			List<ActivityType> activityTypes, Date fromDate) {
		Criteria criteria = getStaffByActivityTypesCriteria(activityTypes).add(
				Restrictions.le("staffRole.startDate", fromDate)).add(
				Restrictions.ge("staffRole.endDate", fromDate));
		return criteria;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Staff> findStaffByActivityType(ActivityType activityType) {
		Criteria criteria = getStaffByActivityTypeCriteria(activityType);
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Staff> findStaffByActivityTypeInDate(ActivityType activityType,
			Date fromDate) {
		Criteria criteria = getStaffByActivityTypeInDateCriteria(activityType,
				fromDate);
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Staff> findStaffByActivityTypesInDate(
			List<ActivityType> activityTypes, Date fromDate) {
		Criteria criteria = getStaffByActivityTypesInDateCriteria(
				activityTypes, fromDate);
		return criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Staff> findStaffAvailable(Date fromDate) {
		List<Integer> activityTypes = Arrays.asList(
				activityDao.findActivityTypeByActivityType("Break in Service").getID(),
				activityDao.findActivityTypeByActivityType("Leave").getID());
		Criteria criteria = getStaffByActivityTypesInDateCriteria(fromDate)
				.add(Restrictions.not(Restrictions.in("activityType.ID",
						activityTypes.toArray())));
		return criteria.list();
	}

	@Override
	public List<Staff> findStaffNotAvailable(Date fromDate) {
		List<ActivityType> activityTypes = Arrays.asList(
				activityDao.findActivityTypeByActivityType("Break in Service"),
				activityDao.findActivityTypeByActivityType("Leave"));
		return findStaffByActivityTypesInDate(activityTypes, fromDate);
	}
	
	@Override
	public StaffRole findStaffRoleById(Integer staffRoleID) {
		return findById(StaffRole.class, staffRoleID);
	}

	@Override
	public List<StaffRole> findStaffRolesActiveInDate(Date activeDate) {
		return findByDurationAround(StaffRole.class, activeDate);
	}
	
	@Override
	public void saveStaff(Staff staff) {
		saveOrUpdate(staff);
	}
	
	@Override
	public void deleteStaffByIndex(Integer staffIndex) {
		deleteByPropertyEqual(Staff.class, "index", staffIndex);
	}
}
