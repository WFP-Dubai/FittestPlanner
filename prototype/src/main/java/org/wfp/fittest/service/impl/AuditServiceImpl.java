package org.wfp.fittest.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wfp.fittest.service.AuditService;

@Service
@Transactional(readOnly = true)
public class AuditServiceImpl implements AuditService {

}
