package com.dev.controller;

import com.dev.model.Student;
import com.dev.service.StudentService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * Created by Oops on 8/6/2016.
 */
@Controller
@Aspect()
@RequestMapping("/admin/api/")
public class StudentController {

    @Autowired
    private StudentService studentService;
    private static String PATH = "/admin/api/";
    private static String PATH1 = "/admin/";
    @RequestMapping(value = "/home")
    private String home(Model model) {
        return PATH1 + "taj";
    }
    @RequestMapping(value = "/index")
    private String welcomePage(Model model) {
        return "index";
    }
    @RequestMapping(value = "/check")
    private String taj(Model model) {
        return "taj";
    }
    @RequestMapping(value = "/all")
    private String allStudent(Model model) {
        model.addAttribute("students", studentService.getAll());
        return PATH + "list";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    private String addStudent(@ModelAttribute Student student) {
        return  "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private String addStudent(Model model, @Valid Student student, BindingResult result, RedirectAttributes redirect) {
        String view = "redirect:" + "all";
        if (result.hasErrors()) {
            redirect.addFlashAttribute("msg", "Please enter corret data.");
        } else {
            studentService.add(student);
            redirect.addFlashAttribute("msg", "Studetn successfully added.");
        }
        return view;
    }

    @RequestMapping(value = "/delete/{id}")
    private String delete(@PathVariable long id) {
        System.out.println("My id " + id);
        studentService.delete(id);
        return "redirect:" + PATH + "all";
    }
    @RequestMapping(value = "/edit/{id}")
    private String update(@PathVariable long id, Model model) {
        Student student=studentService.findBy(id);
        model.addAttribute("student",student);
        return "admin/api/add";
    }
}
