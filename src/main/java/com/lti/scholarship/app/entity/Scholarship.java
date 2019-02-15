




package com.lti.scholarship.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_SCHOLARSHIP")
public class Scholarship {
	@Id
	private String adharNo;
	private String religion;
	private String communityCategory;
	private String fatherName;
	private String motherName;
	
	private String familyAnnualIncome;
	private String instituteName;
	private String presentCourse;
	private String presentClassYear;
	private String modeOfStudy;
	
	private String classStartDate;
	private String universityBoardName;
	private String previousClassCourse;
	private String previousPassingYear;
	private String previousClassPercent;
	
	private String tengthRollNo;
	private String tenthBoardName;
	private String tenthPassingYear;
	private String tenthPersentObtained;
	private String twelvthRollNo;
	
	private String twelvthBoardName;
	private String twelvthPassingYear;
	private String twelvthPersentObtained;
	private String admissionFee;
	private String tutionFee;
	
	private String otherFee;
	private String disability;
	private String disabilityType;
	private String persentOfDisability;
	private String meritalStatus;
	
	private String parentsProfession;
	private String state;
	private String district;
	private String blockOrTaluka;
	private String houseNo;
	
	private String streetNo;
	private String pinCode;
	private String scheme;
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getCommunityCategory() {
		return communityCategory;
	}
	public void setCommunityCategory(String communityCategory) {
		this.communityCategory = communityCategory;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFamilyAnnualIncome() {
		return familyAnnualIncome;
	}
	public void setFamilyAnnualIncome(String familyAnnualIncome) {
		this.familyAnnualIncome = familyAnnualIncome;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getPresentCourse() {
		return presentCourse;
	}
	public void setPresentCourse(String presentCourse) {
		this.presentCourse = presentCourse;
	}
	public String getPresentClassYear() {
		return presentClassYear;
	}
	public void setPresentClassYear(String presentClassYear) {
		this.presentClassYear = presentClassYear;
	}
	public String getModeOfStudy() {
		return modeOfStudy;
	}
	public void setModeOfStudy(String modeOfStudy) {
		this.modeOfStudy = modeOfStudy;
	}
	public String getClassStartDate() {
		return classStartDate;
	}
	public void setClassStartDate(String classStartDate) {
		this.classStartDate = classStartDate;
	}
	public String getUniversityBoardName() {
		return universityBoardName;
	}
	public void setUniversityBoardName(String universityBoardName) {
		this.universityBoardName = universityBoardName;
	}
	public String getPreviousClassCourse() {
		return previousClassCourse;
	}
	public void setPreviousClassCourse(String previousClassCourse) {
		this.previousClassCourse = previousClassCourse;
	}
	public String getPreviousPassingYear() {
		return previousPassingYear;
	}
	public void setPreviousPassingYear(String previousPassingYear) {
		this.previousPassingYear = previousPassingYear;
	}
	public String getPreviousClassPercent() {
		return previousClassPercent;
	}
	public void setPreviousClassPercent(String previousClassPercent) {
		this.previousClassPercent = previousClassPercent;
	}
	public String getTengthRollNo() {
		return tengthRollNo;
	}
	public void setTengthRollNo(String tengthRollNo) {
		this.tengthRollNo = tengthRollNo;
	}
	public String getTenthBoardName() {
		return tenthBoardName;
	}
	public void setTenthBoardName(String tenthBoardName) {
		this.tenthBoardName = tenthBoardName;
	}
	public String getTenthPassingYear() {
		return tenthPassingYear;
	}
	public void setTenthPassingYear(String tenthPassingYear) {
		this.tenthPassingYear = tenthPassingYear;
	}
	public String getTenthPersentObtained() {
		return tenthPersentObtained;
	}
	public void setTenthPersentObtained(String tenthPersentObtained) {
		this.tenthPersentObtained = tenthPersentObtained;
	}
	public String getTwelvthRollNo() {
		return twelvthRollNo;
	}
	public void setTwelvthRollNo(String twelvthRollNo) {
		this.twelvthRollNo = twelvthRollNo;
	}
	public String getTwelvthBoardName() {
		return twelvthBoardName;
	}
	public void setTwelvthBoardName(String twelvthBoardName) {
		this.twelvthBoardName = twelvthBoardName;
	}
	public String getTwelvthPassingYear() {
		return twelvthPassingYear;
	}
	public void setTwelvthPassingYear(String twelvthPassingYear) {
		this.twelvthPassingYear = twelvthPassingYear;
	}
	public String getTwelvthPersentObtained() {
		return twelvthPersentObtained;
	}
	public void setTwelvthPersentObtained(String twelvthPersentObtained) {
		this.twelvthPersentObtained = twelvthPersentObtained;
	}
	public String getAdmissionFee() {
		return admissionFee;
	}
	public void setAdmissionFee(String admissionFee) {
		this.admissionFee = admissionFee;
	}
	public String getTutionFee() {
		return tutionFee;
	}
	public void setTutionFee(String tutionFee) {
		this.tutionFee = tutionFee;
	}
	public String getOtherFee() {
		return otherFee;
	}
	public void setOtherFee(String otherFee) {
		this.otherFee = otherFee;
	}
	public String getDisability() {
		return disability;
	}
	public void setDisability(String disability) {
		this.disability = disability;
	}
	public String getDisabilityType() {
		return disabilityType;
	}
	public void setDisabilityType(String disabilityType) {
		this.disabilityType = disabilityType;
	}
	public String getPersentOfDisability() {
		return persentOfDisability;
	}
	public void setPersentOfDisability(String persentOfDisability) {
		this.persentOfDisability = persentOfDisability;
	}
	public String getMeritalStatus() {
		return meritalStatus;
	}
	public void setMeritalStatus(String meritalStatus) {
		this.meritalStatus = meritalStatus;
	}
	public String getParentsProfession() {
		return parentsProfession;
	}
	public void setParentsProfession(String parentsProfession) {
		this.parentsProfession = parentsProfession;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getBlockOrTaluka() {
		return blockOrTaluka;
	}
	public void setBlockOrTaluka(String blockOrTaluka) {
		this.blockOrTaluka = blockOrTaluka;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getScheme() {
		return scheme;
	}
	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	

}
