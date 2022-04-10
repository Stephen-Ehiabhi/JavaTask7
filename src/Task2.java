import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){

    }
}


abstract class Animal {
    protected String name, age, weight_fields;

    public abstract void Eat();
    public abstract void getVoice();

}

class Mammal extends Animal{
    public void Eat(){
      System.out.println("Eat");
    }

    public void getVoice(){
        System.out.println("getVoice");
    }
}

class Bird extends Animal{
    protected String name, age, weight_fields;

}

class Fish extends Animal{

}

class Dog extends Mammal{

}

class BlowFish extends Fish{

}

class Pigeon extends Bird{

}