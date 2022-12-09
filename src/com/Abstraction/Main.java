package com.Abstraction;

public class Main {
    public static void main(String[] args) {
        Abs3 a = new Abs3("ravi", 23345);
        System.out.println(a.getName() +"  "+a.getId());
        Abs2 obj=new Abs2("Rovert Vogel",89);
        System.out.println(obj.getId());
    }
}
