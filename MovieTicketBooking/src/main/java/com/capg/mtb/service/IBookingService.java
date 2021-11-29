package com.capg.mtb.service;

import java.time.LocalDate;
import java.util.List;

import com.capg.mtb.exceptions.BookingNotFoundException;
import com.capg.mtb.model.Booking;

public interface IBookingService {
	Booking addBooking(Booking booking) throws Exception;

	Booking updateBooking(Booking booking) throws BookingNotFoundException;

	void cancelBooking(int bookingid) throws BookingNotFoundException;

	List<Booking> showAllBooking(LocalDate date);

	List<Booking> showAllBookingList(int showid) throws BookingNotFoundException;

	double calculateTotalCost(int bookingid);

	List<Booking> showAllBooking(int movieid) throws BookingNotFoundException;

}
