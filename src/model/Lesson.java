package model;

public class Lesson {
    private Long id;
    private String lessonName;
    private String description;

    public Lesson(String lessonName, String description) {
        this.lessonName = lessonName;
        this.description = description;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\nLesson" +
                "lessonName: '" + lessonName + '\'' +
                ", description: '" + description + '\'';
    }
}
