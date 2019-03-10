package com.amy.company.restfulwebservices.Resume.ResumeBeans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class EducationBean {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Integer educationId;
    private String degreeName;
    private String majorArea;
    private String universityName;
    private String universityAddress;
    private String completionYear; //

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private ResumeBean resume;

    public EducationBean() {}

    public EducationBean(Integer educationId, String degreeName, String majorArea, String universityName, String universityAddress, String completionYear, ResumeBean resume) {
        this.educationId = educationId;
        this.degreeName = degreeName;
        this.majorArea = majorArea;
        this.universityName = universityName;
        this.universityAddress = universityAddress;
        this.completionYear = completionYear;
        this.resume = resume;
    }

    public ResumeBean getResume() {
        return resume;
    }

    public void setResume(ResumeBean resume) {
        this.resume = resume;
    }

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getMajorArea() {
        return majorArea;
    }

    public void setMajorArea(String majorArea) {
        this.majorArea = majorArea;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    public String getCompletionYear() {
        return completionYear;
    }

    public void setCompletionYear(String completionYear) {
        this.completionYear = completionYear;
    }

    @Override
    public String toString() {
        return "EducationBean{" +
                "educationId=" + educationId +
                ", degreeName='" + degreeName + '\'' +
                ", majorArea='" + majorArea + '\'' +
                ", universityName='" + universityName + '\'' +
                ", universityAddress='" + universityAddress + '\'' +
                ", completionYear='" + completionYear + '\'' +
                '}';
    }
}
