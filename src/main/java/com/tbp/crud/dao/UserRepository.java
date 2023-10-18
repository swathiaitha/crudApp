package com.tbp.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tbp.crud.entity.UserData;

//@Component 
@Repository
public interface UserRepository extends JpaRepository<UserData, Integer> {

}
