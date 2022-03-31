package com.pechersky.spring;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Person> friends;

    Person() {
        System.out.println("Person bean was created");
    }

    public String toString() {
        return String.format("%s, %d", name, age);
    }

    public void printFriends() {
        friends.forEach(person -> System.out.print(person + " "));
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFriends(List<Person> friends) {
        this.friends = friends;
    }
}
