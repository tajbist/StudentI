package com.dev.controller;


import com.dev.model.Student;
import com.dev.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Oops on 9/12/2016.
 */
@CrossOrigin(origins = "http://localhost:9000", maxAge = 3600)
@RestController
@RequestMapping("/")
public class RestStudentController {

    @Autowired
    public StudentService studentService;
@RequestMapping(value = "restapi/students",produces ="Application/json")
    public @ResponseBody
    List<Student>  getAll(){
        List<Student> list=studentService.getAll();
            return  list;

    }
    @RequestMapping(value = "restapi/students/{id}",produces ="Application/json")
    public @ResponseBody
    Student  findById(@PathVariable long id){
        Student student=studentService.findBy(id);
        return  student;

    }
}
