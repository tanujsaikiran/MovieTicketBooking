package com.capg.mtb.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.mtb.model.TicketBooking;
import com.capg.mtb.repository.IBookingRepository;
import com.capg.mtb.service.IBookingService;

public class IBookingServiceImpl implements IBookingService {

	@Autowired
	IBookingRepository iBookingRepository;
	
	@Override
	public TicketBooking addBooking(TicketBooking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TicketBooking updateBooking(TicketBooking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TicketBooking cancelBooking(TicketBooking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketBooking> showAllBooking(int movieid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketBooking> showAllBooking(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketBooking> showAllBookingList(int showid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateTotalCost(int bookingid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
