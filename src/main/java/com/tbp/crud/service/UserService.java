package com.tbp.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tbp.crud.dao.UserRepository;
import com.tbp.crud.entity.UserData;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;


	public UserData createUser(UserData user) {
		return userRepository.save(user);
	}
	public List<UserData> createUsers(List<UserData> users){
		return userRepository.saveAll(users);
	}
	public UserData getUserById( int id) {
		return userRepository.findById(id).orElse(null);
	}
	public List<UserData> getUsers(){
		return userRepository.findAll();
	}
	public UserData updateUser(UserData user) {
		
		Optional<UserData> optionaluser= userRepository.findById(user.getId());

		if(optionaluser.isPresent())
		{
			UserData oldUser = optionaluser.get();
			oldUser.setName(user.getName());
			oldUser.setAddress(user.getAddress());
			userRepository.save(oldUser);
			return oldUser;
			
		}else {
			return new UserData();
		}
		
	}
		public String deleteUserById(int id) {
			userRepository.deleteById(id);
			return "user got deleted";
		
	}
}