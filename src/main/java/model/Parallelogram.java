package model;

public class Parallelogram extends Rectangle {


    protected double firstSide;
    protected double secondSide;
    protected double thirdSide;
    protected double fourthSide;



    public Parallelogram() {
    }

    public Parallelogram(double firstSide, double secondSide, double thirdSide, double fourthSide) {
        if(validate(firstSide, secondSide, thirdSide, fourthSide)) {
            this.name = "Паралеллограмм";
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
            this.fourthSide = fourthSide;
        }
    }

    private boolean validate(double firstSide, double secondSide, double thirdSide, double fourthSide){
        return (firstSide + secondSide > thirdSide + fourthSide) &&
                (secondSide + thirdSide > firstSide + fourthSide) &&
                (secondSide + fourthSide > firstSide + thirdSide);
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
