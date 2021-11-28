package com.capg.mtb.model;

import java.time.LocalDate;

public class TicketBooking {
	private int ticketid;
	private int showid;
	private LocalDate bookingDate;
	private int  transcationid;
	private String transcationMode;
	private String transcationStatus;
	private  double totalCost;
	private Ticket ticket;
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getShowid() {
		return showid;
	}
	public void setShowid(int showid) {
		this.showid = showid;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getTranscationid() {
		return transcationid;
	}
	public void setTranscationid(int transcationid) {
		this.transcationid = transcationid;
	}
	public String getTranscationMode() {
		return transcationMode;
	}
	public void setTranscationMode(String transcationMode) {
		this.transcationMode = transcationMode;
	}
	public String getTranscationStatus() {
		return transcationStatus;
	}
	public void setTranscationStatus(String transcationStatus) {
		this.transcationStatus = transcationStatus;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
}
