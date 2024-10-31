package Circumference;

public class CircleTest {
    public static void main(String[] args) {

        // Creating the objects
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(6);
        Circle c3 = new Circle(11);

        // Methods calls to the circle objects accordingly
        System.out.println("The circumference of the circle with a radius of 0 is: " + c1.getC());
        System.out.println("The circumference of the circle with a radius of 2 is: " + c2.getC());
        System.out.println("The circumference of the circle with a radius of 6 is: " + c3.getC());
    }
}
