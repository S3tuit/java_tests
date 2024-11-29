package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {

        Cup[] cups = {new Cup("red", 10.1, true),
                    new Cup("green", 10.2, true)};

        System.out.println(cups[1]);
    }

}