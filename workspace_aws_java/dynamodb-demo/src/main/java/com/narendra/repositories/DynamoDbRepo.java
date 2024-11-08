package com.narendra.repositories;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import com.narendra.model.User;

@EnableScan
public interface DynamoDbRepo extends CrudRepository<User, String> {

}