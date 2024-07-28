package com.tsinnin.demo.service;

import com.tsinnin.demo.dao.Student;
import com.tsinnin.demo.dto.StudentDTO;

public interface StudentService {

    StudentDTO getStudentById(Long id);

    Long addNewStudent(StudentDTO studentDTO);

    void deleteStudentById(Long id);

    StudentDTO updateStudentById(long id, String name, String email);
}
