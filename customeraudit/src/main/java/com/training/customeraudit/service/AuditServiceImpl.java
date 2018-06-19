package com.training.customeraudit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.audit.Model.Audit;
import com.training.customeraudit.repository.AuditDAO;

@Service
public class AuditServiceImpl implements AuditService {

	@Autowired
	AuditDAO auditDao;

	@Override
	public void addAudit(Audit audit) {

		auditDao.save(audit);
	}
}
