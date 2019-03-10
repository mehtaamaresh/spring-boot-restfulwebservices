package com.amy.company.restfulwebservices.Resume.ResumeDaoRepositories;

import com.amy.company.restfulwebservices.Resume.ResumeBeans.SWOTAnalysisBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SWOTAnalyisDaoRepository extends JpaRepository<SWOTAnalysisBean, Integer> {
}
