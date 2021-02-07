package com.company.model;
import com.company.interfacce.Act;

public class Robot implements Act {

    @Override
    public void run(int treadmill) {
        if (getRun() >= treadmill) System.out.println("Robot успешно пробежал");
        else System.out.println("Robot не смог пробежал");
    }

    @Override
    public void jump(int wall) {
        if (getJump() >= wall) System.out.println("Robot успешно перепрыгнул");
        else System.out.println("Robot не смог перепрыгнул");
    }

    public int getRun() {
        return 110;
    }

    public int getJump() {
        return 4;
    }
}
