package com.capg.mtb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capg.mtb.model.Movie;

public interface IMovieRepository extends JpaRepository<Movie, Long> {
	@Query(value = "select * from Movies m where theatre_id = 1", nativeQuery = true)
	List<Movie> findByTheatreId(long theatreId);
}
