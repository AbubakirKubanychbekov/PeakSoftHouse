package service;

import dataBase.DataBase;
import exception.MyException;
import interfaces.StudentService;
import model.Group;
import model.Lesson;
import model.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private DataBase dataBase;

    public StudentServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }


    @Override
    public void addNewStudentToGroup(Long groupId, Long studentId, String name, String surname, String email, String password, String gender) {
//        boolean isTrue = false;
//        while (isTrue) {
//            try {
//                for (int i = 0; i < dataBase.getGroups().size(); i++) {
//                    if (!dataBase.getGroups().get(i).getId().equals(student)) {
//                        throw new MyException("Группанын id си : " + groupId + " табылбады ");
//                    } else {
//                        isTrue = true;
//                    }
//                }
//            } catch (MyException e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        for (int i = 0; i < dataBase.getGroups().size(); i++) {
//            if (dataBase.getGroups().get(i).getId().equals(student)){
//                dataBase.getGroups().get(i).getStudents().add(student);
//            }
//        }
        for (Group g:dataBase.getGroups()) {
            if (g.getId().equals(groupId)){
                g.getStudents().add(new Student(studentId,name,surname,email,password,gender));
                System.out.println("Студент ийгиликтуу кошулду!");
            }
        }
    }


    @Override
    public void updateStudent(Long id, String name, String surname, String email, String password, String gender) {
        boolean isTrue = true;

    while (isTrue) {
        try {
            for (Group g : dataBase.getGroups())
                if (id == g.getId()) {
                    for (Student s : g.getStudents()) {
                        if (id == s.getId()) {
                            s.setId(id);
                            s.setName(name);
                            s.setSurname(surname);
                            s.setEmail(email);
                            s.setPassword(password);
                            s.setGender(gender);
                            isTrue = false;

                        } else {
                            throw new MyException("ID менен студент : " + id + "табылган жок, туура ID киргизиңиз");
                        }
                    }
                }
            }catch(MyException e){
                System.err.println(e.getMessage());
            }
        }
    }

    @Override
    public void findStudentByFirstName(List<Student> students,String name) {
        for (int i = 0; i < dataBase.getStudents().size(); i++) {
            if (dataBase.getStudents().get(i).getName().equalsIgnoreCase(name)){
                System.out.println(dataBase.getStudents().get(i));
            }

        }
    }


    @Override
    public void getAllStudentsByGroupName(List<Student> students,String groupName) {
        for (Student s:dataBase.getStudents()) {
            if (s.toString().equalsIgnoreCase(groupName)){
                System.err.println(dataBase.getStudents());
            }
        }

    }

    @Override
    public void getAllStudentsLesson(List<Student> students, Lesson lesson) {

    }

    @Override
    public void deleteStudent(List<Student> students) {

    }

    public void updateStudent(Student student) {
    }
}
