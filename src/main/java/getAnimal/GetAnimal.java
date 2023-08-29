package getAnimal;

import animals.Cat;
import animals.Dog;
import animals.Duck;
import enums.TypeAnimals;
import parents.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class GetAnimal {

    public void add(Scanner sc, ArrayList<Animal> animal) {
        int age;
        int weight;
        try {
            System.out.println("Какое животное(cat/dog/duck)?");
            TypeAnimals next = TypeAnimals.valueOf(sc.next().toUpperCase());
            System.out.println("Введите имя:");
            String name = sc.next();
            do {
                System.out.println("Введите возраст:");
                while (!sc.hasNextInt()) {
                    System.out.println("Это не число!");
                    sc.next();
                }
                age = sc.nextInt();

            } while (age <= 0);
            do {
                System.out.println("Введите вес:");
                while (!sc.hasNextInt()) {
                    System.out.println("Это не число!");
                    sc.next();
                }
                weight = sc.nextInt();
            } while (weight <= 0);
            System.out.println("Введите цвет:");
            String color = sc.next();

            switch (next) {
                case CAT -> animal.add(new Cat(name, age, weight, color));
                case DOG -> animal.add(new Dog(name, age, weight, color));
                case DUCK -> animal.add(new Duck(name, age, weight, color));
            }
        } catch (Exception e) {
            System.out.println("Упс, вы что-то напутали");
        }
    }
}
