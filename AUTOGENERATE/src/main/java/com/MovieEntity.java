package com;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="movies")
public class MovieEntity {
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String sn;
	private String name;
//	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String movieid;
//	private int webseriesid;
}
