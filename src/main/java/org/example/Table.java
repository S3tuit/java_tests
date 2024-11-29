package org.example;

import java.util.ArrayList;

public class Table {

    ArrayList<Cup> cupsOnTable = new ArrayList<>();
    private static int numOfCups = 0;

    void putOnTable(Cup cup) {
        this.cupsOnTable.add(cup);
        numOfCups++;
        System.out.println("Your "+ cup + " has been put on table");
    }

    static int getNumOfCups() {
        return numOfCups;
    }
}
