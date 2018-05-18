package model;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.toString());
        System.out.println("Периметр фигуры равен " + triangle.getPerimeter());
    }

}