package com.capg.mtb.service;

import java.time.LocalDate;
import java.util.List;

import com.capg.mtb.model.Show;
import com.cg.mtb.exceptions.ShowNotFoundException;

public interface IShowService {
	
	Show addShow(Show show);
	Show updateShow(Show show);
	void removeShow(long id) throws ShowNotFoundException;
	Show viewShow(long id) throws ShowNotFoundException;
	List<Show> viewShowList(int theatreid);
	List<Show> viewShowList(LocalDate date);
	List<Show> viewAllShows();

}
