package com.capg.mtb.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capg.mtb.model.Show;

public interface IShowRepository extends JpaRepository<Show, Long> {
	
	@Query(value = "select movie_Id from Shows s where show_Start_Time = 1", nativeQuery = true)
	List<Long> findByDate(LocalDate date);

	@Query(value = "select * from Shows s where theatre_Id = 1", nativeQuery = true)
	List<Show> findByTheatreId(long theatreId);

	@Query(value = "select * from Shows s where show_Start_Time = 1", nativeQuery = true)
	List<Show> findByLocalDate(LocalDate date);
}
