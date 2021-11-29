package com.capg.mtb.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.mtb.exceptions.ShowNotFoundException;
import com.capg.mtb.model.Show;
import com.capg.mtb.service.IShowService;

@RestController
public class ShowController {

	@Autowired
	private IShowService iShowService;

	@PostMapping("/addShow")
	public ResponseEntity<Show> addShow(@RequestBody Show show) {
		return ResponseEntity.ok(iShowService.addShow(show));
	}

	@PostMapping("/updateShow")
	public ResponseEntity<Show> updateShow(@RequestBody Show show) {
		return ResponseEntity.ok(iShowService.updateShow(show));
	}

	@DeleteMapping("/removeShow/{id}")
	public String removeShow(@PathVariable("id") int id) throws ShowNotFoundException {
		iShowService.removeShow(id);
		return "Success";
	}

	@GetMapping("/showById/{id}")
	public ResponseEntity<Show> viewShow(@PathVariable("id") int id) throws ShowNotFoundException {
		return ResponseEntity.ok(iShowService.viewShow(id));
	}

	@GetMapping("/showBytheatreId/{theatreId}")
	public List<Show> viewShowList(@PathVariable("theatreId") int theatreId) {
		return iShowService.viewShowList(theatreId);
	}

	@GetMapping("/showByDate/{date}")
	public List<Show> viewShowList(@PathVariable("date") LocalDate date) {
		return iShowService.viewShowList(date);
	}

	@GetMapping("/viewAllShows")
	public List<Show> viewAllShows() {
		return iShowService.viewAllShows();
	}

}
