package model;

import model.interfaces.IAnimal;
import model.interfaces.IHunt;
import model.interfaces.IRun;
import model.interfaces.ISwim;

// Hint: missing an interface and a method implementation
public class Tiger implements ISwim, IAnimal, IRun, IHunt {

    @Override
    public void swim() {
        System.out.println("Tiger is swimming");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger is sleeping");
    }

    @Override
    public void flee() {
        System.out.println("Tiger is fleeing");
    }

    @Override
    public void eat() {
        System.out.println("Tiger is eating");
    }

    @Override
    public void run() {
        System.out.println("Tiger is running");
    }

    @Override
    public void hunt() {
        System.out.println("Tiger is hunting");
    }
}
