import java.util.Scanner;

public class Cyclinder extends Circle {
    private double height;

    public Cyclinder() {
        setHeight();
    }

    public Cyclinder(double height) {
        this.height = height;
    }

    public Cyclinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double height = input.nextDouble();
        this.height = height;
    }

    public double getVolume() {
        return Math.pow(getRadius(),2)*Math.PI*height;
    }

    @Override
    public double getArea(){
        return 2*getRadius()*height*Math.PI + 2*Math.PI*Math.pow(getRadius(),2);
    }

    @Override
    public String toString(){
        return "This cyclinder has a height of " + height + " and a radius of " + getRadius();
    }
}
