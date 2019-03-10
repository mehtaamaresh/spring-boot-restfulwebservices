package com.amy.company.restfulwebservices.Resume.ResumeDaoRepositories;

import com.amy.company.restfulwebservices.Resume.ResumeBeans.ResumeBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResumeDaoRepository extends JpaRepository<ResumeBean, Integer> {

}
