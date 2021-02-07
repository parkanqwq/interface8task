package com.company.Obstacles;

import com.company.interfacce.Obstacles;

import java.util.Random;

public class Wall implements Obstacles {

    private int wall;

    @Override
    public int hard() {
        return wall = randomJump();
    }

    @Override
    public int m() {
        return wall;
    }

    private static int randomJump(){
        return new Random().nextInt(3) + 1;
    }
}
