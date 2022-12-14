import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(){
        setRadius();
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();
        this.radius = radius;
    }

    public String toString(){
        return "This circle has a radius of " + radius;
    }

    public double getArea(){
        return 3.14*Math.pow(radius,2);
    }
}