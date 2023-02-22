package com.company;

public class Dog extends Animal
{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String skin;

    public Dog(String name, int weight, int size, int eyes, int legs,int tail ,int teeth, String skin)
    {
        super(name, 1, weight, size, 1);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.skin=skin;

    }
    private void chew()
    {
        System.out.println("Dog.chew() was called");

    }
    @Override
    public void eat()
    {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    public void walk()
    {
        System.out.println("Dog.walk() is called");
        move(5);
    }
    public void run()
    {
        System.out.println("Dog.run() is called");
        move(10);
    }
    public void moveLegs(int speed)
    {
        System.out.println("Dog.moveLegs() was called");
    }

    @Override
    public void move(int speed)
    {
        super.move(speed);
        moveLegs(speed);
    }
}
