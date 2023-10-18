package com.tbp.crud.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserData {
	
@Id
@GeneratedValue
private int id;
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public void setId(int id) {
	this.id = id;
}
public void setName(Object object) {
	this.name = (String) object;
}
private	String name;
private String address;
public Integer getId() {
	// TODO Auto-generated method stub
	return id;
}
public Object getName() {
	// TODO Auto-generated method stub
	return name;
}


}