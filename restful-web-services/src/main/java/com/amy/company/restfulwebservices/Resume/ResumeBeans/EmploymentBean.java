package com.amy.company.restfulwebservices.Resume.ResumeBeans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class EmploymentBean {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Integer employmentId;
    private String employerName;
    private String employerSince;
    private String baseLocation;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private ResumeBean resume;

    @OneToMany(mappedBy = "employment")
    private List<ExperienceHistoryBean> experienceHistories;

    public EmploymentBean() {}

    public EmploymentBean(Integer employmentId, String employerName, String employerSince, String baseLocation, ResumeBean resume, List<ExperienceHistoryBean> experienceHistories) {
        this.employmentId = employmentId;
        this.employerName = employerName;
        this.employerSince = employerSince;
        this.baseLocation = baseLocation;
        this.resume = resume;
        this.experienceHistories = experienceHistories;
    }

    public Integer getEmploymentId() {
        return employmentId;
    }

    public void setEmploymentId(Integer employmentId) {
        this.employmentId = employmentId;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerSince() {
        return employerSince;
    }

    public void setEmployerSince(String employerSince) {
        this.employerSince = employerSince;
    }

    public String getBaseLocation() {
        return baseLocation;
    }

    public void setBaseLocation(String baseLocation) {
        this.baseLocation = baseLocation;
    }

    public ResumeBean getResume() {
        return resume;
    }

    public void setResume(ResumeBean resume) {
        this.resume = resume;
    }

    public List<ExperienceHistoryBean> getExperienceHistories() {
        return experienceHistories;
    }

    public void setExperienceHistories(List<ExperienceHistoryBean> experienceHistories) {
        this.experienceHistories = experienceHistories;
    }

    @Override
    public String toString() {
        return "EmploymentBean{" +
                "employmentId=" + employmentId +
                ", employerName='" + employerName + '\'' +
                ", employerSince='" + employerSince + '\'' +
                ", baseLocation='" + baseLocation + '\'' +
                ", resume=" + resume +
                ", experienceHistories=" + experienceHistories +
                '}';
    }
}
