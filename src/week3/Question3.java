package week3;
//Develop a simple program to demonstrate the
// concept of abstract classes and interfaces.

abstract class Animal {

    abstract void makeSound();


    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}


interface Pet {

    void play();
}


 class Dog extends Animal implements Pet {

    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }


    @Override
    public void play() {
        System.out.println("The dog is playing fetch.");
    }
}


public class Question3 {
    public static void main(String[] args) {

        Dog myDog = new Dog();


        myDog.makeSound();
        myDog.play();
        myDog.sleep();
    }
}
