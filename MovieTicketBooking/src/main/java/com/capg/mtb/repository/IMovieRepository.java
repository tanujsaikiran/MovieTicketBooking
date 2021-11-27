package com.capg.mtb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.mtb.model.Movie;

public interface IMovieRepository extends JpaRepository<Movie,Integer>{

}
