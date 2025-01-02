package com.mytechnology.in_memory_authentication.Controller;

import com.mytechnology.in_memory_authentication.DTO.Teacher;
import com.mytechnology.in_memory_authentication.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/home")
public class MyController {

    @Autowired
    TeacherService teacherService;

    //localhost:8081/home/all-teacher
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/all-teacher")
    public List<Teacher> getAllTeacher(){
        return teacherService.getAllTeacher();
    }
    //localhost:8081/home/get-teacher-with-age-greaterthan/{age}
    @PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping("/get-teacher-with-age-greaterthan/{age}")
    public List<Teacher> getTeacherWithAgeGreaterthan(@PathVariable Integer age){
        return teacherService.getTeacherWithAgeGreaterthan(age);
    }

    //localhost:8081/home/find-by-city/{city}
    @PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping("/find-by-city/{city}")
    public List<Teacher> findByCity(@PathVariable String city){
        return teacherService.findByCity(city);
    }
}
