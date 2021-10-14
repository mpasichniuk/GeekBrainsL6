package ru.geekbrains.lesson6;

public class HomeWork {
    public static void main(String[] args) {
       int count_cats = 0;
        int count_dogs = 0;
        int count_animals = 0;

        Cat cat = new Cat();
        cat.run(200);
        cat.swim(0);

        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);

        count_cats ++;
             System.out.println("Количество котов: " + count_cats);

        count_dogs ++;
        System.out.println("Количество собак: " + count_dogs);

        count_animals ++;
        System.out.println("Количество животных: " +count_animals);
        }


    }

