package com.Operator;

public class Log_Operator {
    public static void main(String[] args) {
        int x=12;
        int y=35;
        int z=75;
        boolean a = true;

        a=x<y && (z=x+y)>15;
        System.out.println("a = " + a + ", and z = " + z);
    }
}
