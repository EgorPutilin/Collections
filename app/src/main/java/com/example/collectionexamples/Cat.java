package com.example.collectionexamples;

public class Cat {
    private String name;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private int age;

    public Cat() {

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
}
