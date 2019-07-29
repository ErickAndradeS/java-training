package com.teaminternational.training.application;

import com.teaminternational.training.model.Circulo;
import com.teaminternational.training.model.Rectangulo;
import com.teaminternational.training.model.Triangulo;

public class Main {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRadio(3);
        circulo.setArea(circulo.calcularArea());
        System.out.println(circulo.getArea());

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAncho(10);
        rectangulo.setLongitud(20);
        rectangulo.setArea(rectangulo.calcularArea());
        System.out.println(rectangulo.getArea());

        Triangulo triangulo = new Triangulo(10,20);
        triangulo.setArea(triangulo.calcularArea());
        System.out.println(triangulo.getArea());
    }
}
