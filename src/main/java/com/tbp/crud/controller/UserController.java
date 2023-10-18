package com.tbp.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tbp.crud.entity.UserData;
import com.tbp.crud.service.UserService;
// i am testing github
//hurray we did it
@RestController
public class UserController {
	
@Autowired
private UserService userService;


	@PostMapping("/addUser")
	public UserData addUser(@RequestBody UserData user)
	{
	return userService.createUser(user);
}
	
@PostMapping("/addUsers")
public List<UserData> addUsers(@RequestBody List <UserData> users) 
{
	return userService.createUsers(users);
	
}


@GetMapping("/")
public String test() {
	return "test";
}

@GetMapping("/user/{id}")
public UserData getUserById(@PathVariable int id)
{
	return userService.getUserById(id);
}

@GetMapping("/users")
public List<UserData> getAllUsers()
{
	return userService.getUsers();
}

@PutMapping("/updateUser")
public UserData updateUser(@RequestBody UserData user) 
{
	return userService.updateUser(user);
}

@DeleteMapping("/user/{id}")
public String deleteUser(@PathVariable int id)
{
	return userService.deleteUserById(id);
}
}