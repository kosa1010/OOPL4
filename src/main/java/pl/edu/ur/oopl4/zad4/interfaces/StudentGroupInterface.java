package pl.edu.ur.oopl4.zad4.interfaces;

import java.util.Scanner;

/**
 */
public interface StudentGroupInterface {

    void init();
    void setStudentDataAtIndex(int index, String name, String surname, long indexNumber, String speciality, int yearOfStudy);
    void setDefaultDataAtIndex(int index);
    String getStudentDataAtIndex(int index);
    void showStudentDataAtIndex(int index);
    String getDataOfAllStudents();
    void showDataOfAllStudents();
    String getStudentsFromRange(int start, int end);
    void showStudentsFromRange(int start, int end);

}
