package com.demo.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractCreditCard implements CreditCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String nameOnCard;
	int balance;

	public AbstractCreditCard(int balance, String nameOnCard) {
		super();
		this.balance = 0;
		this.nameOnCard = nameOnCard;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public void wipeDebt() {
		this.balance = 0;
	}

	@Override
	public void reset() {
		System.out.println("I am a credit card");
		// TODO Auto-generated method stub

	}

}
