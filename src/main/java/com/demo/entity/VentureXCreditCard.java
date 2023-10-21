package com.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class VentureXCreditCard extends AbstractCreditCard {

	private int points;

	public VentureXCreditCard() {
		super(0, "");
	}

	public VentureXCreditCard(int balance, String name, int points) {
		super(balance, name);
		this.points = points;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public void reset() {
		System.out.println("I am a premier credit card");
		// TODO Auto-generated method stub

	}

}
