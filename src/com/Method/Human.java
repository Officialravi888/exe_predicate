package com.Method;

public class Human {
    public static final int LIFESPAN = 100;
private String name;
private int age;
private float height;

    public Human() {
        this.age = age;
    }

    public void computeAndPrintTtl() {
            int ttl = LIFESPAN - this.age;
            System.out.println("Time to live: " + ttl);
        }
        public static void main(String[] args) {
            Human h =new Human();
            h.computeAndPrintTtl();

    }
}
