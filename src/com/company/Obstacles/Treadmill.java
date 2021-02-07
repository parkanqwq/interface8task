package com.company.Obstacles;

import com.company.interfacce.Obstacles;

import java.util.Random;

public class Treadmill implements Obstacles {

    private int treadmill;

    @Override
    public int hard() {
        return treadmill = randomDistance();
    }

    @Override
    public int m() {
        return treadmill;
    }

    private static int randomDistance(){
        return new Random().nextInt(50) + 50;
    }
}
