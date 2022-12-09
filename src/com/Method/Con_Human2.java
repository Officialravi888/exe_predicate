package com.Method;

public class Con_Human2 {
    static final int LIFESPAN = 100;
    private String name;
    private int age;
    private float height;
    public Con_Human2(String name, int age) {
    this.name = name;
    this.age=age;
    }
    public Con_Human2(String name, int age, float height) {
    this(name, age);
    this.height=height;
    }

    public static void main(String[] args) {
        Con_Human2 a = new Con_Human2("ravi", 23, 6);
        System.out.println("name:"+a. name+ " "+a.age);
        System.out.println("name:"+a. name+ " "+a.height);
        System.out.println("Height:"+a.height);
        System.out.println("age:"+a.age);
    }

}
