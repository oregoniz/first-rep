package Calc;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double operand2 = 0;
        char operation;

        System.out.println("Введите число");
        double operand1 = scanner.nextInt();
        System.out.println("Какую операцию вы хотели бы совершить?");
        operation = scanner.next().charAt(0);

        while (operation != 's') {

            if (operation != 'c') {
                System.out.println("Введите число");
                operand2 = scanner.nextInt();
            } else System.out.println("Начинаем с начала");

            switch (operation) {
                case '+' -> operand1 += operand2;
                case '-' -> operand1 -= operand2;
                case '*' -> operand1 *= operand2;
                case '/' -> operand1 /= operand2;
                case 'c' -> operand1 = 0;
                default -> System.out.println("Недопустимый оператор, попробуйте еще раз");
            }
            System.out.println("Ваше число " + operand1);
            System.out.println("Какую операцию вы хотели бы совершить ?");
            operation = scanner.next().charAt(0);
        }
    }
}


