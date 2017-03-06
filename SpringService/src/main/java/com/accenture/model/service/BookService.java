package com.accenture.model.service;

import com.accenture.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findByTitle(String title);
}
