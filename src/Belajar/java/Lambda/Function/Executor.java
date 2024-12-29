package Belajar.java.Lambda.Function;

import Belajar.java.Lambda.domain.Student;

@FunctionalInterface
public interface Executor {
    void execute(Student student);
}
