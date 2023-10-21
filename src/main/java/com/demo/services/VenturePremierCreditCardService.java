package com.demo.services;

import java.util.List;

import com.demo.entity.VenturePremierCreditCard;

public interface VenturePremierCreditCardService {

	void create(VenturePremierCreditCard card);

	List<VenturePremierCreditCard> get();

	List<VenturePremierCreditCard> findByPremierPoints(int points);

	void resetDebt();

	void maxDebt();

}
