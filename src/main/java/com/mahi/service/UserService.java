package com.mahi.service;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//import com.mahi.model.User;
//import com.mahi.model.User;
import com.mahi.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {
	
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
//		User user = ur.findByUserName(username);
//		System.out.println(user);
		return new User("mahi","1122",new ArrayList<>());
//		return new org.springframework.security.core.userdetails.User("mahi","1122",new ArrayList<>());   
	}

	
	

	

	
}
