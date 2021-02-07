package com.company.model;
import com.company.interfacce.Act;

public class Human implements Act {

    @Override
    public void run(int treadmill) {
        if (getRun() >= treadmill) System.out.println("Human успешно пробежал");
        else System.out.println("Human не смог пробежал");
    }

    @Override
    public void jump(int wall) {
        if (getJump() >= wall) System.out.println("Human успешно перепрыгнул");
        else System.out.println("Human не смог перепрыгнул");
    }

    public int getRun() {
        return 90;
    }

    public int getJump() {
        return 2;
    }
}
