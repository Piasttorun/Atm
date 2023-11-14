package com.sparta.mnm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AtmTest {

    @Test
    @DisplayName("Check for given test case base instantiation")
    public void checkBase(){
        Atm myAtm = new Atm(1,2,3,4,5, 6);
        Assertions.assertEquals("Atm{cash50=1, cash20=2, cash10=3, cash5=4, cash2=5, cash1=6}", myAtm.toString());
    }

    @Test
    @DisplayName("Check for given test case (withdraw 157)")
    public void check157(){
        Atm myAtm = new Atm(12,20,50,100,250,500);
        myAtm.withdrawValue(157);
        Assertions.assertEquals("Atm{cash50=9, cash20=20, cash10=50, cash5=99, cash2=249, cash1=500}", myAtm.toString());
    }

    @Test
    @DisplayName("Check for given test case (withdraw 0)")
    public void check0(){
        Atm myAtm = new Atm(12,20,50,100,250,500);
        myAtm.withdrawValue(0);
        Assertions.assertEquals("Atm{cash50=12, cash20=20, cash10=50, cash5=100, cash2=250, cash1=500}", myAtm.toString());
    }
}
