package model;

import enums.Gender;

public class Student extends Group {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String gender;

    public Student(Long id, String name, String surname, String email, String password, String gender) {
        super();
        this.id = id;
        this.name = name;
        this.surname=surname;
        this.email = email;
        this.password=password;
        this.gender = gender;
    }

    public Student() {
    }

    public Student(String groupName, String student, Long id, String email, int password, String gender) {
    }

    public Student(Long groupId, Long id, String name, String surname, String email, int password, String gender) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nStudent" +" "+
                "name: '" + name + '\'' +
                ", id: " + id +
                ", email: '" + email + '\'' +
                ", gender: " + gender;
    }
}
