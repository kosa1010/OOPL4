package pl.edu.ur.oopl4.zad1;

/**
 */
public class Person {

    /* ------
     * Fields
     * ------ */
    protected String name;      //
    protected String surname;  // Pola klasy osoba
    protected int age;         //

    /* --------------------------
     * Constructors - 3 overloads
     * -------------------------- */
    // Konstruktor pierwszy
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Konstruktor drugi
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // Konstruktor trzeci
    public Person() {
    }

    /* -------
     * Methods
     * ------- */
    //Metoda pokazująca dane osoby
    public void showData() {
        System.out.println("Osoba");
        System.out.println("imię: " + this.name);
        System.out.println("surname: " + this.surname);
        System.out.println("age: " + this.age + " lat");
    }

    //Metoda zwracająca dane osoby
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
} //end class
