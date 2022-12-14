public class Main {
    public static void main(String[] args) {
//        Circle khue = new Circle();
//        System.out.printf("The area of the circle: %f\n", khue.getArea());
//        System.out.println(khue);
//
//        Circle khue1 = new Circle(20);
//        System.out.println(khue1)

        Cyclinder khuedzvcl = new Cyclinder();
        System.out.println(khuedzvcl);
        System.out.println("Area: "+khuedzvcl.getArea());

        Cyclinder khuedz = new Cyclinder(20);
        System.out.println(khuedz);
        System.out.println("The area of the cyclinder: " + khuedz.getArea());

        System.out.println(khuedz + "test");

    }
}