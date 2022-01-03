package com.info.spring.repositories;

import com.info.spring.model.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Account extends JpaRepository<AccountModel,Long> {
     AccountModel findByUsername(String username);
}
