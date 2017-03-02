package com.accenture.dao.test;

import com.accenture.repository.BookRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.PersitanceContext;

import javax.persistence.PersistenceContext;

/**
 * Created by antonio on 02/03/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= PersitanceContext.class)
public class PersistanceContextTest {
    @Autowired
    protected BookRepository bookRepository;
}
