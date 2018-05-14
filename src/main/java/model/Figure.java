package model;

public abstract class Figure {

    protected String name;

    @Override
    public abstract String toString();

    protected abstract double getPerimeter();

}
