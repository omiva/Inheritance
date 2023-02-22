package com.company;
public class Animal
{
    private String name;
    private int brain;
    private int weight;
    private int size;
    private int body;

    public Animal(String name, int brain, int weight, int size, int body)
    {
        this.name = name;
        this.brain = brain;
        this.weight = weight;
        this.size = size;
        this.body = body;
    }

    public void eat()
    {
        System.out.println("Animal.eat() is called");
    }

    public void move(int speed)
    {
        System.out.println("Animal.move() was called Animal is moving at "+speed+" km/h");
    }
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }

    public int getBody() {
        return body;
    }
}
