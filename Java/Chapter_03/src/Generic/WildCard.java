package Generic;

import java.util.Arrays;

public class WildCard {
    public static void  registerCourse( Course<?> course) {
        System.out.println(course.getName() + " student: " +
                Arrays.toString(course.getStudents()));
    }

    public static void  registerCourseStudent( Course<? extends Student> course) {
        System.out.println(course.getName() + " student: " +
                Arrays.toString(course.getStudents()));
    }

    public static void  registerCourseWorker( Course<? super Worker> course) {
        System.out.println(course.getName() + " student: " +
                Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<Person>("Normal Class", 5);
        personCourse.add(new Person());
        personCourse.add(new Worker());
        personCourse.add(new Student());
        personCourse.add(new HighStudent());
        Course<Worker> workerCourse = new Course<Worker>("Buisness Class", 5);
        workerCourse.add(new Worker());
        Course<Student> studentCourse = new Course<Student>("Student Class", 5);
        studentCourse.add(new Student());
        studentCourse.add(new HighStudent());
        Course<HighStudent> highStudentCourse =
                new Course<HighStudent>("HighStudent Class", 5);
        highStudentCourse.add(new HighStudent());

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        System.out.println();

        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);
        System.out.println();

        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);

    }
}

class Course<T> {
    private String name;
    private  T[] students;

    public Course(String name, int capacity) {
        this.name = name;
        students = (T[]) (new Object[capacity]);
    }

    public String getName() { return  name; }
    public T[] getStudents() { return  students; }
    public void add(T t) {
        for(int i=0; i<students.length; i++) {
            if(students[i] == null) {
                students[i] = t;
                break;
            }
        }
    }

}

class Person {}
class Worker extends Person {}
class Student extends Person {}
class HighStudent extends  Student {}