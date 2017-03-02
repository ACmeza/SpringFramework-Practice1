package com.accenture.service;

/**
 * Created by antonio on 02/03/17.
 */
public interface BookService {
    List<Book> findByTitle(String title);
}
