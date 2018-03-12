package com.spring.mongo.entities;

import java.io.Serializable;
import java.math.BigDecimal;

public class Actor implements Serializable{

	private static final long serialVersionUID = 8697539642740304881L;
	
	private Long id;
	private String name;
	private String city;
	private BigDecimal winnings;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public BigDecimal getWinnings() {
		return winnings;
	}
	public void setWinnings(BigDecimal winnings) {
		this.winnings = winnings;
	}
}
