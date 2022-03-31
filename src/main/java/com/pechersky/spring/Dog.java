package com.pechersky.spring;

public class Dog implements Pet {
    @Override
    public void voice() {
        System.out.println("Bow-bow!");
    }
}
