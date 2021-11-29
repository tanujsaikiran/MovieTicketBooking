package com.capg.mtb.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.mtb.exceptions.BookingNotFoundException;
import com.capg.mtb.model.Booking;
import com.capg.mtb.service.IBookingService;

@RestController
public class BookingController {

	@Autowired
	IBookingService iBookingService;

	@PostMapping("/addBooking")
	public ResponseEntity<Booking> addBooking(@RequestBody Booking booking) throws Exception {
		return ResponseEntity.ok(iBookingService.addBooking(booking));
	}

	@PostMapping("/updateBooking")
	public Booking updateBooking(@RequestBody Booking booking) throws BookingNotFoundException {
		return iBookingService.updateBooking(booking);
	}

	@DeleteMapping("/cancelBooking/{id}")
	public String cancelBooking(@PathVariable("id") int id) throws BookingNotFoundException {
		iBookingService.cancelBooking(id);
		return "Success";
	}

	@GetMapping("/bookingByMovieId/{movieId}")
	public List<Booking> showAllBooking(@PathVariable("movieId") int movieid) throws BookingNotFoundException {
		return iBookingService.showAllBooking(movieid);
	}

	@GetMapping("/bookingByDate/{date}")
	public List<Booking> showAllBooking(@PathVariable("date") LocalDate date) {
		return iBookingService.showAllBooking(date);
	}

	@GetMapping("/bookingByShowId/{showId}")
	public List<Booking> showAllBookingList(@PathVariable("showId") int showid) throws BookingNotFoundException {
		return iBookingService.showAllBookingList(showid);
	}

	@GetMapping("/calculateTotalCost/{bookingid}")
	public double calculateTotalCost(@PathVariable("bookingid") int bookingid) {
		return iBookingService.calculateTotalCost(bookingid);
	}

}
