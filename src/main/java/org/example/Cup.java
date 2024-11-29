package org.example;

public class Cup {

    private String color;
    private Double temperature;
    private boolean isEmpty;

    Cup(String color, Double temperature, boolean isEmpty) {

        this.color = color;
        this.temperature = temperature;
        this.isEmpty = isEmpty;
    }

    //@Override
    public String toString() {
        return "Your cup color is " + color + " and temperature is " + temperature;
    }

    public void drink() {
        if (!this.isEmpty) {
            this.isEmpty = true;
            System.out.println("Drinking Cup");
        } else {
            System.out.println("Cup is empty");
        }
    }

    public double getTemperature() {
        if (this.temperature != null) {
            return this.temperature;
        } else {
            System.out.println("No coffee :(");
            return -1; // Default value
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isEmpty() {
        return this.isEmpty;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void fill(){
        this.isEmpty = false;
    }
}
