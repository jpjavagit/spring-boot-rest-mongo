package com.spring.mongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mongo.entities.Movie;
import com.spring.mongo.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repository;
	
	public Movie saveMovie(Movie movie){
		return repository.save(movie);
	}
	
}
