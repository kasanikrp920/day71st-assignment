package com.trimindtech.training.day07.day07P3;

public class TestAnimal {
    public static void main(String[] args) {
       //usng subclasses
        Cat cat1=new Cat();
        cat1.greetings();

        Dog dog1=new Dog();
        dog1.greetings();

        BigDog bigDog1=new BigDog();
        bigDog1.greetings();

        //using polymorphism
      Animal a1=new Animal();
        a1.greetings();
        Animal a2=new Dog();
        a2.greetings();
        Animal a3=new BigDog();
        a3.greetings();

        Animal a4=new Animal();
    //Downcast

        Dog dog2=(Dog)a2;
        BigDog bigDog2=(BigDog)a3;
        Dog dog3=(Dog)a3;
       // Cat c1=(Cat)a2;

        dog2.greetings(dog3);
        dog3.greetings(dog2);
        dog2.greetings(bigDog2);
        bigDog2.greetings(dog2);
        bigDog2.greetings(bigDog1);


    }
}
