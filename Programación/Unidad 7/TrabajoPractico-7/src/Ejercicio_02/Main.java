package Ejercicio_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public void main(String[] args) {
        Circle circle1 = new Circle("Primer círculo", 2.5);
        Circle circle2 = new Circle("Segundo círculo", 4);
        Rectangle rectangle1 = new Rectangle("Primer rectángulo", 2, 3);
        Rectangle rectangle2 = new Rectangle("Segundo rectángulo", 5, 8);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(rectangle1);
        shapes.add(rectangle2);

        for (Shape s : shapes) {
            System.out.println(s.calculateArea());
        }
    }
}
