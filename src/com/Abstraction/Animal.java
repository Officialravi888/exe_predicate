package com.Abstraction;

abstract class Animal {
    public abstract void running();
    public void horse(){
        System.out.println("horse is running");
    }
}
class dog extends Animal{
    public void running() {
        System.out.println("dog is very fast running");
    }
}
class main{
    public static void main(String[] args) {
        dog a =new dog();
        a.horse();
        a.running();
    }
}
