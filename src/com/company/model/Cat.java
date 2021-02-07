package com.company.model;
import com.company.interfacce.Act;

public class Cat implements Act {

    @Override
    public void run(int treadmill) {
        if (getRun() >= treadmill) System.out.println("Cat успешно пробежать");
        else System.out.println("Cat не смог пробежать");
    }

    @Override
    public void jump(int wall) {
        if (getJump() >= wall) System.out.println( "Cat успешно перепрыгнуть");
        else System.out.println("Cat не смог перепрыгнуть");
    }

    public int getRun() {
        return 60;
    }

    public int getJump() {
        return 1;
    }
}
