import org.junit.Assert;
import org.junit.Test;
import pl.edu.ur.oopl4.zad2.Student;
import pl.edu.ur.oopl4.zad3.figures.flat.Circle;
import pl.edu.ur.oopl4.zad3.figures.flat.Rectangle;
import pl.edu.ur.oopl4.zad3.figures.flat.Square;
import pl.edu.ur.oopl4.zad3.figures.spatial.Cone;
import pl.edu.ur.oopl4.zad3.figures.spatial.Cube;
import pl.edu.ur.oopl4.zad3.figures.spatial.Cuboid;
import pl.edu.ur.oopl4.zad3.figures.spatial.Sphere;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 */
public class Tests {

    @Test (timeout = 10000)
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

        String input = "Adam\n" +
                "Test\n" +
                "1234\n" +
                "ISWD\n" +
                "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Student student = new Student(new Scanner(in));

        Assert.assertEquals("Adam", student.getName());
        Assert.assertEquals("Test", student.getSurname());
        Assert.assertEquals(1234, student.getIndexNumber());
        Assert.assertEquals("ISWD", student.getSpeciality());
        Assert.assertEquals(1, student.getYearOfStudy());
    }

    @Test(timeout = 10000)
    public void testCircleField(){
        Circle circle = new Circle(2);
        Assert.assertEquals(Math.round(Math.PI*Math.pow(2, 2)), Math.round(circle.area()));
    }

    @Test(timeout = 10000)
    public void testCirclePerimeter(){
        Circle circle = new Circle(2);
        Assert.assertEquals(Math.round(2*(Math.PI*2)), Math.round(circle.perimeter()));
    }

    @Test(timeout = 10000)
    public void testSquareField(){
        Square square = new Square(2);
        Assert.assertEquals(Math.round(Math.pow(2,2)), Math.round(square.area()));
    }

    @Test(timeout = 10000)
    public void testSquarePerimeter(){
        Square square = new Square(2);
        Assert.assertEquals(4*2, Math.round(square.perimeter()));
    }
    @Test(timeout = 10000)
    public void testRectangleField(){
        Rectangle rectangle = new Rectangle(2, 3);
        Assert.assertEquals(Math.round(2*3), Math.round(rectangle.area()));
    }

    @Test(timeout = 10000)
    public void testRectanglePerimeter(){
        Rectangle rectangle = new Rectangle(2, 3);
        Assert.assertEquals((2*2)+(2*3), Math.round(rectangle.perimeter()));
    }


    @Test(timeout = 10000)
    public void testCubeSize(){
        Cube cube = new Cube(2);
        Assert.assertEquals(Math.round(Math.pow(2, 3)), Math.round(cube.size()));
    }

    @Test(timeout = 10000)
    public void testConeSize(){
        Cone cone = new Cone(2, 2);
        Assert.assertEquals(Math.round((1.0/3.0)*Math.PI*Math.pow(2,2)*2), Math.round(cone.size()));
    }

    @Test(timeout = 10000)
    public void testCuboidSize(){
        Cuboid cuboid = new Cuboid(2, 3, 4);
        Assert.assertEquals(Math.round(2*3*4), Math.round(cuboid.size()));
    }

    @Test(timeout = 10000)
    public void testSphereSize(){
        Sphere sphere = new Sphere(2);
        Assert.assertEquals(Math.round((4.0/3)*Math.PI*Math.pow(2,3)*2), Math.round(sphere.size()));
    }

}
