package com.drc.Assignment.service;

import com.drc.Assignment.entity.Teacher;
import com.drc.Assignment.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public void getTeachers() {
        this.teacherRepository.findAll();
    }

    @Override
    public void getTeacher(String tid) {
        this.teacherRepository.getOne(tid);
    }

    @Override
    public void addTeacher(Teacher teacher) {

    }
}
