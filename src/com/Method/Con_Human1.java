package com.Method;

public class Con_Human1 {
static final int LIFESPAN = 100;
private String name;
private int age;
private float height;
public Con_Human1(String name, int age, float height) {
this.name = name;
this.age =age;
this.height=height;
}

    public static void main(String[] args) {
        Con_Human1 a = new Con_Human1("ravi", 24, 5);

        System.out.println("print:"+a.name);
        System.out.println("print:"+a.age);
        System.out.println("print:"+a.height);
    }


}