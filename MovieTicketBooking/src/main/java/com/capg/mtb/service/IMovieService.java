package com.capg.mtb.service;

import java.time.LocalDate;
import java.util.List;

import com.capg.mtb.model.Movie;
import com.cg.mtb.exceptions.MovieNotFoundException;

public interface IMovieService  {
	
	 Movie addMovie(Movie movie);
	 
	 Movie updateMovie(Movie movie);
	 
	 void removeMovie(long id) throws MovieNotFoundException;
	 
	 Movie viewMovie(long id) throws MovieNotFoundException;
	 
	 List<Movie> viewMovieList();
	 
	 List<Movie> viewMovieList(long theatreid);
	 
	 List<Movie> viewMovieList(LocalDate date);
}
