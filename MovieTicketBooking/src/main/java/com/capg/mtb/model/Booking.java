package com.capg.mtb.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TicketBookings")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookingId;
	
	private long showId;
	
	private LocalDate bookingDate;
	
	private int transcationId;
	
	private String transcationMode;
	
	private String transcationStatus;
	
	private double totalCost;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ticketId", referencedColumnName = "ticketId")
	private Ticket ticket;

	public long getBookingId() {
		return bookingId;
	}

	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}

	public long getShowId() {
		return showId;
	}

	public void setShowId(long showId) {
		this.showId = showId;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getTranscationId() {
		return transcationId;
	}

	public void setTranscationId(int transcationId) {
		this.transcationId = transcationId;
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
