package ru.geekbrains.lesson6;

public class Dog extends Animal{
    public final int RUN_LENGTH = 500;
    public final int SWIM_LENGTH = 10;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= RUN_LENGTH)) System.out.println("run: true");
        else System.out.println("run: false");
    }
    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= SWIM_LENGTH)) System.out.println("swim: true");
        else System.out.println("swim: false");
    }
}
