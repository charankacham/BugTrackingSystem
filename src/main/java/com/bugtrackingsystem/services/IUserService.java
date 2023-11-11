package com.bugtrackingsystem.services;


import org.springframework.stereotype.Service;

import com.bugtrackingsystem.dto.UserDTO;
import com.bugtrackingsystem.models.User;

@Service
public interface IUserService {
	User registerUser(User user);

	User signIn(User user);

	String signOut();
}
