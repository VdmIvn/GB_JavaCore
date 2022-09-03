package lesson09;

import java.util.Objects;

public class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Course course = (Course) obj;
        return Objects.equals(name, course.name);
    }

    public String toString() {
        return this.name;
    }
}

