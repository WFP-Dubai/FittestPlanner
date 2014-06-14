package org.wfp.fittest.service.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.repository.StaffRepository;
import org.wfp.fittest.service.StaffService;

@Service
@Transactional
public class StaffServiceImpl implements StaffService {

	@Autowired
	private StaffRepository staffRepository;
	@Autowired
	private SessionFactory sessionFactory;

	public StaffRepository getStaffRepository() {
		return staffRepository;
	}

	public void setStaffRepository(StaffRepository staffRepository) {
		this.staffRepository = staffRepository;
	}
	
	@Transactional
	public Iterable<Staff> findAllStaff() {
		return staffRepository.findAll();
	}
}
