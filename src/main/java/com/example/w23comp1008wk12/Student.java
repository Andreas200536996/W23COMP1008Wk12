package com.example.w23comp1008wk12;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name;
    private int studentNum;
    private LocalDate birthday;

    public Student(String name, int studentNum, LocalDate birthday) {
        this.name = name;
        this.studentNum = studentNum;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String toString() {
        return (name + " " + studentNum);
    }

    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

}
