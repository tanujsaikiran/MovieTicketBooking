package com.capg.mtb.service;

import java.time.LocalDate;
import java.util.List;

import com.capg.mtb.model.Movie;

public interface IMovieService  {
	
	 Movie addMovie(Movie movie);
	 
	 Movie updateMovie(Movie movie);
	 
	 Movie removeMovie(Movie movie);
	 
	 Movie viewMovie(Movie movie);
	 
	 List<Movie> viewMovieList();
	 
	 List<Movie> viewMovieList(int theatreid);
	 
	 List<Movie> viewMovieList(LocalDate date);
}
