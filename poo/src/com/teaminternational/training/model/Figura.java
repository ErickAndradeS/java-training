package com.teaminternational.training.model;

public abstract class Figura {

    private double area;

    public Figura(){}

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public abstract double calcularArea();
}
