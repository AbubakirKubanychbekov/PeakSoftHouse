package interfaces;

import model.Lesson;
import model.Student;

import java.util.List;

public interface StudentService {
    void addNewStudentToGroup(Long groupId, Long studentId,String name,String surname, String email, String password, String gender);
    void updateStudent(Long id,String name,String surname,String email, String password, String gender);
    void findStudentByFirstName(List<Student>students,String name);
    void getAllStudentsByGroupName(List<Student>students,String groupName);
    void getAllStudentsLesson(List<Student>students, Lesson lesson);
    void deleteStudent(List<Student>students);
}
