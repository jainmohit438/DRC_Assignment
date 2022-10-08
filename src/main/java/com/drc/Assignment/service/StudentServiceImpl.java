package com.drc.Assignment.service;

import com.drc.Assignment.entity.Student;
import com.drc.Assignment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void getStudents() {
        this.studentRepository.findAll();
    }

    @Override
    public void getStudent(long parseLong) {
        this.studentRepository.getOne(parseLong);
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void editStudent(Student student) {

    }


}
