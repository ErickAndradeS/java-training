package com.teaminternational.training.model;

public class Circulo extends Figura {

    private double radio;
    private static final double PI = Math.PI;

    public Circulo(){}

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI*(Math.pow(radio,2));
    }
}
