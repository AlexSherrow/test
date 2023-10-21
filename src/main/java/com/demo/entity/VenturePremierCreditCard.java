package com.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class VenturePremierCreditCard extends AbstractCreditCard {

	private int premierPoints;

	public VenturePremierCreditCard() {
		super(0, "");
	}

	public VenturePremierCreditCard(int balance, String nameOnCard, int premierPoints) {
		super(balance, nameOnCard);
		this.premierPoints = premierPoints;
	}

	public int getPremierPoints() {
		return premierPoints;
	}

	public void setPremierPoints(int premierPoints) {
		this.premierPoints = premierPoints;
	}

}
