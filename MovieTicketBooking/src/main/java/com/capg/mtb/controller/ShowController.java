package com.capg.mtb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.mtb.model.Show;
import com.capg.mtb.service.IShowService;

@RestController
public class ShowController {
	
	@Autowired
	private IShowService iShowService;
	
	@PostMapping("/addShow")
	public ResponseEntity<Show> addMovie(@RequestBody Show show){
		return ResponseEntity.ok(iShowService.addShow(show));

}
}
