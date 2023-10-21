package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.VenturePremierCreditCardRepository;
import com.demo.entity.VenturePremierCreditCard;

@Service
public class VenturePremierCreditCardServiceImpl implements VenturePremierCreditCardService {

	@Autowired
	VenturePremierCreditCardRepository repository;

	@Override
	public List<VenturePremierCreditCard> get() {
		return repository.findAll();
	}

	@Override
	public List<VenturePremierCreditCard> findByPremierPoints(int points) {
		System.out.println(points);
		return repository.findByPremierPoints(points);
	}

	@Override
	public void resetDebt() {
		List<VenturePremierCreditCard> list = repository.findAll();
		list.stream().forEach(e -> e.setBalance(0));
		repository.saveAll(list);
	}

	@Override
	public void maxDebt() {
		List<VenturePremierCreditCard> list = repository.findAll();
		list.stream().forEach(e -> e.setBalance(Integer.MAX_VALUE));
		repository.saveAll(list);
	}

	@Override
	public void create(VenturePremierCreditCard card) {
		try {
			repository.save(card);
		} catch (Exception E) {
			System.out.println("oops!");
		}
	}

}
