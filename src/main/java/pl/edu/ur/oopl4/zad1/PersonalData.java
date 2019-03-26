package pl.edu.ur.oopl4.zad1;

/**
 */
public class PersonalData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski", 15);
        person1.showData();

        System.out.println("---------------------");
        Person person2 = new Person("Adam", "Nowak");
        person2.showData();

        System.out.println("---------------------");
        person2.name = "Stefan";
        person2.age = 70;
        person2.showData();

        System.out.println("---------------------");
        Person person3 = new Person();
        person3.name = "Anna";
        person3.surname = "Wiśniewska";
        person3.age = 45;
        person3.showData();

    }
}