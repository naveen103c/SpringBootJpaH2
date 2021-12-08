package com.springBoot.service;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

import com.springBoot.model.UserInfo;
import com.springBoot.model.UserRecord;
import com.springBoot.Repo.UserInfoRepository;
import com.springBoot.Repo.UserRepo;
@Service
public class UserService {
	private UserRepo userRepo;
	private final UserInfoRepository userInfoRepository;
	
	public UserService(UserRepo userRepo,UserInfoRepository userInfoRepository) {
		super();
		this.userRepo = userRepo;
		this.userInfoRepository = userInfoRepository;
	}

	public List<UserRecord> getAllUsers(){
		List<UserRecord> userList=new ArrayList<>();
		userRepo.findAll().forEach(userList::add);
		return userList;
	}

    public List<UserInfo> getUsers() {
        return userInfoRepository.findAll();
    }

    public UserInfo createUser(UserInfo userInfo) {
        return userInfoRepository.save(userInfo);
    }

}
