package com.drc.Assignment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class Student {

    public String Name;
    @Id
    public Long rollNo;
    public String department;
    public String standard;
    public String gender;
    @Min(5)
    @Max(30)
    public int age;

    public Student(){

    }
    public Student(String name, Long rollNo, String department, String standard, String gender, int age) {
        Name = name;
        this.rollNo = rollNo;
        this.department = department;
        this.standard = standard;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getRollNo() {
        return rollNo;
    }

    public void setRollNo(Long rollNo) {
        this.rollNo = rollNo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", rollNo=" + rollNo +
                ", department='" + department + '\'' +
                ", standard='" + standard + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
