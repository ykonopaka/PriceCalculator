package com.ekonopaka.pricecalculator.com.ekonopaka.calculator.model;

public class Component {
    private final String name;
    private final Double price;

    public Component(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public static Component Component(String name, Double price) {
        return new Component(name, price);
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
