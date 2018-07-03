package com.ekonopaka.pricecalculator.com.ekonopaka.calculator.model;

public class Device {

    private final Type type;
    private final String name;
    private final Double price;

    enum Type {
        Main, Keyboard, Battery, Antenna, ExtensionModule, Indication
    }

    public Device(Type type, String name, Double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public static Device MainDevice(String name, Double price) {
        return new Device(Type.Main, name, price);
    }

    public static Device Keyboard(String name, Double price) {
        return new Device(Type.Keyboard, name, price);
    }

    public static Device Battery(String name, Double price) {
        return new Device(Type.Battery, name, price);
    }

    public static Device Antenna(String name, Double price) {
        return new Device(Type.Antenna, name, price);
    }

    public static Device ExtensionModule(String name, Double price) {
        return new Device(Type.ExtensionModule, name, price);
    }

    public static Device Indication(String name, Double price) {
        return new Device(Type.Indication, name, price);
    }

    public Type getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
