package com.capg.mtb.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="Theatre")
public class Theatre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int theatreid;
	private String theatreName;
	private String theatreCity;
	@Transient
	private List<Movie> listOfMovies;
	@Transient
	private List<Screen> listOfScreens;
	private String managerName;
	private String managerContact;

	public int getTheatreid() {
		return theatreid;
	}
	public void setTheatreid(int theatreid) {
		this.theatreid = theatreid;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTheatreCity() {
		return theatreCity;
	}
	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}
	public List<Movie> getListOfMovies() {
		return listOfMovies;
	}
	public void setListOfMovies(List<Movie> listOfMovies) {
		this.listOfMovies = listOfMovies;
	}
	public List<Screen> getListOfScreens() {
		return listOfScreens;
	}
	public void setListOfScreens(List<Screen> listOfScreens) {
		this.listOfScreens = listOfScreens;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerContact() {
		return managerContact;
	}
	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}
	
}
