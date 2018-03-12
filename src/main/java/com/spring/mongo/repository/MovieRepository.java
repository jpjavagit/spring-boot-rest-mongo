package com.spring.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.entities.Movie;

public interface MovieRepository extends MongoRepository<Movie, Long> {
	
}
