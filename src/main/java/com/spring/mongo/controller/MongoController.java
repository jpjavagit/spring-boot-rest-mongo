package com.spring.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.entities.Movie;
import com.spring.mongo.services.MovieService;

@RestController
public class MongoController {
	
	@Autowired
	private MovieService service;
	
	@RequestMapping(value= "/", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Movie mongoRequest(@RequestBody Movie movie){
		Movie obj = service.saveMovie(movie);
		return obj;
	}
	
}
