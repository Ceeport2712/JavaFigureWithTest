package model;

public class Square extends Rectangle {

    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;
    protected double fourthSide;



    public Square() {
    }

    public Square (double firstSide, double secondSide, double thirdSide, double fourthSide) {
        if(validate(firstSide, secondSide, thirdSide, fourthSide)) {
            this.name = "Квадрат";
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
            this.fourthSide = fourthSide;
        }
    }

    private boolean validate(double firstSide, double secondSide, double thirdSide, double fourthSide){
        return (firstSide + secondSide >= thirdSide + fourthSide);
    }

    @Override
    public String toString() {
        return name + " со сторонами " +  firstSide +
                ", " + secondSide + ", " + thirdSide + "," + fourthSide ;
    }

    @Override
    public static double getPerimeter() {
        return firstSide + secondSide + thirdSide + fourthSide;
    }
}