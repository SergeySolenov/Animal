import enums.Command;
import getAnimal.GetAnimal;
import parents.Animal;

import java.util.ArrayList;
import java.util.Scanner;

import static enums.Command.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GetAnimal getAnimal = new GetAnimal();
        ArrayList<Animal> animal = new ArrayList<>();
        while (true) {
            System.out.println("Введите команду (add/list/exit):");
            Command com = Command.valueOf(sc.next().toUpperCase());
            if (com == ADD) {
                getAnimal.add(sc, animal);

            }
            if (com == LIST) {
                for (Animal el : animal) {
                    System.out.println(el.toString());

                }
            }
            if (com == EXIT) {
                sc.close();
                System.exit(0);
            }

        }
    }
}
