package com.capg.mtb.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capg.mtb.model.Booking;

public interface IBookingRepository extends JpaRepository<Booking, Integer>{
	@Query(value = "select * from Bookings m where show_id = 1", nativeQuery = true)
	List<Booking> findByShowId(int showid);
	
	@Query(value = "select * from Bookings m where movie_id = 1", nativeQuery = true)
	List<Booking> findByMovieid(int movieid);
	
	@Query(value = "select * from Bookings m where booking_date = 1", nativeQuery = true)
	List<Booking> findByBookingDate(LocalDate date);
}
