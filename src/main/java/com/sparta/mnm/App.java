package com.sparta.mnm;

public class App {

    public static void main(String[] args) {

        Atm myAtm = new Atm(12,20,50,100,250,500);
        myAtm.withdrawValue(157);

        System.out.println(myAtm);
    }
}