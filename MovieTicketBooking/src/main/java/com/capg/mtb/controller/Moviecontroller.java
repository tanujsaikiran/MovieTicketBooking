package com.capg.mtb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capg.mtb.model.Movie;
import com.capg.mtb.service.IMovieService;

public class Moviecontroller {

	@Autowired
	IMovieService movieServ;
	
	
	@PostMapping("/addmovie")
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
		return null;
	}
	
	public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie){
		return null;
	}
	
	
	public ResponseEntity<Movie> adremoveMovie(@RequestBody Movie movie){
		return null;
	}
	
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
		return null;
	}
	
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
		return null;
	}
	
	
	
	
	
}
