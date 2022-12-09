package com.Method;

public class Human1 {
static final int LIFESPAN = 100;
private String name;
    private int age;
    private float height;

    public Human1(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getTimeToLive() {
        int ttl = LIFESPAN - this.age;
        return ttl; //100-283=-183

    }

    public static void main(String[] args) {
        Human1 a = new Human1("ravi", 283, 2);
        a.getTimeToLive();
        System.out.println("value:"+a.getTimeToLive());

       int b = a.getTimeToLive();
        System.out.println("b:"+b);

    }

}
