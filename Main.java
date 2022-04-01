package com.metanit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        int x = in.nextInt();
        System.out.println("Введите Y");
        int y = in.nextInt();
        number v = new number(x, y);
        v.cat();
    }
}
class number{
    public int x;
    public int y;
    public number(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void cat(){
        if (x == 0){
            System.out.println("Переменная равна нулю, на ноль делить нельзя");
            if (y == 0){
                System.out.println("Переменная равна нулю, на ноль делить нельзя");
            }
        }
        double a = x + y; //знаменат
        double b = 1 + y; //числит
        double z = a/b;
        System.out.println("Получилось " + z );
    }
}
