package com.teaminternational.application;

import com.teaminternational.model.Circulo;
import com.teaminternational.model.Rectangulo;
import com.teaminternational.model.Triangulo;

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
