package com.capg.mtb.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Show")
public class Show {
	@Id
	@GeneratedValue
	private int showid;
	private LocalDateTime showStartTime;
	private LocalDateTime showEndTime;
	private String showName;
	private Movie movie;
	private int screenid;
	private int theatreid;
	
	
	public int getShowid() {
		return showid;
	}
	public void setShowid(int showid) {
		this.showid = showid;
	}
	public LocalDateTime getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(LocalDateTime showStartTime) {
		this.showStartTime = showStartTime;
	}
	public LocalDateTime getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(LocalDateTime showEndTime) {
		this.showEndTime = showEndTime;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public int getScreenid() {
		return screenid;
	}
	public void setScreenid(int screenid) {
		this.screenid = screenid;
	}
	public int getTheatreid() {
		return theatreid;
	}
	public void setTheatreid(int theatreid) {
		this.theatreid = theatreid;
	}

}
