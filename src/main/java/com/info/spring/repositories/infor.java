package com.info.spring.repositories;
import com.info.spring.model.info;
import org.springframework.data.jpa.repository.JpaRepository;


public interface infor extends JpaRepository<info,Long> {
    infor findById(int id);
}