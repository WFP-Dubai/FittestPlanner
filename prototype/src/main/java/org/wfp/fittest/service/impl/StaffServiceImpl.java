package org.wfp.fittest.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.wfp.fittest.service.StaffService;

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class StaffServiceImpl implements StaffService {

}
