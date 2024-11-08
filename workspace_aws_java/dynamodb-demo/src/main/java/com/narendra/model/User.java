package com.narendra.model;

import org.springframework.data.annotation.Id;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName ="dynamodb_table_name")
public class User {

	@Id
	@DynamoDBHashKey
	private String pattionkey;
	private String name;
	private Integer age;
	private String address;
	private String email;
	
	public User() {
		super();
	}

	public User(String pattionkey , String name) {
		super();
		this.pattionkey  = pattionkey ;
		this.name = name;
	}

	public User(String pattionkey, String name, Integer age, String address,String email) {
		super();
		this.pattionkey = pattionkey;
		this.name = name;
		this.age = age;
		this.address = address;
		this.email=email;
	}

	@DynamoDBHashKey
	public String getPattionkey() {
		return pattionkey;
	}
	public void setPattionkey(String pattionkey) {
		this.pattionkey = pattionkey;
	}

	@DynamoDBAttribute
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@DynamoDBAttribute
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@DynamoDBAttribute
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@DynamoDBAttribute
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [pattionkey=" + pattionkey + ", name=" + name + ", age=" + age + ", email=" + email + "]";
	}

}