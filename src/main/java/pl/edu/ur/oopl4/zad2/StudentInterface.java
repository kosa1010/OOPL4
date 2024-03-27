package pl.edu.ur.oopl4.zad2;

/**
 */
public interface StudentInterface {

    String getName();
    String getSurname();
    long getIndexNumber();
    String getSpeciality();
    int getYearOfStudy();

    void setName(String name);
    void setSurname(String surname);
    void setIndexNumber(long indexNumber);
    void setSpeciality(String speciality);
    void setYearOfStudy(int yearOfStudy);
}
