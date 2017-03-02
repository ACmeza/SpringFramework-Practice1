package com.accenture.repository;

import com.accenture.model.BooksOutOnLoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by antonio on 01/03/17.
 */
@Repository
public interface BooksOutOnLoanRepository extends JpaRepository<BooksOutOnLoan, Integer> {

}
