package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.bean.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {

}
