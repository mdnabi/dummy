package com.lti.scholarship.app.repository;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Student;

@Repository
public class InstituteRepository extends GenericRepository {
	GenericRepository genericRepository;

	@Transactional
	public Institute fetchStateByInstituteCode(Class<Institute> clazz, String instituteCode) {
		Query q = entityManager.createQuery("select obj  from Institute as obj where obj.instituteCode=?1 ");// JPQL
		q.setParameter(1, instituteCode);
		Institute institute = (Institute) q.getSingleResult();
		// genericRepository.fetchStateByInstituteCode(Institute.class);
		return (Institute) genericRepository.fetchStateByInstituteCode(Institute.class);
	}

}
