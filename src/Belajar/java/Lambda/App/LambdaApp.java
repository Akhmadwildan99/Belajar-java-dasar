package Belajar.java.Lambda.App;

import Belajar.java.Lambda.Function.AgeMatcher;
import Belajar.java.Lambda.Function.Executor;
import Belajar.java.Lambda.domain.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaApp {

    public static void matchAndExecute(List<Student> students, AgeMatcher matcher, Executor executor) {
        for (Student student : students) {
            if (matcher.match(student)) {
                executor.execute(student);
            }
        }
    }

    public static void matchAndExecute2(
            List<Student> students,
            Predicate<Student> predicate,
            Consumer<Student> consumer) {
        for (Student student : students) {
            if (predicate.test(student)) {
                consumer.accept(student);
            }
        }
    }

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Boby", 13),
                new Student("Samsul", 15),
                new Student("Budi", 11));

        matchAndExecute(students,
                s -> s.getAge() == 13,
                s -> System.out.println(s.getName()));


        matchAndExecute2(students,
                s -> s.getAge() == 13,
                s -> System.out.println(s.getName()));

    }
}
