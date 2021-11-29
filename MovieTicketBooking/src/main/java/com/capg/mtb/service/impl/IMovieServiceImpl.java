package com.capg.mtb.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.mtb.exceptions.MovieNotFoundException;
import com.capg.mtb.model.Movie;
import com.capg.mtb.repository.IMovieRepository;
import com.capg.mtb.repository.IShowRepository;
import com.capg.mtb.service.IMovieService;

@Component
public class IMovieServiceImpl implements IMovieService {

	@Autowired
	public IMovieRepository iMovieRepository;
	
	@Autowired
	public IShowRepository iShowRepository;

	@Override
	public Movie addMovie(Movie movie) {
		return iMovieRepository.save(movie);
	}

	@Override
	public Movie updateMovie(Movie movie) {
		return iMovieRepository.save(movie);
	}

	@Override
	public void removeMovie(int id) throws MovieNotFoundException {
		Movie deleteMovie = iMovieRepository.findById(id)
				.orElseThrow(() -> new MovieNotFoundException("No movie id is found:" + id));
		iMovieRepository.delete(deleteMovie);
	}

	public Movie viewMovie(int id) throws MovieNotFoundException {
		return iMovieRepository.findById(id)
				.orElseThrow(() -> new MovieNotFoundException("No movie id is found:" + id));
	}

	@Override
	public List<Movie> viewMovieList() {
		return iMovieRepository.findAll();
	}

	@Override
	public List<Movie> viewMovieList(int theatreid) {
		List<Integer> movieIds = iMovieRepository.findByTheatreId(theatreid);
		 return iMovieRepository.findAllById(movieIds);
	}

	@Override
	public List<Movie> viewMovieList(LocalDate date) {
		 List<Integer> movieIds = iShowRepository.findByDate(date);
		 return iMovieRepository.findAllById(movieIds);
	}

}
