package com.dev.dao;

import com.dev.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Oops on 8/6/2016.
 */
@Repository
public interface StudentDao extends JpaRepository<Student, Long> {
    List<Student> findAllByOrderByIdAsc();
}
