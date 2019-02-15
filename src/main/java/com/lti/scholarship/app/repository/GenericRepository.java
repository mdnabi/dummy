package com.lti.scholarship.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Student;

@Component
public class GenericRepository<E> {

	@PersistenceContext
	protected EntityManager entityManager;

	@Transactional
	public Student stores(Object obj) {
		return (Student) entityManager.merge(obj);

	}

	@Transactional
	public Institute store(Object obj) {
		return (Institute) entityManager.merge(obj);

	}

	@Transactional
	public <E> E fetchById(Class<E> classname, Object pk) {
		E e = entityManager.find(classname, pk);
		return e;
	}
	

	@Transactional
	public <E> List<E> fetchAllByInstituteId(Class<E> clazz, String instituteCode) {
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
	public <E> E fetchInstituteByStudentId( int sid) {
		System.out.println("generic ");
		Query q = entityManager.createQuery(
				"select institute.INSTITUTE_CODE  from tbl_institute institute,tbl_student student where student_id="+sid);
		return (E) q.getSingleResult();
	}

	@Transactional
	public Boolean verify(String userid, String password) {
		System.out.println("@generic out repository");
		List<Student> students = fetchAll(Student.class);
		boolean flag = false;
		for (Student student : students) {
			if (userid.equals(student.getName()) & password.equals(student.getPassword())) {
				flag = true;
			}
		}
		if (flag == true) {
			System.out.println("LoginSuccessFull...!");
			System.out.println("Welcome...!" + userid);
		}
		if (flag == false) {
			System.out.println("Sorry ..User Name or Password in correct");
		}
		return flag;
	}
	@Transactional
	public Boolean verifyInstitute(String userid, String password) {
		System.out.println("@generic out repository");
		List<Institute> institutes = fetchAll(Institute.class);
		boolean flag = false;
		for (Institute institute : institutes) {
			if (userid.equals(institute.getInstituteName()) && password.equals(institute.getPassword()) || userid.equals(institute.getInstituteCode()) && password.equals(institute.getPassword())) {
				flag = true;
			}
		}
		if (flag == true) {
			System.out.println("LoginSuccessFull...!");
			System.out.println("Welcome...!" + userid);
		}
		if (flag == false) {
			System.out.println("Sorry ..InstuteCode/ Name or Password in correct...!");
		}
		return flag;
	}

	@Transactional
	public Boolean fetchByAdharAndPassword(String adhar, String password) {
		List<Student> students = fetchAll(Student.class);
		boolean flag = false;
		for (Student student : students) {

			if (adhar.equals(student.getAdharNo()) & password.equals(student.getPassword())) {
				flag = true;
			}
		}
		if (flag == true) {
			System.out.println("UserExist...!");
		
		}
		if (flag == false) {
			System.out.println("Sorry ..User Not exist");
		}
		return flag;
	}
	
	
		
	@Transactional
	public Boolean status(int userid) {
		System.out.println("@generic out repository");
		List<Student> students = fetchAll(Student.class);
		boolean flag = false;
		for (Student student : students) {
			
			if(userid==student.getStudent_id()) {
				flag = true;
		}
			
		if (flag == true) {
			System.out.println("LoginSuccessFull...!");
			System.out.println("Welcome...!" + userid);
		}
		if (flag == false) {
			System.out.println("Sorry ..User Name or Password in correct");
		}
		
	}
		return flag;
	
	
	
}}
