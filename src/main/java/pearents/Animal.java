package pearents;

import java.util.Scanner;

public abstract class Animal implements IAnimal {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.color = color;
        if (age < 0) {
            System.out.println("Вы ввели отрицательное число в поле возраст, попробуйте ввести его снова:");
            Scanner sc = new Scanner(System.in);
            this.age = sc.nextInt();
        }
        else this.age = age;;
        if (weight < 0) {
            System.out.println("Вы ввели отрицательное число в поле вес, попробуйте ввести его снова:");
            Scanner sc = new Scanner(System.in);
            this.weight = sc.nextInt();
        }
        else this.weight = weight;


    }

    public void say(){

        System.out.println("Я говорю");
    }
    public void go(){

        System.out.println("Я иду");
    }
    public void drink(){

        System.out.println("Я пью");
    }
    public void eat(){

        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        String old = "";
        if (age % 10 == 1)
            old = "год";
        else if(age % 10 == 0 || age % 10 >= 5)
            old = "лет";
        else if(age % 10 >= 2 && age % 10 <= 4)
            old = "года";
        if ((age % 100 >= 11) && (age % 100 <= 14))
            old = "лет";
        return "Привет! меня зовут " + name + ", мне " + age + " " + old + ", я вешу - " + weight + " кг, мой цвет - " + color;

    }
}
