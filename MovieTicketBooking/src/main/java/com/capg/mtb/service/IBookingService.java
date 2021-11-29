package com.capg.mtb.service;

import java.time.LocalDate;
import java.util.List;

import com.capg.mtb.model.TicketBooking;

public interface IBookingService {
	TicketBooking addBooking(TicketBooking booking) throws Exception;
	TicketBooking updateBooking(TicketBooking booking);
	TicketBooking cancelBooking(TicketBooking booking);
	List<TicketBooking> showAllBooking(int movieid);
	List<TicketBooking> showAllBooking(LocalDate date);
	List<TicketBooking> showAllBookingList(int showid);
	double calculateTotalCost(int bookingid);

}
