package com.accenture.repository;


import com.accenture.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    public List<Student> findByFirstNameLike(String name);

    public List<Student> findByLastNameLike(String name);

    public List<Student> findByEmailAdressLike(String name);

}

