package com.Student.demo.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

public class Student {
    @NotEmpty(message = "Name is required!")
    private String name;
    @Email(message = "Email must be valid!")
    private String email;
    @NotEmpty(message = "Course must be chosen!")
    private String course;
    @Min(value = 18, message = "Age must me greater than 18!")
    @Max(value =30, message = "Age must be below than 30!")
    private int age;

    public Student(){}
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
