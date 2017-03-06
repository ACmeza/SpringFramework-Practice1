package com.accenture.repository;

import com.accenture.model.BooksOutOnLoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksOutOnLoanRepository extends JpaRepository<BooksOutOnLoan, Integer> {

}
