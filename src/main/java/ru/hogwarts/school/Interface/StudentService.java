package ru.hogwarts.school.Interface;


import ru.hogwarts.school.model.Student;


import java.util.Collection;
import java.util.List;

public interface StudentService {

    Student createStudent(Student student);

    Student findStudent(long id);

    Student editStudent(Student student);

    void deleteStudent(Long id);

    List<Student> sortStudent(Integer age);

    Collection<Student> findByAgeBetween(Integer a, Integer b);

    Student findByName(String name);

    Integer amountStudents();

    Integer avgAge();

    Collection<Student> lastFiveStudents();

    List<String> getAllStudentStartASort();

    double getAvgAgeStudents();

     void parallelFlow();

    void parallelFlowSynchronized();
}
