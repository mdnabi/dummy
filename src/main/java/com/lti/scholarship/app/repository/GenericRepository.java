package com.lti.scholarship.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Rollback;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Student;

@Rollback(false)
@Component
public class GenericRepository {

	@PersistenceContext
	protected EntityManager entityManager;

	@Transactional
	public Object store(Object obj) {
		return entityManager.merge(obj);
	}

	
	@Transactional
	public Student fetchStudentByAdharNo(Class<Student> clazz,String adharNo) {
		System.out.println("generic called");
		Query q = entityManager.createQuery(
				"select obj  from Student as obj where obj.adharNo=?1 ");// JPQL
		q.setParameter(1, adharNo);
		System.out.println("adhar querry exicuted");
		return (Student) q.getSingleResult();	
	}
	@Transactional
	public Institute fetchStateByInstituteCode(Class<Institute> clazz,String instituteCode) {
		Query q = entityManager.createQuery(
				"select obj  from Institute as obj where obj.instituteCode=?1 ");// JPQL
		q.setParameter(1, instituteCode);
		 Institute i = (Institute)q.getSingleResult();
		 System.out.println(i);
		 return i;
	}
	
	@Transactional
	public  Object fetchStateByInstituteCode(Class<Institute> clazz) {
		String name;
	Object object= name=clazz.getName();
		return  object;
	}
	
	@Transactional
	public Institute fetchInstituteByName(Class<Institute> clazz,String instituteName) {
		Query q = entityManager.createQuery(
				"select obj  from Institute as obj where obj.instituteName=?1 ");// JPQL
		q.setParameter(1, instituteName);
		return (Institute) q.getSingleResult();
	}
	
	

	@Transactional
	public <E> List<Student> fetchAllByInstituteCode(Class<E> clazz, String instituteCode) {
		System.out.println("generic ");
		Query q = entityManager.createQuery(
				"select obj  from " + clazz.getName() + " as obj where instituteCode=" + "'" + instituteCode + "'");// JPQL
		return q.getResultList();
	}

	@Transactional
	public <E> List<E> fetchAll(Class<E> clazz) {
		Query q = entityManager.createQuery("select obj  from " + clazz.getName() + " as obj");// JPQL
		return q.getResultList();
	}
	
	
	
	@Transactional
	public <E> List<E> fetchInstituteByState( String state) {
		Query q = entityManager.createQuery(
				"select institute.INSTITUTE_CODE  from Institute institute,tbl_student student where state=?");
		q.setParameter(0,state);
		return (List<E>) q.getSingleResult();
	}

	
	
	
	@Transactional
	public Boolean verify(Boolean object) {
		return object;	
	}

	/*@Transactional
	public Boolean fetchByAdharAndPassword(Object obj) {


		return flag;
	}*/
	
	
		
	@Transactional
	public Boolean status(String adno) {
		System.out.println("@generic out repository");
		List<Student> students = fetchAll(Student.class);
		boolean flag = false;
		for (Student student : students) {
			
			if(adno==student.getAdharNo()) {
				flag = true;
		}
			
		if (flag == true) {
			System.out.println("LoginSuccessFull...!");
			System.out.println("Welcome...!" + adno);
		}
		if (flag == false) {
			System.out.println("Sorry ..User Name or Password in correct");
		}
		
	}
		return flag;	
}

	
	
}
