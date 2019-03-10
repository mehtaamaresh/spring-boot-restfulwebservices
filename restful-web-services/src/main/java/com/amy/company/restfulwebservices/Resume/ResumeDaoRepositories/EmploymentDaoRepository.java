package com.amy.company.restfulwebservices.Resume.ResumeDaoRepositories;

import com.amy.company.restfulwebservices.Resume.ResumeBeans.EmploymentBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploymentDaoRepository extends JpaRepository<EmploymentBean, Integer> {
}
