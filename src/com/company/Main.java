package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Enter number A: ");
        try {
            calculator.A = input.nextDouble();
        } catch (Exception ex) {
            System.out.println("Ошибка выбора операции. Введите целое число!");
            System.exit(0);
        }

        System.out.println("Enter number B: ");
        try {
            calculator.B = input.nextDouble();
        } catch (Exception ex) {
            System.out.println("Ошибка выбора операции. Введите целое число!");
            System.exit(0);
        }

        while (true) {

            System.out.println("Enter number of operation : 1.+\t 2.-\t 3.*\t 4./\t 5.%\t 6.Enter new values\t 0.Exit\t ");
            calculator.numberOfOperation = input.next();
            switch (calculator.numberOfOperation) {
                case "1":
                    System.out.println("Result is " + calculator.Sum());
                    break;
                case "2":
                    System.out.println("Result is " + calculator.Subtraction());
                    break;
                case "3":
                    System.out.println("Result is " + calculator.Multiplication());
                    break;
                case "4":
                    System.out.println("Result is " + calculator.Division());
                    break;
                case "5":
                    System.out.println("Result is " + calculator.Persent());
                    break;
                case "0":
                    System.exit(0);
                    break;
                case "6":
                    System.out.println("Enter number A: ");
                    try {
                        calculator.A = input.nextDouble();
                    } catch (Exception ex) {
                        System.out.println("Ошибка выбора операции. Введите целое число!");
                        System.exit(0);
                    }
                    System.out.println("Enter number B: ");
                    try {
                        calculator.B = input.nextDouble();
                    } catch (Exception ex) {
                        System.out.println("Ошибка выбора операции. Введите целое число!");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Enter correct value!");
                    break;
            }
        }
    }
}
