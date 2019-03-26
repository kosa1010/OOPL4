package pl.edu.ur.oopl4.zad2;

/**
 * Created by mchyl on 28/07/2018.
 */
public interface StudentInterface {

    String getName();
    String getSurname();
    int getIndexNumber();
    String getSpeciality();
    int getYearOfStudy();

    void setName(String name);
    void setSurname(String surname);
    void setIndexNumber(int indexNumber);
    void setSpeciality(String speciality);
    void setYearOfStudy(int yearOfStudy);
}
