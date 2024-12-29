package Belajar.java.Lambda.Function;

import Belajar.java.Lambda.domain.Student;

@FunctionalInterface
public interface AgeMatcher {
    boolean match(Student student);
}
