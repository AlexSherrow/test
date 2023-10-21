package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.VentureXCreditCardRepo;
import com.demo.entity.VentureXCreditCard;

@Service
public class VentureXCreditCardServiceImpl implements VentureXCreditCardService {

	@Autowired
	VentureXCreditCardRepo repo;

	@Override
	public List<VentureXCreditCard> get() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
