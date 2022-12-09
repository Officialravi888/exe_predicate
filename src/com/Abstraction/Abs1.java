package com.Abstraction;

public class Abs1 {
        private String name;
        private int age;
        private float height;

        public Abs1(String name, int age, float height) {
            this.name= name;
            this.age=age;
            this.height = height;
        }

    public String getName() {

            return name;
    }

    public void setName(String name) {

            this.name = name;
    }

    public int getAge() {

            return age;
    }

    public void setAge(int age) {

            this.age = age;
    }

    public float getHeight() {

            return height;
    }

    public void setHeight(float height) {

            this.height = height;
    }

    @Override
    public String toString() {
        return "Abs1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
            Abs1 a = new Abs1("Ravi", 23, 5);
        System.out.println(a.age);
        a.getName();


    }

}
