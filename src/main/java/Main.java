import animals.*;
import enums.TypeAnimals;
import pearents.Animal;

import java.util.ArrayList;
import java.util.Scanner;

import static enums.Command.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animal = new ArrayList<>();
        while (true) {
            System.out.println("Введите команду (add/list/exit):");
            String com = sc.next();
            com = com.toUpperCase();
            if (ADD.toString().equals(com)) {
                boolean hell = true;
                while (hell) {
                    try {
                        System.out.println("Какое животное(cat/dog/duck)?");
                        TypeAnimals next = TypeAnimals.valueOf(sc.next().toUpperCase());
                        switch (next) {
                            case CAT -> {
                                System.out.println("Введите: имя, возраст, вес, цвет");
                                animal.add(new Cat(sc.next(), sc.nextInt(), sc.nextInt(), sc.next()));
                                hell = false;
                            }
                            case DOG -> {
                                System.out.println("Введите: имя, возраст, вес, цвет");
                                animal.add(new Dog(sc.next(), sc.nextInt(), sc.nextInt(), sc.next()));
                                hell = false;
                            }
                            case DUCK -> {
                                System.out.println("Введите: имя, возраст, вес, цвет");
                                animal.add(new Duck(sc.next(), sc.nextInt(), sc.nextInt(), sc.next()));
                                hell = false;
                            }

                        }
                    } catch (Exception e) {
                        System.out.println("Упс, вы что-то напутали");
                    }

                }
            }
            if (LIST.toString().equals(com)) {
                for (Animal el : animal) {
                    System.out.println(el.toString());

                }
            }
            if (EXIT.toString().equals(com)) {
                sc.close();
                System.exit(0);
            }

        }
    }
}
