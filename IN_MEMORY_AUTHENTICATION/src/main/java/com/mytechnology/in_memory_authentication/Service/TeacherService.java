package com.mytechnology.in_memory_authentication.Service;

import com.mytechnology.in_memory_authentication.DTO.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeacher();

    List<Teacher> getTeacherWithAgeGreaterthan(Integer age);

    List<Teacher> findByCity(String city);
}
