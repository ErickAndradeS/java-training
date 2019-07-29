package com.teaminternational.training.model;

public class Rectangulo extends Figura {

    private double longitud;
    private double ancho;

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public double calcularArea() {
        return longitud*ancho;
    }
}
