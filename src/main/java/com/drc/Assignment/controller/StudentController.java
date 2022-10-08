package com.drc.Assignment.controller;

import com.drc.Assignment.entity.Student;
import com.drc.Assignment.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<HttpStatus> getStudents(){
        try {
                this.studentService.getStudents();
                return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<HttpStatus> getStudent(@PathVariable String sid){
        try{
            this.studentService.getStudent(Long.parseLong(sid));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/addStudent")
    public ResponseEntity<HttpStatus> addStudent(@Valid @RequestBody Student student){
        try {
            this.studentService.addStudent(student);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/editStudent/{id}")
    public ResponseEntity<HttpStatus> editStudent(@Valid @RequestBody Student student){
        try {
            this.studentService.editStudent(student);
            return new ResponseEntity<>(HttpStatus.OK);
        }

        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
