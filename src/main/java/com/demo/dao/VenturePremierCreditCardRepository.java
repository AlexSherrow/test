package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.VenturePremierCreditCard;

public interface VenturePremierCreditCardRepository extends JpaRepository<VenturePremierCreditCard, Integer> {

	List<VenturePremierCreditCard> findByPremierPoints(int points);

}
