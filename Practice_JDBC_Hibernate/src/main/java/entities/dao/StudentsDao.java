package entities.dao;

import entities.Student;

public interface StudentsDao {

    void addStudent(Student student);
    Student getStudentById(int id);
}
