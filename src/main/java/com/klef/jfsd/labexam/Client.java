package com.klef.jfsd.labexam;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {
	  	@Id
	    @GeneratedValue
	    private int id;

	    private String name;
	    private String gender;
	    private int age;
	    private String location;
	    private String email;
	    private String mobileNumber;

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getMobileNumber() {
	        return mobileNumber;
	    }

	    public void setMobileNumber(String mobileNumber) {
	        this.mobileNumber = mobileNumber;
	    }

	    @Override
	    public String toString() {
	        return "Client [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age +
	                ", location=" + location + ", email=" + email + ", mobileNumber=" + mobileNumber + "]";
	    }
}