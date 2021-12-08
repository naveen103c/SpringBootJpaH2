package com.springBoot.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.model.UserRecord;

public interface UserRepo extends JpaRepository<UserRecord, Integer>{

}
