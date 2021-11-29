package com.capg.mtb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.mtb.model.TicketBooking;

public interface IBookingRepository extends JpaRepository<TicketBooking, Long>{
	
}
