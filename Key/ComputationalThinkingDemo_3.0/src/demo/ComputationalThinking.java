package demo;

public class ComputationalThinking {
    public static void main(String[] args) {
        double area1;
        double area2;
        double area3;
        double area4;
        double area5;

        double pi = 3.1416;  // a variable introduced to eliminate redundancy
        double radius;  // a variable that will actually vary!

        radius = 1.0;
        area1 = pi * radius * radius;
        radius = 2.0;
        area2 = pi * radius * radius;
        radius = 3.0;
        area3 = pi * radius * radius;
        radius = 4.0;
        area4 = pi * radius * radius;
        radius = 5.0;
        area5 = pi * radius * radius;

        System.out.println("area1 = " + area1);
        System.out.println("area1 = " + area2);
        System.out.println("area1 = " + area3);
        System.out.println("area1 = " + area4);
        System.out.println("area1 = " + area5);
    }
}
