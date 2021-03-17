package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.next();
        System.out.println("Введите фамилию: ");
        String sername = in.next();
        System.out.println("Введите отчество: ");
        String fathername = in.next();
        System.out.println("Введите возраст: ");
        int num = in.nextInt();

        int birthday = 2021 - num;

        System.out.printf("Вас зовут: %s %s %s. Ваш год рождения - %d \n", sername, name, fathername, birthday);
        //System.out.println(name + " " + sername);
        in.close();

    }
}
