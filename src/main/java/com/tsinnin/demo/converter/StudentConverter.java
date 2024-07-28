package com.tsinnin.demo.converter;

import com.tsinnin.demo.dao.Student;
import com.tsinnin.demo.dto.StudentDTO;

/**
 * Author: Peiyi Ding
 * 作者： 丁沛奕
 * Created by peiyi on 2024-07-28.
 */

public class StudentConverter {

    public static StudentDTO convertStudent(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setName(student.getName());
        studentDTO.setEmail(student.getEmail());
        return studentDTO;
    }

    public static Student convertStudent(StudentDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());
        return student;
    }
}
