package com.amy.company.restfulwebservices.Resume.ResumeBeans;

import com.amy.company.restfulwebservices.Resume.SWOTEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class SWOTAnalysisBean {

    @Id
    @GeneratedValue
    private Integer swotId;
    private SWOTEnum swotEnum;
    private String description;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private ResumeBean resume;

    public SWOTAnalysisBean() {}

    public SWOTAnalysisBean(Integer swotId, SWOTEnum swotEnum, String description, ResumeBean resume) {
        this.swotId = swotId;
        this.swotEnum = swotEnum;
        this.description = description;
        this.resume = resume;
    }

    public Integer getSwotId() {
        return swotId;
    }

    public void setSwotId(Integer swotId) {
        this.swotId = swotId;
    }

    public ResumeBean getResume() {
        return resume;
    }

    public void setResume(ResumeBean resume) {
        this.resume = resume;
    }

    public SWOTEnum getSwotEnum() {
        return swotEnum;
    }

    public void setSwotEnum(SWOTEnum swotEnum) {
        this.swotEnum = swotEnum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SWOTAnalysisBean{" +
                "swotId=" + swotId +
                ", swotEnum=" + swotEnum +
                ", description='" + description + '\'' +
                ", resume=" + resume +
                '}';
    }
}
