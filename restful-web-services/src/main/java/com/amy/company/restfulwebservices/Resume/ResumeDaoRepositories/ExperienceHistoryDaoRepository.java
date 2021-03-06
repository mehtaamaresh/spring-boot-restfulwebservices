package com.amy.company.restfulwebservices.Resume.ResumeDaoRepositories;

import com.amy.company.restfulwebservices.Resume.ResumeBeans.ExperienceHistoryBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceHistoryDaoRepository extends JpaRepository<ExperienceHistoryBean, Integer> {
}
