package lesson09;

import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return this.courses;
    }

    public String toString() {
        return this.name;
    }


}
