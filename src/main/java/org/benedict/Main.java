package org.benedict;

import static org.benedict.ImageConversion.*;

public class Main {
    public static void main(String[] args) {
        int[][] img = {
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        };

        System.out.println("Pradinė būsena:");
        print2D(img);

        flip(10, img);
        System.out.println("\nInvertuota:");
        print2D(img);

        int[][] rotated = rotate(10, img);
        System.out.println("\nSukta naudojant papildomą masyvą:");
        print2D(rotated);

        rotateInline(10, img);
        System.out.println("\nSukta vietoje:");
        print2D(img);
    }

}