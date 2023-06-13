package interfaces;

import model.Lesson;

import java.util.List;

public interface LessonService {
    void AddNewLessonToGroup(String name);
    void getLessonByName(List<Lesson>lessons);
    void getAllLessonByGroupName(List<Lesson>lessons,String name);
    void deleteLesson(List<Lesson>lessons);

}
