package com.drc.Assignment.service;

import com.drc.Assignment.entity.Teacher;

public interface TeacherService {
    void getTeachers();

    void getTeacher(String tid);

    void addTeacher(Teacher teacher);
}
