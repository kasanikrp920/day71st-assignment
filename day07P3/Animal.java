package com.trimindtech.training.day07.day07P3;

public class Animal {
    public void greetings(){

    }
}
class Cat extends Animal{
    @Override
    public void greetings() {
        System.out.println("meow!");
    }
}
class Dog extends Animal{
    @Override
    public void greetings() {
        System.out.println("woof!");
    }
    public void greetings(Dog another) {
        System.out.println("woooooof!");
    }
}
class BigDog extends Dog{
    @Override
    public void greetings() {
        System.out.println("woow!");
    }
    public void greetings(Dog another) {
        System.out.println("woooooooowwwwww!");
    }
}

