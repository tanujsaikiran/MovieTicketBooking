package com.capg.mtb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.mtb.model.Theatre;
import com.capg.mtb.service.ITheatreService;

@RestController
public class TheatreController {
	
	@Autowired
	private ITheatreService iTheatreService;
	
	@PostMapping("/addTheatre")
	public ResponseEntity<Theatre> addMovie(@RequestBody Theatre theatre){
		return ResponseEntity.ok(iTheatreService.addtheatre(theatre));

}
}
