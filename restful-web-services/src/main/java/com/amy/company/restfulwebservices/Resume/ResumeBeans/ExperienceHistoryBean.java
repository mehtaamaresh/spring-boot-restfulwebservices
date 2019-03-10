package com.amy.company.restfulwebservices.Resume.ResumeBeans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class ExperienceHistoryBean {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Integer experienceHistoryId;

    private String clientName;
    private String location;
    private String projectName;
    @Column(length = 1500)
    private String projectDescription;
    @Column(length = 500)
    private String environment;
    private String projectDuration;
    private String rolesAndResponsibility;
    @Column(length = 3500)
    private String contribution;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private EmploymentBean employment;

    public ExperienceHistoryBean() {}

    public ExperienceHistoryBean(Integer experienceHistoryId, String clientName, String location, String projectName, String projectDescription, String environment, String projectDuration, String rolesAndResponsibility, String contribution, EmploymentBean employment) {
        this.experienceHistoryId = experienceHistoryId;
        this.clientName = clientName;
        this.location = location;
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.environment = environment;
        this.projectDuration = projectDuration;
        this.rolesAndResponsibility = rolesAndResponsibility;
        this.contribution = contribution;
        this.employment = employment;
    }

    public Integer getExperienceHistoryId() {
        return experienceHistoryId;
    }

    public void setExperienceHistoryId(Integer experienceHistoryId) {
        this.experienceHistoryId = experienceHistoryId;
    }

    public EmploymentBean getEmployment() {
        return employment;
    }

    public void setEmployment(EmploymentBean employment) {
        this.employment = employment;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getProjectDuration() {
        return projectDuration;
    }

    public void setProjectDuration(String projectDuration) {
        this.projectDuration = projectDuration;
    }

    public String getRolesAndResponsibility() {
        return rolesAndResponsibility;
    }

    public void setRolesAndResponsibility(String rolesAndResponsibility) {
        this.rolesAndResponsibility = rolesAndResponsibility;
    }

    public String getContribution() {
        return contribution;
    }

    public void setContribution(String contribution) {
        this.contribution = contribution;
    }

    @Override
    public String toString() {
        return "ExperienceHistoryBean{" +
                "experienceHistoryId=" + experienceHistoryId +
                ", clientName='" + clientName + '\'' +
                ", location='" + location + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", environment='" + environment + '\'' +
                ", projectDuration='" + projectDuration + '\'' +
                ", rolesAndResponsibility='" + rolesAndResponsibility + '\'' +
                ", contribution='" + contribution + '\'' +
                ", employment=" + employment +
                '}';
    }
}
