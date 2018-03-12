package com.spring.mongo.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class Movie implements Serializable {

	private static final long serialVersionUID = -806933104362303405L;
	
	private Long id;
	private String movieName;
	private String executiveProducer;
	private String location;
	private Integer yearOfProduction;
	private BigDecimal budget;
	private List<Actor> actors;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getExecutiveProducer() {
		return executiveProducer;
	}

	public void setExecutiveProducer(String executiveProducer) {
		this.executiveProducer = executiveProducer;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(Integer yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public BigDecimal getBudget() {
		return budget;
	}

	public void setBudget(BigDecimal budget) {
		this.budget = budget;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
}
