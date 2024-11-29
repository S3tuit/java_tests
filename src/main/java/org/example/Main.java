package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {

        System.out.println(Table.getNumOfCups());
        Cup cup = new Cup("red", 10.1, true);
        Table table = new Table();
        Table table1 = new Table();

        Cup cup1 = new Cup("green", 10.2, true);
        cup1.what();

        table.putOnTable(cup);
        table1.putOnTable(cup1);
        table1.putOnTable(cup1);
        System.out.println(cup1.weight);
    }

}