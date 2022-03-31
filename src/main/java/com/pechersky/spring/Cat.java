package com.pechersky.spring;

public class Cat implements Pet {
    @Override
    public void voice() {
        System.out.println("Meow-meow..");
    }
}
