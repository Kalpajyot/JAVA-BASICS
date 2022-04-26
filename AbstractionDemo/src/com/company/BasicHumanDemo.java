package com.company;
// Hhuman is the parant class and BasicHumanDemo is the subclass.
public class BasicHumanDemo extends Human{

    private String color;
    private double hairLength;

    public BasicHumanDemo(String name, int age, Gender gender, float height, String color, double hairLength) {
        super(name, age, gender, height);
        this.color = color;
        this.hairLength = hairLength;
    }

    public String getColor() {
        return color;
    }

    public double getHairLength() {
        return hairLength;
    }
}
