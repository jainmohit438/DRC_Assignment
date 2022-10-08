package com.drc.Assignment.controller;

import com.drc.Assignment.entity.Student;
import com.drc.Assignment.entity.Teacher;
import com.drc.Assignment.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teachers")
    public ResponseEntity<HttpStatus> getTeachers(){
        try {
            this.teacherService.getTeachers();
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/teachers/{id}")
    public ResponseEntity<HttpStatus> getTeacher(@PathVariable String tid){
        try{
            this.teacherService.getTeacher(tid);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/addTeacher")
    public ResponseEntity<HttpStatus> addTeacher(@Valid @RequestBody Teacher teacher){
        try {
            this.teacherService.addTeacher(teacher);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
}
