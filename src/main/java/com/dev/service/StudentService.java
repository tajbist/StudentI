package com.dev.service;

import com.dev.model.Student;

import java.util.List;

/**
 * Created by Oops on 8/6/2016.
 */
public interface StudentService {
    List<Student> getAll();

    void add(Student student);

    void delete(long id);

    Student findBy(long id);

    void update(Student student);
}
