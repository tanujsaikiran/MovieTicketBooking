package com.capg.mtb.model;

import java.util.List;

public class Ticket {
	private int ticketid;
	private int noOfSeats;
	private List<Seat> seatNumber;
	private TicketBooking bookingRef;
	private boolean ticketStatus;

	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public List<Seat> getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(List<Seat> seatNumber) {
		this.seatNumber = seatNumber;
	}
	public TicketBooking getBookingRef() {
		return bookingRef;
	}
	public void setBookingRef(TicketBooking bookingRef) {
		this.bookingRef = bookingRef;
	}
	public boolean isTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	
}

