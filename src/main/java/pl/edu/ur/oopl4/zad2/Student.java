package pl.edu.ur.oopl4.zad2;

import pl.edu.ur.oopl4.zad1.Person;

import java.util.Scanner;

/**
 */
public class Student implements StudentInterface{

    public Student(String name, String surname, int indexNumber, String speciality, int yearOfStudy){}
    public Student(String name, String surname, int indexNumber, String speciality){}
    public Student(String name, String surname, int indexNumber){}
    public Student(String name, String surname){}
    public Student(Scanner in){

    }

    public String getName() {
        return null;
    }

    public String getSurname() {
        return null;
    }

    public long getIndexNumber() {
        return 0;
    }

    public String getSpeciality() {
        return null;
    }

    public int getYearOfStudy() {
        return 0;
    }

    public void setName(String name) {

    }

    public void setSurname(String surname) {

    }

    public void setIndexNumber(long indexNumber) {

    }

    public void setSpeciality(String speciality) {

    }

    public void setYearOfStudy(int yearOfStudy) {

    }
}
