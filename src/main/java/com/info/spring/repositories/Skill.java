package com.info.spring.repositories;

import com.info.spring.model.SkillModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Skill extends JpaRepository<SkillModel,Long> {
    List<SkillModel> findByName(String name);
}
