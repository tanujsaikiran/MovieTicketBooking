package com.capg.mtb.service.impl;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
		
		return null;
	}

	@Override
	public Show removeShow(Show show) {
		
		return null;
	}

	@Override
	public Show viewShow(Show show) {
		
		return null;
	}

	@Override
	public List<Show> viewShowList(int theatreid) {
		
		return null;
	}

	@Override
	public List<Show> viewShowList(LocalDate date) {
		
		return null;
	}

	@Override
	public List<Show> viewAllShows() {
		
		return null;
	}

}
