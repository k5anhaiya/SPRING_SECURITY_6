package com.mytechnology.in_memory_authentication.DTO;



public class Teacher {

    public String name;

    public int age;

    public String subject;

    public String city;

    public Teacher(String name, int age, String subject, String city) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public Teacher(){
        super();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
