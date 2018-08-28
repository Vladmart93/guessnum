package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random rand = new Random(); //объявляем новый метод random
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean userLost = true;

        for (int i = 1; i <= 10; i++) {
            int n = 11 - i;
            System.out.println("Введи свое число от 1 до 10. У Вас есть " + n + " попыток");
            int userNum = scan.nextInt();

            int myNum = rand.nextInt(10) + 1;
            System.out.println(myNum);

            int count +=1;

            if (userNum < myNum) {
                System.out.println("Ваше число меньше\n");
            } else if (myNum < userNum) {
                System.out.println("Ваше число больше\n");
            } else {
                System.out.println("Числа равны\n");
                System.out.println("Вы угодали с " + i + " попытки \n");
                userLost = false;
                break;
            }
        }
        if (userLost) {
            System.out.println("Вы проиграли \n");
        }
    }
}