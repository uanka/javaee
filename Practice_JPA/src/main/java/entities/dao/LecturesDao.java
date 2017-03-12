package entities.dao;

import entities.Lecture;

public interface LecturesDao {

    Lecture addLecture(Lecture lecture);
    Lecture getLecture(int id);
    void saveLecture(Lecture lecture);

}
