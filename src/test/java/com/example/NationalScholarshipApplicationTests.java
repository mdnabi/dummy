package com.example;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.lti.scholarship.app.NationalScholarshipApplication;
import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Scholarship;
import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.service.InstituteLoginService;
import com.lti.scholarship.app.service.InstituteService;
import com.lti.scholarship.app.service.ScholarshipService;
import com.lti.scholarship.app.service.StudentLoginService;
import com.lti.scholarship.app.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NationalScholarshipApplication.class)
@Rollback(false)
public class NationalScholarshipApplicationTests {
	@Autowired
	StudentService studentService;
	@Autowired
	InstituteService instituteService;
	@Autowired
	StudentLoginService studentLoginService;
	@Autowired
	InstituteLoginService instituteLonginService;
	@Autowired
	ScholarshipService scholarshipService;

	// To add StudentData into DataBase(Student Table)
	@Test
	@Transactional
	public void addStudent() {
		Student student = new Student();
		// RecordTo Check

		student.setStateOfDomicile("karnataka");
		student.setDistrict("bangalore");
		student.setName("susmitha");
		student.setDob("06/10/1996");
		student.setGender("Female");
		student.setMobileNo("6596592186");
		student.setEmail("susmitha123@gmail.com");
		student.setAdharNo("555406625373");
		student.setBankIfscCode("SBIN0000981");
		student.setBankAccNo("35533324570");
		student.setBankName("state bank of india");
		student.setPassword("112200");
		studentService.add(student);

		// RecordNo:1
		/*
		 * student.setStateOfDomicile("Andhra pradesh"); student.setDistrict("kurnool");
		 * student.setName("kolimi mahammad nabi"); student.setDob("06/06/1997");
		 * student.setGender("Male"); student.setMobileNo("8125507470");
		 * student.setEmail("mahammadnabi1995@gmail.com");
		 * student.setAdharNo("675406625373"); student.setBankIfscCode("SBIN0000981");
		 * student.setBankAccNo("30830024570");
		 * student.setBankName("state bank of india"); student.setPassword("112233");
		 * System.out.println("student test called"); studentService.add(student);
		 */
		// RecordNo:2
		/*
		 * student.setStateOfDomicile("Andhra pradesh"); student.setDistrict("kurnool");
		 * student.setName("kolimi md nabi"); student.setDob("06/06/1997");
		 * student.setGender("Male"); student.setMobileNo("6301220489");
		 * student.setEmail("mdnabi506@gmail.com"); student.setAdharNo("575406625376");
		 * student.setBankIfscCode("SBIN0000981"); student.setBankAccNo("30838824570");
		 * student.setBankName("state bank of india"); student.setPassword("112233");
		 * studentService.add(student);
		 */

		// RecordNo:3
		/*
		 * student.setStateOfDomicile("Andhra pradesh"); student.setDistrict("kurnool");
		 * student.setName("kolimi mahammad nishar"); student.setDob("02/05/2003");
		 * student.setGender("Male"); student.setMobileNo("9985732035");
		 * student.setEmail("mahammadnishar@gmail.com");
		 * student.setAdharNo("575406625373"); student.setBankIfscCode("SBIN0000981");
		 * student.setBankAccNo("30830024570");
		 * student.setBankName("state bank of india"); student.setPassword("112244");
		 * studentService.add(student);
		 */
	}

	// To Fetch Student Details Based on Id
	@Test
	@Transactional
	public void fetchById() {

		/*
		 * Student student = studentService.fetchById(141);
		 * assertEquals("675406625373",student.getAdharNo());
		 * assertEquals("mahammadnabi1995@gmail.com", student.getEmail());
		 * assertEquals("Andhra pradesh" , student.getStateOfDomicile());
		 */

		/*
		 * Student student = studentService.fetchById(143); assertEquals("575406625373",
		 * student.getAdharNo());
		 * assertEquals("mahammadnishar@gmail.com",student.getEmail());
		 * assertEquals("Andhra pradesh" ,student.getStateOfDomicile());
		 * assertEquals("9985732035" , student.getMobileNo());
		 */

		/*
		 * Student student = studentService.fetchById(142);
		 * assertEquals("575406625376",student.getAdharNo());
		 * assertEquals("mdnabi506@gmail.com",student.getEmail());
		 * assertEquals("06/06/1997" , student.getDob()); assertEquals("6301220489" ,
		 * student.getMobileNo());
		 */

	}

	// To Store Institute Details
	@Test
	@Transactional
	public void addInstitute() {
		Institute institute = new Institute();

		institute.setInstitutionCategory("educational institute");
		institute.setInstituteName("nist college");
		institute.setStateOfInstitute("andhra");
		institute.setDistrictOfInstitute("krishna");
		institute.setInstituteCode("ak2233");
		institute.setDiseCode("ap123456709");
		institute.setLocation("jupudi");
		institute.setInstituteType("education");
		institute.setAffiUniversityState("jntuk");
		institute.setAffiUniversityName("kakinada");
		institute.setAdmissionStartYear("2001");
		institute.setPassword("112266");
		institute.setInstituteEstCertificate("andhra pradesh");
		institute.setUniversityAffiCertificate("jntukakinida");
		institute.setInstituteAddress("vijayawada,jupudi");
		institute.setInstituteCity("vijayada");
		institute.setInstitutePinCode("512256");
		institute.setPrincipalName("Dr.Akbhar Khan");
		institute.setMobileNo("9985768999");
		institute.setTelephoneNo("51262322");
		instituteService.add(institute);

		/*
		 * institute.setInstitutionCategory("educational institute");
		 * institute.setInstituteName("nimra engg college");
		 * institute.setStateOfInstitute("andhra");
		 * institute.setDistrictOfInstitute("krishna");
		 * institute.setInstituteCode("ak1122"); institute.setDiseCode("ap123456789");
		 * institute.setLocation("jupudi"); institute.setInstituteType("education");
		 * institute.setAffiUniversityState("jntuk");
		 * institute.setAffiUniversityName("kakinada");
		 * institute.setAdmissionStartYear("1997"); institute.setPassword("112233");
		 * institute.setInstituteEstCertificate("andhra pradest");
		 * institute.setUniversityAffiCertificate("jntukakinida");
		 * institute.setInstituteAddress("vijayawada,jupudi");
		 * institute.setInstituteCity("vijayada");
		 * institute.setInstitutePinCode("512256");
		 * institute.setPrincipalName("Dr.DNM Raju");
		 * institute.setMobileNo("9985768967"); institute.setTelephoneNo("51262322");
		 * instituteService.add(institute);
		 */

		/*
		 * institute.setInstitutionCategory("educational institute");
		 * institute.setInstituteName("st.francis engg college");
		 * institute.setStateOfInstitute("maharastra");
		 * institute.setDistrictOfInstitute("mumbai");
		 * institute.setInstituteCode("ak1123"); institute.setDiseCode("mh123456789");
		 * institute.setLocation("borivali"); institute.setInstituteType("education");
		 * institute.setAffiUniversityState("maharastra");
		 * institute.setAffiUniversityName("mumbai");
		 * institute.setAdmissionStartYear("1996"); institute.setPassword("112244");
		 * institute.setInstituteEstCertificate("maharastra certified");
		 * institute.setUniversityAffiCertificate("mumbai");
		 * institute.setInstituteAddress("mumbai,airoli");
		 * institute.setInstituteCity("mumbai");
		 * institute.setInstitutePinCode("512246");
		 * institute.setPrincipalName("Dr.sincy"); institute.setMobileNo("8885768967");
		 * institute.setTelephoneNo("53262322"); instituteService.add(institute);
		 */

		/*
		 * institute.setInstitutionCategory("educational institute");
		 * institute.setInstituteName("nagarjuna engg college");
		 * institute.setStateOfInstitute("karnataka");
		 * institute.setDistrictOfInstitute("krishna");
		 * institute.setInstituteCode("ak1124"); institute.setDiseCode("ka123456789");
		 * institute.setLocation("venkata giri");
		 * institute.setInstituteType("education");
		 * institute.setAffiUniversityState("karnataka");
		 * institute.setAffiUniversityName("nagarjuna university");
		 * institute.setAdmissionStartYear("2001"); institute.setPassword("112255");
		 * institute.setInstituteEstCertificate("karnataka certified");
		 * institute.setUniversityAffiCertificate("nagurjana");
		 * institute.setInstituteAddress("madhugurki,devanahalli");
		 * institute.setInstituteCity("bangalore");
		 * institute.setInstitutePinCode("562110");
		 * institute.setPrincipalName("Dr.S.G.Ranga Raju");
		 * institute.setMobileNo("0867462700"); institute.setTelephoneNo("51262322");
		 * instituteService.add(institute);
		 */

	}

	// Fetching students based on InstituteId
	@Test
	@Transactional
	public void fetchStudentsByInstituteId() {
		instituteService.fetchStudentsByInstituteId("ak1123");

	}

	// To Fetch All The Students who Applied
	@Transactional
	@Test
	public void fetchAllStudents() {
		studentService.fetchAll();
	}

	// Fetching All Institutes
	@Transactional
	@Test
	public void fetchAllInstitutes() {
		instituteService.fetchAll();
	}

	// User Validation ByName And Password
	@Test
	@Transactional
	public void verifyValidUser() {
		// invalid user or password
		// studentLoginService.verify("Nani", "passWord");

		// valid user and login success
		studentLoginService.verify("kolimi md nabi", "112233");
	}

	@Test
	@Transactional
	public void verifyValidInstitute() {
		

		// valid institute and login success
		instituteLonginService.verifyInstitute("nimra engg college", "112233");
		//valid instituteCode and login success
	//	instituteLonginService.verifyInstitute("ak2233", "112266");
	}

	@Test
	@Transactional
	public void fetchByAdharAndPassword() {
		// Invalid details
		// studentLoginService.verify("4632429387959", "pass");
		// Valid Details
		studentLoginService.fetchByAdharAndPassword("575406625373", "112244");
		System.out.println("asasas");
	}

	@Test
	@Transactional
	public void addScholarship() {
		Scholarship scholarship = new Scholarship();
		/*scholarship.setAdharNo("675406625373");
		scholarship.setReligion("Islam");
		scholarship.setCommunityCategory("shaik");
		scholarship.setFatherName("k.ahammad vali");
		scholarship.setMotherName("k.noorjahan");

		scholarship.setFamilyAnnualIncome("150000");
		scholarship.setInstituteName("Nimra engg college");
		scholarship.setPresentCourse(" computer science and engg");//
		scholarship.setPresentClassYear("2");
		scholarship.setModeOfStudy("full-time");

		scholarship.setClassStartDate("05/06/2018");
		scholarship.setUniversityBoardName("jntuk");
		scholarship.setPreviousClassCourse("mpc");
		scholarship.setPreviousPassingYear("2018");
		scholarship.setPreviousClassPercent("74");

		scholarship.setTengthRollNo("1220128662");
		scholarship.setTenthBoardName("state board of andhrapradesh");
		scholarship.setTenthPassingYear("2012");//
		scholarship.setTenthPersentObtained("85");
		scholarship.setTwelvthRollNo("1411216691");

		scholarship.setTwelvthBoardName("board of intermediate education,a.p.");
		scholarship.setTwelvthPassingYear("2018");
		scholarship.setTwelvthPersentObtained("83");
		scholarship.setAdmissionFee("30000");
		scholarship.setTutionFee("15000");

		scholarship.setOtherFee("5000");
		scholarship.setDisability("no");
		scholarship.setDisabilityType("no");
		scholarship.setPersentOfDisability("0");
		scholarship.setMeritalStatus("unmarried");

		scholarship.setParentsProfession("farmer");
		scholarship.setState("andhra pradesh");
		scholarship.setDistrict("kurnool");
		scholarship.setBlockOrTaluka("pathikonda");
		scholarship.setHouseNo("7/93B");

		scholarship.setStreetNo("Mangaliveedhi");
		scholarship.setPinCode("518380");
		scholarship.setScheme("merit-scholarship");
*/
		scholarshipService.add(scholarship);
	}
	
	@Test
	@Transactional
	public void studentStatus() {
		
		
	}
	
	@Test
	@Transactional
	public void instituteStatus() {
		
		
	}

	

}
