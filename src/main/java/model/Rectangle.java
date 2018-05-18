package model;

public class Rectangle extends  Figure {
    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;
    protected double fourthSide;



    public Rectangle() {
    }

    public Rectangle(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        if(validate(firstSide, secondSide, thirdSide, fourthSide)) {
            this.name = "Прямоугольник";
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
            this.fourthSide = fourthSide;
        }
    }

    private boolean validate(double firstSide, double secondSide, double thirdSide, double fourthSide){
        return (firstSide + secondSide + thirdSide > fourthSide)&&
        (fourthSide + firstSide + secondSide > thirdSide)&&
        (fourthSide + firstSide + thirdSide > secondSide)&&
        (fourthSide + secondSide + thirdSide > firstSide);


    }

    @Override
    public String toString() {
        return name + " со сторонами " +  firstSide +
                ", " + secondSide + ", " + thirdSide + "," + fourthSide ;
    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide + fourthSide;
    }
}
