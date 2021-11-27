package com.capg.mtb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.mtb.model.Movie;
import com.capg.mtb.service.IMovieService;

@RestController
public class Moviecontroller {
	
	@Autowired
	private IMovieService iMovieService;

	@PostMapping("/addmovie")
	public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
		return ResponseEntity.ok(iMovieService.addMovie(movie));
	}
	
}
