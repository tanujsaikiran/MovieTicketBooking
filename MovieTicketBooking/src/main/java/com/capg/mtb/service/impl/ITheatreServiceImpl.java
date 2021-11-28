package com.capg.mtb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.mtb.model.Theatre;
import com.capg.mtb.repository.ITheatreRepository;
import com.capg.mtb.service.ITheatreService;

public class ITheatreServiceImpl implements ITheatreService{
	
	@Autowired
	ITheatreRepository ITheatreRepository;

	@Override
	public Theatre addtheatre(Theatre theatre) {
	
		return ITheatreRepository.save(theatre);
	}
	

}
