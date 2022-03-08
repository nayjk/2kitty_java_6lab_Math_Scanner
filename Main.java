package com.metanit;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        int x = in.nextInt();
        System.out.println("Введите Y");
        int y = in.nextInt();
        double z;
        class number{
            public int x;
            public int y;
            public number(int x, int y){
                this.x = x;
                this.y = y;
            }

        }
        double a = x + y;
        double b = 1 + y;
        if (b == 0){
            System.out.println("Знаменатель равен нулю, на ноль делить нельзя");
        }
        else{
            z = a/b;
            System.out.println("Получилось " + z);
        }
    }
}