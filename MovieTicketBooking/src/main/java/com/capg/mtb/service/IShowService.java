package com.capg.mtb.service;

import java.time.LocalDate;
import java.util.List;

import com.capg.mtb.exceptions.ShowNotFoundException;
import com.capg.mtb.model.Show;

public interface IShowService {

	Show addShow(Show show);

	Show updateShow(Show show);

	void removeShow(int id) throws ShowNotFoundException;

	Show viewShow(int id) throws ShowNotFoundException;

	List<Show> viewShowList(int theatreid);

	List<Show> viewShowList(LocalDate date);

	List<Show> viewAllShows();

}
