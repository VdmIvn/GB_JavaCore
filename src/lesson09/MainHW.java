package lesson09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainHW {

    public static void main(String[] args) {
        List<Student> studentList = formStudentList();

        // Вывод списка уникальных курсов, посещаемых переданными в метод студентами
        System.out.println(formUnicCoursesList(studentList));

        // Вывод самых любознательных студентлв
        System.out.println(findBestStudents(studentList));

        // Вывод списка студентов, посещающих переданный курс
        Course course1 = new Course("Manual QA");
        System.out.println(findStudentsFromCourse(studentList, course1));
    }

    public static List<Student> formStudentList() {
        Course course1 = new Course("Manual QA");
        Course course2 = new Course("Automation QA");
        Course course3 = new Course("Java");
        Course course4 = new Course("Python");
        Course course5 = new Course(".Net");
        Course course6 = new Course("JS");
        Course course7 = new Course("Data Science");
        Course course8 = new Course("Project Management");
        Course course9 = new Course("DevOps");
        Course course10 = new Course("BI");

        Student student1 = new Student("Vadim", Arrays.asList(course1, course5));
        Student student2 = new Student("Christina", Arrays.asList(course1, course2, course3));
        Student student3 = new Student("Timur", Arrays.asList(course5, course7, course9));
        Student student4 = new Student("Alex", Arrays.asList(course2, course4, course6, course9, course10));
        Student student5 = new Student("Pavel", Arrays.asList(course3, course7, course9));
        Student student6 = new Student("Eugene", Arrays.asList(course1, course3, course8, course10));

        return Arrays.asList(student1, student2, student3, student4, student5, student6);
    }

    public static List<Course> formUnicCoursesList(List<Student> students) {
        return students.stream().flatMap(student -> student.getCourses().stream()).distinct().collect(Collectors.toList());
    }

    public static List<Student> findBestStudents (List<Student> students) {
        return students.stream().sorted((s1, s2) -> (s2.getCourses().size()) - (s1.getCourses().size())).limit(2).collect(Collectors.toList());
    }

    public static List<Student> findStudentsFromCourse(List<Student> students, Course course) {
        System.out.println("Course: " + course);
        return students.stream().filter(student -> student.getCourses().contains(course)).collect(Collectors.toList());
    }
}
