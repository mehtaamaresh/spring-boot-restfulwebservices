package com.amy.company.restfulwebservices.Resume.ResumeControllers;

import com.amy.company.restfulwebservices.Resume.ResumeBeans.*;
import com.amy.company.restfulwebservices.Resume.ResumeDaoRepositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResumeController {

    @Autowired
    private ResumeDaoRepository resumeRepository;

    @Autowired
    private EducationDaoRepository educationRepository;

    @Autowired
    private ExperienceHistoryDaoRepository experienceHistoryRepository;

    @Autowired
    private ReferencesDaoRepository referencesRepository;

    @Autowired
    private EmploymentDaoRepository employmentRepository;

    @Autowired
    private SWOTAnalyisDaoRepository swotAnalysisRepository;

    @GetMapping(path="/restful-microservice-springboot/resume/amaresh-chandra")
    public List<ResumeBean> retrieveTheResume(){

        return resumeRepository.findAll();

    }
}
