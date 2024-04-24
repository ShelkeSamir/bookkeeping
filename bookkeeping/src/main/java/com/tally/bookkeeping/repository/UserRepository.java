package com.tally.bookkeeping.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tally.bookkeeping.entity.mongo.User;

public interface UserRepository extends MongoRepository<User, String> {

}
