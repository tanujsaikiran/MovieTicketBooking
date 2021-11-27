package com.capg.mtb.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.mtb.model.Movie;
import com.capg.mtb.repository.IMovieRepository;
import com.capg.mtb.service.IMovieService;

@Component
public class IMovieServiceImpl implements IMovieService{

	@Autowired
	public IMovieRepository iMovieRepository;
	
	@Override
	public Movie addMovie(Movie movie) {
		return iMovieRepository.save(movie);
	}

	@Override
	public Movie updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie removeMovie(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie viewMovie(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> viewMovieList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> viewMovieList(int theatreid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> viewMovieList(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

}
