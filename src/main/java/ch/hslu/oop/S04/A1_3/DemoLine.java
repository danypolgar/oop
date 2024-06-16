package ch.hslu.oop.S04.A1_3;


import ch.hslu.oop.S03.A1_3.Line;
import ch.hslu.oop.S03.A1_3.Point;


public class DemoLine {

    public static void main(String[] args) {
        var start = new Point(1,2);
        final var end = new Point(3,4);
        final var line = new Line(start,end);
        System.out.println(line.getStart().getX());
        System.out.println(line.getStart().getY());
        System.out.println(line.getEnd().getX());
        System.out.println(line.getEnd().getY());

        start = null;
        System.out.println(line.getStart().getX());
    }

}
