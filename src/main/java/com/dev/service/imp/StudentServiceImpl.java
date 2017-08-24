package com.dev.service.imp;

import com.dev.dao.StudentDao;
import com.dev.model.Student;
import com.dev.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Oops on 8/6/2016.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getAll() {
        return studentDao.findAllByOrderByIdAsc();
    }

    @Override
    public void add(Student student) {
        studentDao.save(student);
    }

    @Override
    public void delete(long id) {
        studentDao.delete(id);
    }

    @Override
    public Student findBy(long id) {
        return studentDao.findOne(id);
    }

    @Override
    public void update(Student student) {
        studentDao.save(student);
    }
}
