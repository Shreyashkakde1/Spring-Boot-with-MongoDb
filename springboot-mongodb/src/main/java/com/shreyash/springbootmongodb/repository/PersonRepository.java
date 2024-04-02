package com.shreyash.springbootmongodb.repository;

import com.shreyash.springbootmongodb.collections.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<Long, Person> {
}
