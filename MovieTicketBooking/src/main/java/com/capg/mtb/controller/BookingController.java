package com.capg.mtb.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.mtb.model.TicketBooking;
import com.capg.mtb.service.IBookingService;

@RestController
public class BookingController {

	@Autowired
	IBookingService iBookingService;

	@PostMapping("/addBooking")
	public TicketBooking addBooking(TicketBooking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping("/updateBooking")
	public TicketBooking updateBooking(TicketBooking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@DeleteMapping("/cancelBooking")
	public TicketBooking cancelBooking(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/bookingByMovieId/{movieId}")
	public List<TicketBooking> showAllBooking(@PathVariable("id") long movieid) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/bookingByDate/{date}")
	public List<TicketBooking> showAllBooking(@PathVariable("date") LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/bookingByShowId/{showId}")
	public List<TicketBooking> showAllBookingList(@PathVariable("showId") long showid) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/calculateTotalCost/{bookingid}")
	public double calculateTotalCost(@PathVariable("bookingid") long bookingid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
