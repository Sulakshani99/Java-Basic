import java.sql.SQLSyntaxErrorException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15,8,15,8,17); //instance
        Triangle triangleB = new Triangle(3,2.598,3,3,3);

        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);
        System.out.println(triangleA.sideLenThree); //base and height are non-static instance variable

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);
        System.out.println(triangleB.base);

        System.out.println(Triangle.numOfSides);
    }
}