package com.mytechnology.in_memory_authentication.Service;

import com.mytechnology.in_memory_authentication.DTO.Teacher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeacherServiceImpl implements TeacherService{
    List<Teacher> teacherList=new ArrayList<>();

    public TeacherServiceImpl(){
    teacherList.add(new Teacher("Mohit Agarwal",26,"Maths","PATNA"));
        teacherList.add(new Teacher("Amit Pathak",28,"Science","NEW DELHI"));
        teacherList.add(new Teacher("Priya Sharma",32,"Hindi","PATNA"));
        teacherList.add(new Teacher("Rohit Tawde",29,"English","PATNA"));
        teacherList.add(new Teacher("Sonu Sood",36,"Computer Science","HARYANA"));
        teacherList.add(new Teacher("Pinky pandit",27,"Physcis","GUJRAT"));
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return teacherList;
    }

    @Override
    public List<Teacher> getTeacherWithAgeGreaterthan(Integer age) {
        return teacherList.stream().filter(teacher -> teacher.getAge()>age).collect(Collectors.toList());
    }

    @Override
    public List<Teacher> findByCity(String city) {
        return teacherList.stream().filter(teacher -> teacher.getCity().toUpperCase().equalsIgnoreCase(city.toUpperCase())).collect(Collectors.toList());
    }
}
