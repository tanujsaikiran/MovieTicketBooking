package com.capg.mtb.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.mtb.exceptions.ShowNotFoundException;
import com.capg.mtb.model.Show;
import com.capg.mtb.repository.IShowRepository;
import com.capg.mtb.service.IShowService;

@Component
public class IShowServiceImpl implements IShowService {

	@Autowired
	IShowRepository iShowRepository;

	@Override
	public Show addShow(Show show) {
		return iShowRepository.save(show);
	}

	@Override
	public Show updateShow(Show show) {
		return iShowRepository.save(show);
	}

	@Override
	public void removeShow(int id) throws ShowNotFoundException {
		Show show = iShowRepository.findById(id)
				.orElseThrow(() -> new ShowNotFoundException("No show id is found:" + id));
		iShowRepository.delete(show);
	}

	@Override
	public Show viewShow(int id) throws ShowNotFoundException {
		return iShowRepository.findById(id).orElseThrow(() -> new ShowNotFoundException("No movie id is found:" + id));
	}

	@Override
	public List<Show> viewShowList(int theatreId) {
		return iShowRepository.findByTheatreId(theatreId);
	}

	@Override
	public List<Show> viewShowList(LocalDate date) {
		return iShowRepository.findByLocalDate(date);
	}

	@Override
	public List<Show> viewAllShows() {
		return iShowRepository.findAll();
	}

}
