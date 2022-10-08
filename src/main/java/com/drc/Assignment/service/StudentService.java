package com.drc.Assignment.service;

import com.drc.Assignment.entity.Student;

public interface StudentService {
    void getStudents();

    void getStudent(long parseLong);

    void addStudent(Student student);

    void editStudent(Student student);
}
