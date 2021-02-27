package day6;

import java.util.Random;

public class Teacher {
    private String name, schoolSubject;

    public Teacher(String name, String schoolSubject) {
        this.name = name;
        this.schoolSubject = schoolSubject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        String evaluate = "инициализация";
        switch ((random.nextInt(4) + 2)) {
            case 2:
                evaluate = "неудовлетворительно";
                break;
            case 3:
                evaluate = "удовлетворительно";
                break;
            case 4:
                evaluate = "хорошо";
                break;
            case 5:
                evaluate = "отлично";
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s", this.name, student.getName(), this.schoolSubject, evaluate);
    }
}
