/**
 * 
 */
package com.training.customeraudit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.training.audit.Model.Audit;
import com.training.customeraudit.service.AuditService;

/**
 * @author tuhindas
 *
 */
@RestController
@RequestMapping("/audit")
public class AuditController {

	@Autowired
	AuditService auditService;

	ResponseEntity<?> addAudit(Audit audit) {
		try {
			auditService.addAudit(audit);
			return new ResponseEntity<Audit>(audit, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
		}
	}
}
