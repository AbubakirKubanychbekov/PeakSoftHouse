package dataBase;

import model.Group;
import model.Lesson;
import model.Student;

import java.util.List;

public class DataBase {
    private List<Group> groups;
    private List<Lesson>lessons;
    private List<Student>students;

    public DataBase(List<Group> groups, List<Lesson> lessons, List<Student> students) {
        this.groups = groups;
        this.lessons = lessons;
        this.students = students;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
