package com.metanit;

import java.util.Scanner;

class number{
    public int x;
    public int y;
    public number(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void cat(){
        int a = x + y;
        if (a == 0){
            System.out.println("Числитель равен нулю, на ноль делить нельзя");
        }
        int b = 1 + y;
        if (b == 0){
            System.out.println("Знаменатель равен нулю, на ноль делить нельзя");
        }
        int z = a/b;
        System.out.println("Получилось" + z);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);
        System.out.println("Введите x");
        int x = cat.nextInt();
        System.out.println("Введите Y");
        int y = cat.nextInt();
        number v = new number(x, y);
        v.cat();
    }
}
