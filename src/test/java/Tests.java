
import org.junit.Assert;
import org.junit.Test;
import pl.edu.ur.oopl4.zad2.Student;
import pl.edu.ur.oopl4.zad3.figures.flat.Circle;
import pl.edu.ur.oopl4.zad3.figures.flat.Square;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import pl.edu.ur.oopl4.zad3.figures.flat.Rectangle;
import pl.edu.ur.oopl4.zad3.figures.spatial.Cone;
import pl.edu.ur.oopl4.zad3.figures.spatial.Cube;
import pl.edu.ur.oopl4.zad3.figures.spatial.Cuboid;
import pl.edu.ur.oopl4.zad3.figures.spatial.Sphere;
import pl.edu.ur.oopl4.zad4.StudentGroup;

/**
 *
 */
public class Tests {

    @Test(timeout = 10000)
    public void testEx2() {

        Student student1 = new Student("Jan", "Kowalski", 1234, "ISWD", 1);
        Student student2 = new Student("Jan", "Kowalski", 1234, "ISWD");
        Student student3 = new Student("Jan", "Kowalski", 1234);
        Student student4 = new Student("Jan", "Kowalski");

        student1.setName("Adam");
        student1.setSurname("Nowak");
        Assert.assertEquals("Adam", student1.getName());
        Assert.assertEquals("Nowak", student1.getSurname());
        Assert.assertEquals(1234, student1.getIndexNumber());
        Assert.assertEquals("ISWD", student1.getSpeciality());
        Assert.assertEquals(1, student1.getYearOfStudy());

        Assert.assertEquals("Jan", student2.getName());
        Assert.assertEquals("Kowalski", student2.getSurname());
        Assert.assertEquals(1234, student2.getIndexNumber());
        Assert.assertEquals("ISWD", student2.getSpeciality());

        student2.setYearOfStudy(1);

        Assert.assertEquals(1, student2.getYearOfStudy());

        Assert.assertEquals("Jan", student3.getName());
        Assert.assertEquals("Kowalski", student3.getSurname());
        Assert.assertEquals(1234, student3.getIndexNumber());

        student3.setSpeciality("ISWD");
        student3.setYearOfStudy(1);

        Assert.assertEquals("ISWD", student3.getSpeciality());
        Assert.assertEquals(1, student3.getYearOfStudy());

        Assert.assertEquals("Jan", student4.getName());
        Assert.assertEquals("Kowalski", student4.getSurname());

        student4.setIndexNumber(1234);
        student4.setSpeciality("ISWD");
        student4.setYearOfStudy(1);

        Assert.assertEquals(1234, student4.getIndexNumber());
        Assert.assertEquals("ISWD", student4.getSpeciality());
        Assert.assertEquals(1, student4.getYearOfStudy());

    }

    @Test(timeout = 10000)
    public void testEx2_1() {

        String input = "Adam\n"
                + "Test\n"
                + "1234\n"
                + "ISWD\n"
                + "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Student student = new Student(new Scanner(in));

        Assert.assertEquals("Adam", student.getName());
        Assert.assertEquals("Test", student.getSurname());
        Assert.assertEquals(1234, student.getIndexNumber());
        Assert.assertEquals("ISWD", student.getSpeciality());
        Assert.assertEquals(1, student.getYearOfStudy());
    }

    @Test(timeout = 10000)
    public void testCircleField() {
        Circle circle = new Circle(2);
        System.out.println(Math.round(Math.PI * Math.pow(2, 2)));
        System.out.println(circle.area());
        Assert.assertEquals(Math.round(Math.PI * Math.pow(2, 2)), Math.round(circle.area()));
    }

    @Test(timeout = 10000)
    public void testCirclePerimeter() {
        Circle circle = new Circle(2);
        Assert.assertEquals(Math.round(2 * (Math.PI * 2)), Math.round(circle.perimeter()));
    }

    @Test(timeout = 10000)
    public void testSquareField() {
        Square square = new Square(2);
        Assert.assertEquals(Math.round(Math.pow(2, 2)), Math.round(square.area()));
    }

    @Test(timeout = 10000)
    public void testSquarePerimeter() {
        Square square = new Square(2);
        Assert.assertEquals(4 * 2, Math.round(square.perimeter()));
    }

    @Test(timeout = 10000)
    public void testRectangleField() {
        Rectangle rectangle = new Rectangle(2, 3);
        Assert.assertEquals(Math.round(2 * 3), Math.round(rectangle.area()));
    }

    @Test(timeout = 10000)
    public void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(2, 3);
        Assert.assertEquals((2 * 2) + (2 * 3), Math.round(rectangle.perimeter()));
    }

    @Test(timeout = 10000)
    public void testCubeSize() {
        Cube cube = new Cube(2);
        Assert.assertEquals(Math.round(Math.pow(2, 3)), Math.round(cube.volume()));
    }

    @Test(timeout = 10000)
    public void testConeSize() {
        Cone cone = new Cone(2, 2);
        Assert.assertEquals(Math.round((1.0 / 3.0) * Math.PI * Math.pow(2, 2) * 2), Math.round(cone.volume()));
    }

    @Test(timeout = 10000)
    public void testCuboidSize() {
        Cuboid cuboid = new Cuboid(2, 3, 4);
        Assert.assertEquals(Math.round(2 * 3 * 4), Math.round(cuboid.volume()));
    }

    @Test(timeout = 10000)
    public void testSphereSize() {
        Sphere sphere = new Sphere(2);
        Assert.assertEquals(Math.round((4.0 / 3) * Math.PI * Math.pow(2, 3)), Math.round(sphere.volume()));
    }


    @Test(timeout = 10000)
    public void testEx4() throws NullPointerException {

        Student s1 = new Student("Jan", "Nowak", 8234, "ISWD", 1);
        Student s20 = new Student("Grażyna", "Zeszczecina", 4434, "ISWD", 2);
        Student s31 = new Student("Tomasz", "Kowalski", 3334, "ISWD", 3);
        Student s99 = new Student("Janusz", "Gągorzelewski", 1114, "ISWD", 3);

        StudentGroup sg = new StudentGroup();
        sg.init();

        sg.setStudentDataAtIndex(1, s1.getName(), s1.getSurname(), s1.getIndexNumber(), s1.getSpeciality(), s1.getYearOfStudy());
        sg.setStudentDataAtIndex(20, s20.getName(), s20.getSurname(), s20.getIndexNumber(), s20.getSpeciality(), s20.getYearOfStudy());
        sg.setStudentDataAtIndex(31, s31.getName(), s31.getSurname(), s31.getIndexNumber(), s31.getSpeciality(), s31.getYearOfStudy());
        sg.setStudentDataAtIndex(99, s99.getName(), s99.getSurname(), s99.getIndexNumber(), s99.getSpeciality(), s99.getYearOfStudy());

        Assert.assertEquals("Jan", sg.group[1].getName());
        Assert.assertEquals("Nowak", sg.group[1].getSurname());
        Assert.assertEquals(8234, sg.group[1].getIndexNumber());
        Assert.assertEquals("ISWD", sg.group[1].getSpeciality());
        Assert.assertEquals(1, sg.group[1].getYearOfStudy());

        String s2 = sg.getDataOfAllStudents().split("\n")[20];
        Assert.assertEquals(true, s2.contains("Grażyna"));
        Assert.assertEquals(true, s2.contains("Zeszczecina"));
        Assert.assertEquals(true, s2.contains("4434"));
        Assert.assertEquals(true, s2.contains("ISWD"));
        Assert.assertEquals(true, s2.contains("2"));

        sg.setDefaultDataAtIndex(20);
        Assert.assertEquals("", sg.group[20].getName());
        Assert.assertEquals("", sg.group[20].getSurname());
        Assert.assertEquals(0, sg.group[20].getIndexNumber());
        Assert.assertEquals("", sg.group[20].getSpeciality());
        Assert.assertEquals(0, sg.group[20].getYearOfStudy());

        String s9 = sg.getStudentDataAtIndex(99).toString();
        Assert.assertEquals(true, s9.contains("Janusz"));

        Assert.assertEquals(true, sg.getDataOfAllStudents().contains(sg.getStudentsFromRange(30,32)));
    }
}
