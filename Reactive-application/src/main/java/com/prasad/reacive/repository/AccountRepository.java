package com.prasad.reacive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prasad.reactive.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

	
}
