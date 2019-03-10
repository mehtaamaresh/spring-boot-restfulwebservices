package com.amy.company.restfulwebservices.Resume.ResumeBeans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class ReferencesBean {

    @Id
    @GeneratedValue
    private Integer referenceId;
    private String referenceName;
    private String referenceContactNumber;
    private String referenceEmailId;
    private String client;
    private String designation;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private ResumeBean resume;

    public ReferencesBean() {}

    public ReferencesBean(Integer referenceId, String referenceName, String referenceContactNumber, String referenceEmailId, String client, String designation, ResumeBean resume) {
        this.referenceId = referenceId;
        this.referenceName = referenceName;
        this.referenceContactNumber = referenceContactNumber;
        this.referenceEmailId = referenceEmailId;
        this.client = client;
        this.designation = designation;
        this.resume = resume;
    }

    public Integer getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(Integer referenceId) {
        this.referenceId = referenceId;
    }

    public ResumeBean getResume() {
        return resume;
    }

    public void setResume(ResumeBean resume) {
        this.resume = resume;
    }

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    public String getReferenceContactNumber() {
        return referenceContactNumber;
    }

    public void setReferenceContactNumber(String referenceContactNumber) {
        this.referenceContactNumber = referenceContactNumber;
    }

    public String getReferenceEmailId() {
        return referenceEmailId;
    }

    public void setReferenceEmailId(String referenceEmailId) {
        this.referenceEmailId = referenceEmailId;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "ReferencesBean{" +
                "referenceId=" + referenceId +
                ", referenceName='" + referenceName + '\'' +
                ", referenceContactNumber='" + referenceContactNumber + '\'' +
                ", referenceEmailId='" + referenceEmailId + '\'' +
                ", client='" + client + '\'' +
                ", designation='" + designation + '\'' +
                ", resume=" + resume +
                '}';
    }
}
