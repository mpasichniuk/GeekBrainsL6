package ru.geekbrains.lesson6;

public class Cat extends Animal{
    private final int RUN_LENGTH = 200;
    @Override
     void run(int length) {
        if ((length >= 0) && (length <= RUN_LENGTH)) System.out.println("run: true");
        else System.out.println("run: false");
    }
    @Override
    void swim(int length) {
        System.out.println("swim: false");
    }
}
