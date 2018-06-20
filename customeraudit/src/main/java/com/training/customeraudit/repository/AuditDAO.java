package com.training.customeraudit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.training.audit.Model.Audit;

public interface AuditDAO extends MongoRepository<Audit, Integer> {

}
