package com.amy.company.restfulwebservices.Resume.ResumeDaoRepositories;

import com.amy.company.restfulwebservices.Resume.ResumeBeans.ReferencesBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferencesDaoRepository extends JpaRepository<ReferencesBean, Integer> {
}
