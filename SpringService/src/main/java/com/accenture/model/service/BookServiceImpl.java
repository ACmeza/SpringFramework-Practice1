package com.accenture.model.service;

import com.accenture.model.Book;
import com.accenture.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitleLike(title);
    }
}
