package java21;

public class RecordPattern {
    record Point(int x, int y) {}

    public static void main(String[] args) {

        //Java 17+
        Point point1 = new Point(1, 2);
        if(point1 instanceof Point p) {
            System.out.println(p.x());
            System.out.println(p.y());
        }


        //Java 21
        Point point2 = new Point(2,3);
        if(point2 instanceof Point(int a, int b)) {
            System.out.println(a);
            System.out.println(b);
        }
    }

}
