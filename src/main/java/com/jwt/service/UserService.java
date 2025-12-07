package com.jwt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.models.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(), "Vikash", "vikash@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Rahul", "rahul@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Jay", "jay@gmail.com"));
	}
	
	public List<User> getUsers(){
		return this.store;
	}
	
}
