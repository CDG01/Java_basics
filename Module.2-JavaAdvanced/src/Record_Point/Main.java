package Record_Point;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2,5); // costruttore implicito
        Point p2 = new Point(2,5);

        System.out.println("x of p1: " + p1.x());
        System.out.println("y of p1: " + p1.y());
        System.out.println("p1: " + p1);
        System.out.println("p1 equals p2? " + p1.equals(p2)); // Override implicito di equals() che rende due istanze distinte uguali (nonostante spazi di memoria diversi)
        System.out.println("hashcode of p1" + p1.hashCode());


    }
}
