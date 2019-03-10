package com.amy.company.restfulwebservices.Resume.ResumeBeans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class ResumeBean {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Integer resumeId;
    private String name;
    private String dateOfBirth; //
    private String residentialAddress;
    private String emailAddress;
    private String mobileNumber;
    private String linkedinId;
    private String skypeId;
    @Column(length = 1000)
    private String resumeSummary;
    private String keySkills;
    private String currentEmployer;

    private String legalStatus;
    private double timeSpendOnLegalStatus;
    private String firstPortOfEntryDate; //
    private String passportNumber;
    private String last4DigitSSN;
    private String i140Status;

    private String lookingFor;
    private String expectedSalaryRange;
    private String relocationConstraint;
    private String bestTimeToReach;
    private String howSoonAvailable;
    private String reasonForChange;
    private String availabilityForInterview;

    @OneToMany(mappedBy = "resume")
    private List<EducationBean> education;
    @OneToMany(mappedBy = "resume")
    private List<EmploymentBean> employment;
    @OneToMany(mappedBy = "resume")
    private List<ReferencesBean> references;
    @OneToMany(mappedBy = "resume")
    private List<SWOTAnalysisBean> swotAnalysis;

    public ResumeBean() {}

    public ResumeBean(Integer resumeId, String name, String dateOfBirth, String residentialAddress, String emailAddress, String mobileNumber, String linkedinId, String skypeId, String resumeSummary, String keySkills, String currentEmployer, String legalStatus, double timeSpendOnLegalStatus, String firstPortOfEntryDate, String passportNumber, String last4DigitSSN, String i140Status, String lookingFor, String expectedSalaryRange, String relocationConstraint, String bestTimeToReach, String howSoonAvailable, String reasonForChange, String availabilityForInterview, List<EducationBean> education, List<EmploymentBean> employment, List<ReferencesBean> references, List<SWOTAnalysisBean> swotAnalysis) {
        this.resumeId = resumeId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.residentialAddress = residentialAddress;
        this.emailAddress = emailAddress;
        this.mobileNumber = mobileNumber;
        this.linkedinId = linkedinId;
        this.skypeId = skypeId;
        this.resumeSummary = resumeSummary;
        this.keySkills = keySkills;
        this.currentEmployer = currentEmployer;
        this.legalStatus = legalStatus;
        this.timeSpendOnLegalStatus = timeSpendOnLegalStatus;
        this.firstPortOfEntryDate = firstPortOfEntryDate;
        this.passportNumber = passportNumber;
        this.last4DigitSSN = last4DigitSSN;
        this.i140Status = i140Status;
        this.lookingFor = lookingFor;
        this.expectedSalaryRange = expectedSalaryRange;
        this.relocationConstraint = relocationConstraint;
        this.bestTimeToReach = bestTimeToReach;
        this.howSoonAvailable = howSoonAvailable;
        this.reasonForChange = reasonForChange;
        this.availabilityForInterview = availabilityForInterview;
        this.education = education;
        this.employment = employment;
        this.references = references;
        this.swotAnalysis = swotAnalysis;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLinkedinId() {
        return linkedinId;
    }

    public void setLinkedinId(String linkedinId) {
        this.linkedinId = linkedinId;
    }

    public String getSkypeId() {
        return skypeId;
    }

    public void setSkypeId(String skypeId) {
        this.skypeId = skypeId;
    }

    public String getResumeSummary() {
        return resumeSummary;
    }

    public void setResumeSummary(String resumeSummary) {
        this.resumeSummary = resumeSummary;
    }

    public String getKeySkills() {
        return keySkills;
    }

    public void setKeySkills(String keySkills) {
        this.keySkills = keySkills;
    }

    public String getCurrentEmployer() {
        return currentEmployer;
    }

    public void setCurrentEmployer(String currentEmployer) {
        this.currentEmployer = currentEmployer;
    }

    public String getLegalStatus() {
        return legalStatus;
    }

    public void setLegalStatus(String legalStatus) {
        this.legalStatus = legalStatus;
    }

    public double getTimeSpendOnLegalStatus() {
        return timeSpendOnLegalStatus;
    }

    public void setTimeSpendOnLegalStatus(double timeSpendOnLegalStatus) {
        this.timeSpendOnLegalStatus = timeSpendOnLegalStatus;
    }

    public String getFirstPortOfEntryDate() {
        return firstPortOfEntryDate;
    }

    public void setFirstPortOfEntryDate(String firstPortOfEntryDate) {
        this.firstPortOfEntryDate = firstPortOfEntryDate;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getLast4DigitSSN() {
        return last4DigitSSN;
    }

    public void setLast4DigitSSN(String last4DigitSSN) {
        this.last4DigitSSN = last4DigitSSN;
    }

    public String getI140Status() {
        return i140Status;
    }

    public void setI140Status(String i140Status) {
        this.i140Status = i140Status;
    }

    public String getLookingFor() {
        return lookingFor;
    }

    public void setLookingFor(String lookingFor) {
        this.lookingFor = lookingFor;
    }

    public String getExpectedSalaryRange() {
        return expectedSalaryRange;
    }

    public void setExpectedSalaryRange(String expectedSalaryRange) {
        this.expectedSalaryRange = expectedSalaryRange;
    }

    public String getRelocationConstraint() {
        return relocationConstraint;
    }

    public void setRelocationConstraint(String relocationConstraint) {
        this.relocationConstraint = relocationConstraint;
    }

    public String getBestTimeToReach() {
        return bestTimeToReach;
    }

    public void setBestTimeToReach(String bestTimeToReach) {
        this.bestTimeToReach = bestTimeToReach;
    }

    public String getHowSoonAvailable() {
        return howSoonAvailable;
    }

    public void setHowSoonAvailable(String howSoonAvailable) {
        this.howSoonAvailable = howSoonAvailable;
    }

    public String getReasonForChange() {
        return reasonForChange;
    }

    public void setReasonForChange(String reasonForChange) {
        this.reasonForChange = reasonForChange;
    }

    public String getAvailabilityForInterview() {
        return availabilityForInterview;
    }

    public void setAvailabilityForInterview(String availabilityForInterview) {
        this.availabilityForInterview = availabilityForInterview;
    }

    public List<EducationBean> getEducation() {
        return education;
    }

    public void setEducation(List<EducationBean> education) {
        this.education = education;
    }

    public List<EmploymentBean> getEmployment() {
        return employment;
    }

    public void setEmployment(List<EmploymentBean> employment) {
        this.employment = employment;
    }

    public List<ReferencesBean> getReferences() {
        return references;
    }

    public void setReferences(List<ReferencesBean> references) {
        this.references = references;
    }

    public List<SWOTAnalysisBean> getSwotAnalysis() {
        return swotAnalysis;
    }

    public void setSwotAnalysis(List<SWOTAnalysisBean> swotAnalysis) {
        this.swotAnalysis = swotAnalysis;
    }

    @Override
    public String toString() {
        return "ResumeBean{" +
                "resumeId=" + resumeId +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", residentialAddress='" + residentialAddress + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", linkedinId='" + linkedinId + '\'' +
                ", skypeId='" + skypeId + '\'' +
                ", resumeSummary='" + resumeSummary + '\'' +
                ", keySkills='" + keySkills + '\'' +
                ", currentEmployer='" + currentEmployer + '\'' +
                ", legalStatus='" + legalStatus + '\'' +
                ", timeSpendOnLegalStatus=" + timeSpendOnLegalStatus +
                ", firstPortOfEntryDate='" + firstPortOfEntryDate + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", last4DigitSSN='" + last4DigitSSN + '\'' +
                ", i140Status='" + i140Status + '\'' +
                ", lookingFor='" + lookingFor + '\'' +
                ", expectedSalaryRange='" + expectedSalaryRange + '\'' +
                ", relocationConstraint='" + relocationConstraint + '\'' +
                ", bestTimeToReach='" + bestTimeToReach + '\'' +
                ", howSoonAvailable='" + howSoonAvailable + '\'' +
                ", reasonForChange='" + reasonForChange + '\'' +
                ", availabilityForInterview='" + availabilityForInterview + '\'' +
                ", education=" + education +
                ", employment=" + employment +
                ", references=" + references +
                ", swotAnalysis=" + swotAnalysis +
                '}';
    }
}
