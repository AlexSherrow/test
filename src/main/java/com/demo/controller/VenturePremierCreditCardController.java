package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.VenturePremierCreditCard;
import com.demo.services.VenturePremierCreditCardService;

@RequestMapping("/premier")
@RestController
public class VenturePremierCreditCardController {

	@Autowired
	VenturePremierCreditCardService service;

	@GetMapping("/get")
	public List<VenturePremierCreditCard> getAll() {
		return service.get();
	}

	@GetMapping("/getByPoints")
	public List<VenturePremierCreditCard> getBy(@RequestBody int points) {
		return service.findByPremierPoints(points);
	}

	@GetMapping("/resetDebt")
	public void resetDebt() {
		service.resetDebt();
	}

	@PostMapping("/maxDebt")
	public void maxDebt() {
		service.maxDebt();
	}

	@PostMapping("/create")
	public void maxDebt(@RequestBody VenturePremierCreditCard creditCard) {
		service.create(creditCard);
	}

}
