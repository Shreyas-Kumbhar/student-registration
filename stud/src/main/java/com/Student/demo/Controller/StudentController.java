package com.Student.demo.Controller;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import com.Student.demo.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    private List<Student> studentList = new ArrayList<>();

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("student", new Student());
        return "register";
    }

    @PostMapping("/submit")
    public String submitForm(@Valid Student student, BindingResult result, Model model) {
        if(result.hasErrors()){
            return "register";
        }
        studentList.add(student);
        model.addAttribute("student", student);
        return "success";
    }
    @GetMapping("/students")
    public String showAllStudents(Model model) {
        model.addAttribute("students", studentList);
        return "students";
    }
}

//Second Project