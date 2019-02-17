package com.lti.scholarship.app.repository;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.scholarship.app.entity.Scholarship;

@Repository
public class ScholarshipRepository extends GenericRepository {
	private GenericRepository genericRepository;

	@Transactional
	public void add(Scholarship scholarship) {
		genericRepository.store(scholarship);
	}
}
