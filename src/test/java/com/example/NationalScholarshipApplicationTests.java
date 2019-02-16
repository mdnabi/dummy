package com.example;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import com.lti.scholarship.app.NationalScholarshipApplication;
import com.lti.scholarship.app.entity.Institute;
import com.lti.scholarship.app.entity.Scholarship;
import com.lti.scholarship.app.entity.Student;
import com.lti.scholarship.app.service.InstituteLoginService;
import com.lti.scholarship.app.service.InstituteService;
import com.lti.scholarship.app.service.InstituteStatusService;
import com.lti.scholarship.app.service.ScholarshipService;
import com.lti.scholarship.app.service.StudentLoginService;
import com.lti.scholarship.app.service.StudentService;
import com.lti.scholarship.app.service.StudentStatusService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = NationalScholarshipApplication.class)
@Rollback(false)
@AutoConfigureTestDatabase(replace = Replace.NONE)
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
	@Autowired
	StudentStatusService studentStatusService;
	@Autowired
	InstituteStatusService instituteStatusService;

	// To add StudentData into DataBase(Student Table)
	@Test
	@Transactional // working
	public void addStudent() {
		Student student = new Student();
		// RecordTo Check

		/*
		 * student.setStateOfDomicile("karnataka"); student.setDistrict("bangalore");
		 * student.setName("susmitha"); student.setDob("06/10/1996");
		 * student.setGender("Female"); student.setMobileNo("6596592186");
		 * student.setEmail("susmitha123@gmail.com");
		 * student.setAdharNo("555406625373"); student.setBankIfscCode("SBIN0000981");
		 * student.setBankAccNo("35533324570");
		 * student.setBankName("state bank of india"); student.setPassword("112200");
		 * studentService.add(student);
		 */

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

		student.setStateOfDomicile("Andhra pradesh");
		student.setDistrict("kurnool");
		student.setName("kolimi md nabi");
		student.setDob("06/06/1997");
		student.setGender("Male");
		student.setMobileNo("6301220489");
		student.setEmail("mdnabi506@gmail.com");
		student.setAdharNo("575406625376");
		student.setBankIfscCode("SBIN0000981");
		student.setBankAccNo("30838824570");
		student.setBankName("state bank of india");
		student.setPassword("112233");
		studentService.add(student);

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
		 * Student student = studentService.fetchByAdharNo("555406625373");
		 * assertEquals("susmitha123@gmail.com", student.getEmail());
		 * assertEquals("karnataka", student.getStateOfDomicile());
		 */
		Student student = studentService.fetchByAdharNo("675406625373");
		assertEquals("mahammadnabi1995@gmail.com", student.getEmail());
		assertEquals("Andhra pradesh", student.getStateOfDomicile());
		assertEquals("8125507470", student.getMobileNo());

		/*
		 * Student student = studentService.fetchByAdharNo(575406625376);
		 * 
		 * assertEquals("mdnabi506@gmail.com",student.getEmail());
		 * assertEquals("06/06/1997" , student.getDob()); assertEquals("6301220489" ,
		 * student.getMobileNo());
		 */

	}

	// To Store Institute Details
	@Test
	@Transactional
	public void addInstitute() { // Working
		Institute institute = new Institute();

		/*
		 * institute.setInstitutionCategory("educational institute");
		 * institute.setInstituteName("nist college");
		 * institute.setStateOfInstitute("andhra");
		 * institute.setDistrictOfInstitute("krishna");
		 * institute.setInstituteCode("ak2233"); institute.setDiseCode("ap123456709");
		 * institute.setLocation("jupudi"); institute.setInstituteType("education");
		 * institute.setAffiUniversityState("jntuk");
		 * institute.setAffiUniversityName("kakinada");
		 * institute.setAdmissionStartYear("2001"); institute.setPassword("112266");
		 * institute.setInstituteEstCertificate("andhra pradesh");
		 * institute.setUniversityAffiCertificate("jntukakinida");
		 * institute.setInstituteAddress("vijayawada,jupudi");
		 * institute.setInstituteCity("vijayada");
		 * institute.setInstitutePinCode("512256");
		 * institute.setPrincipalName("Dr.Akbhar Khan");
		 * institute.setMobileNo("9985768999"); institute.setTelephoneNo("51262322");
		 * instituteService.add(institute);
		 */

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

		institute.setInstitutionCategory("educational institute");
		institute.setInstituteName("st.francis engg college");
		institute.setStateOfInstitute("maharastra");
		institute.setDistrictOfInstitute("mumbai");
		institute.setInstituteCode("ak1123");
		institute.setDiseCode("mh123456789");
		institute.setLocation("borivali");
		institute.setInstituteType("education");
		institute.setAffiUniversityState("maharastra");
		institute.setAffiUniversityName("mumbai");
		institute.setAdmissionStartYear("1996");
		institute.setPassword("112244");
		institute.setInstituteEstCertificate("maharastra certified");
		institute.setUniversityAffiCertificate("mumbai");
		institute.setInstituteAddress("mumbai,airoli");
		institute.setInstituteCity("mumbai");
		institute.setInstitutePinCode("512246");
		institute.setPrincipalName("Dr.sincy");
		institute.setMobileNo("8885768967");
		institute.setTelephoneNo("53262322");
		instituteService.add(institute);

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
	@Transactional // Working
	public void fetchStudentsByInstituteCode() {
		// instituteService.fetchStudentsByInstituteId("ak1123");
		instituteService.fetchStudentsByInstituteCode("ak1123");
	}

	// To Fetch All Students who are applied
	@Transactional
	@Test // Working //Working
	public void fetchAllStudents() {
		studentService.fetchAll();
	}

	// Fetching All Institutes
	@Transactional // Working
	@Test // Working
	public void fetchAllInstitutes() {
		instituteService.fetchAll();
	}

	// Fetching student by adharNo
	@Test // Working
	@Transactional
	public void fetchByAdharNo() {
		Student st = studentService.fetchByAdharNo("555406625373");
		System.out.println(st.getAdharNo());
	}

	@Test // Working
	@Transactional
	public void fetchByInstuteName() {
		// Student st=studentService.fetchByAdharNo("555406625373");
		Institute ist = instituteService.fetchInstituteByName("nist college");
		System.out.println(ist.getInstituteCity());
	}

	// User vlaidation

	@Test
	@Transactional // Working
	public void verifyValidUser() {
		Boolean flag = studentLoginService.verifyByUser("675406625373", "112233");
		System.out.println(flag.booleanValue());
	}

	@Test
	@Transactional
	public void 
() {

		// valid institute and login success
		instituteLonginService.verifyInstitute("nist college", "112266");
		// valid instituteCode and login success
		// instituteLonginService.verifyInstitute("ak2233", "112266");
	}

	@Test
	@Transactional
	public void addScholarship() {
		Scholarship scholarship = new Scholarship();
		/*
		 * scholarship.setAdharNo("675406625373"); scholarship.setReligion("Islam");
		 * scholarship.setCommunityCategory("shaik");
		 * scholarship.setFatherName("k.ahammad vali");
		 * scholarship.setMotherName("k.noorjahan");
		 * 
		 * scholarship.setFamilyAnnualIncome("150000");
		 * scholarship.setInstituteName("Nimra engg college");
		 * scholarship.setPresentCourse(" computer science and engg");//
		 * scholarship.setPresentClassYear("2");
		 * scholarship.setModeOfStudy("full-time");
		 * 
		 * scholarship.setClassStartDate("05/06/2018");
		 * scholarship.setUniversityBoardName("jntuk");
		 * scholarship.setPreviousClassCourse("mpc");
		 * scholarship.setPreviousPassingYear("2018");
		 * scholarship.setPreviousClassPercent("74");
		 * 
		 * scholarship.setTengthRollNo("1220128662");
		 * scholarship.setTenthBoardName("state board of andhrapradesh");
		 * scholarship.setTenthPassingYear("2012");//
		 * scholarship.setTenthPersentObtained("85");
		 * scholarship.setTwelvthRollNo("1411216691");
		 * 
		 * scholarship.setTwelvthBoardName("board of intermediate education,a.p.");
		 * scholarship.setTwelvthPassingYear("2018");
		 * scholarship.setTwelvthPersentObtained("83");
		 * scholarship.setAdmissionFee("30000"); scholarship.setTutionFee("15000");
		 * 
		 * scholarship.setOtherFee("5000"); scholarship.setDisability("no");
		 * scholarship.setDisabilityType("no"); scholarship.setPersentOfDisability("0");
		 * scholarship.setMeritalStatus("unmarried");
		 * 
		 * scholarship.setParentsProfession("farmer");
		 * scholarship.setState("andhra pradesh"); scholarship.setDistrict("kurnool");
		 * scholarship.setBlockOrTaluka("pathikonda"); scholarship.setHouseNo("7/93B");
		 * 
		 * scholarship.setStreetNo("Mangaliveedhi"); scholarship.setPinCode("518380");
		 * scholarship.setScheme("merit-scholarship");
		 */
		scholarshipService.add(scholarship);
	}

	/*
	 * @Test
	 * 
	 * @Transactional public void addStudentStatus() { // Working StudentStatus
	 * status=new StudentStatus(); Student student=new Student(); Institute
	 * institute=new Institute(); student.setAdharNo("555406625373");
	 * institute.setInstituteCode("ak1122"); status.setStudent(student);
	 * status.setStatus("yes"); status.setInstitute(institute);
	 * 
	 * studentStatusService.add(status); }
	 */

	// method belongs to ministry
	@Test // Working
	@Transactional
	public void fetchStateByInstituteCode() {
		Institute institute = instituteService.fetchStateByInstitueCode("ak1122");
		System.out.println(institute.getInstituteName());
	}

	// method belongs to state nodel
	@Test
	@Transactional
	public void studentStatus() {
		studentStatusService.studentStatus("675406625373", "ak1122");
	}

	// Method belongs to state nodel
	@Test
	@Transactional
	public void instituteStatus() {
		instituteStatusService.instituteStatus("ak2233", "yes");
	}

}
