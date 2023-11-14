package com.sparta.mnm;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Atm {

    private int cash50;
    private int cash20;
    private int cash10;
    private int cash5;
    private int cash2;
    private int cash1;

    public Atm(int cash50, int cash20, int cash10, int cash5, int cash2, int cash1) {
        this.cash50 = cash50;
        this.cash20 = cash20;
        this.cash10 = cash10;
        this.cash5 = cash5;
        this.cash2 = cash2;
        this.cash1 = cash1;
    }

    public int getCash50() {
        return cash50;
    }

    public void setCash50(int cash50) {
        this.cash50 = cash50;
    }

    public int getCash20() {
        return cash20;
    }

    public void setCash20(int cash20) {
        this.cash20 = cash20;
    }

    public int getCash10() {
        return cash10;
    }

    public void setCash10(int cash10) {
        this.cash10 = cash10;
    }

    public int getCash5() {
        return cash5;
    }

    public void setCash5(int cash5) {
        this.cash5 = cash5;
    }

    public int getCash2() {
        return cash2;
    }

    public void setCash2(int cash2) {
        this.cash2 = cash2;
    }

    public int getCash1() {
        return cash1;
    }

    public void setCash1(int cash1) {
        this.cash1 = cash1;
    }

    @Override
    public String toString() {
        return "Atm{" +
                "cash50=" + cash50 +
                ", cash20=" + cash20 +
                ", cash10=" + cash10 +
                ", cash5=" + cash5 +
                ", cash2=" + cash2 +
                ", cash1=" + cash1 +
                '}';
    }

    // From ammount given find out the notes which the atm dispensed
    public void withdrawValue(int ammount) {
        int currentAmmount = ammount;
        // list of notes
        int[] notes = new int[]{50,20,10,5,2,1};
        // list of notes dispensed by machine
        int[] notesWithdrawn = new int[6];
        for (int i = 0; i < 6; i++) {
            notesWithdrawn[i] = currentAmmount/notes[i];
            currentAmmount = currentAmmount%notes[i];
        }
        System.out.println(outputWithdrawn(ammount, notesWithdrawn));
    }

    // Output the correct string wanted, about the notes withdrawn
    private StringBuilder outputWithdrawn(int ammount, int[] notesWithdrawn) {

        StringBuilder output = new StringBuilder("Customer withdraws £" + ammount + "\n");
        //System.out.println("Customer withdraws £" + ammount + "\n");

        // checks if note was taken
        for (int i = 0; i < 6; i++){
            if (notesWithdrawn[i] != 0) {
                // displays the note taken and updates Atm object
                if (i == 0) {
                    //System.out.println(notesWithdrawn[i] + " x £50");
                    output.append(notesWithdrawn[i]).append(" x £50\n");
                    this.setCash50(this.getCash50() - notesWithdrawn[i]);
                } else if (i == 1) {
                    //System.out.println(notesWithdrawn[i] + " x £20");
                    output.append(notesWithdrawn[i]).append(" x £20\n");
                    this.setCash20(this.getCash20() - notesWithdrawn[i]);
                } else if (i == 2) {
                    //System.out.println(notesWithdrawn[i] + " x £10");
                    output.append(notesWithdrawn[i]).append(" x £10\n");
                    this.setCash10(this.getCash10() - notesWithdrawn[i]);
                } else if (i == 3) {
                    //System.out.println(notesWithdrawn[i] + " x £5");
                    output.append(notesWithdrawn[i]).append(" x £5\n");
                    this.setCash5(this.getCash5() - notesWithdrawn[i]);
                } else if (i == 4) {
                    //System.out.println(notesWithdrawn[i] + " x £2");
                    output.append(notesWithdrawn[i]).append(" x £2\n");
                    this.setCash2(this.getCash2() - notesWithdrawn[i]);
                } else {
                    //System.out.println(notesWithdrawn[i] + " x £1");
                    output.append(notesWithdrawn[i]).append(" x £1\n");
                    this.setCash1(this.getCash1() - notesWithdrawn[i]);
                }
            }

        }
        return output;
    }
}
