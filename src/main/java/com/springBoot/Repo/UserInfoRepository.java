package com.springBoot.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.model.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer>{

}
