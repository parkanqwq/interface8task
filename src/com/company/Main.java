package com.company;

import com.company.Obstacles.Treadmill;
import com.company.Obstacles.Wall;
import com.company.interfacce.Act;
import com.company.interfacce.Obstacles;
import com.company.model.Cat;
import com.company.model.Human;
import com.company.model.Robot;

public class Main {

    private static Act[] acts = new Act[3];
    private static Obstacles[] obstacles = new Obstacles[6];

    public static void main(String[] args) {

        System.out.println();
        createArr();
        Beggin();
        Act();
    }

    private static void Beggin() {
        System.out.println("Будем бегать и прыгать");
        for (int i = 1; i < 7; i=i+2) {
            System.out.println("пробежать " + obstacles[i-1].hard());
            System.out.println("перепрыгнуть " + obstacles[i].hard());
        }
    }

    private static void Act(){
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 1; j < 7; j=j+2) {
                acts[i].run(obstacles[j-1].m());
                if (obstacles[j-1].m() > acts[i].getRun())
                    break;
                acts[i].jump(obstacles[j].m());
                if (obstacles[j].m() > acts[i].getJump())
                    break;
            }
        }
    }

    private static void createArr() {
        acts[0] = new Cat();
        acts[1] = new Human();
        acts[2] = new Robot();

        for (int j = 1; j < 7; j=j+2) {
            obstacles[j-1] = new Treadmill();
            obstacles[j] = new Wall();
        }


    }
}
