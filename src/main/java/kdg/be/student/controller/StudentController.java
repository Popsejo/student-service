package kdg.be.student.controller;

import kdg.be.student.model.Student;
import kdg.be.student.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController{
    @Autowired
    private StudentService service;


    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id){
        return this.service.getStudent(id);
    }

    @GetMapping("/")
    public List<Student> getAllStudents(){
        return this.service.getAllStudents();
    }


    @GetMapping("/init")
    public List<Student> initialiseDatabase(){
        this.service.fillDatabase();
        return this.service.getAllStudents();
    }

}