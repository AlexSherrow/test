package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.VentureXCreditCard;
import com.demo.services.VentureXCreditCardService;

@RequestMapping("/card2")
@RestController
public class VentureXCreditCardController {

	@Autowired
	VentureXCreditCardService service;

	@GetMapping("/get")
	public List<VentureXCreditCard> get() {
		return service.get();
	}

}
