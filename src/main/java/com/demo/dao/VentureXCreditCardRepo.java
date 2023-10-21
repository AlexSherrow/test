package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.VentureXCreditCard;

@Repository
public interface VentureXCreditCardRepo extends JpaRepository<VentureXCreditCard, Integer> {

}
