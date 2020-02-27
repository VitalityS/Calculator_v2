package Calculation.Arithmetic;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");

        int firstNum = in.nextInt();
        System.out.println("Введите арифметическую операцию: '+' '-' '*' '/'");
        String operation = in.next();
        System.out.println("Введите второе число");
        int lastNum = in.nextInt();

        switch (operation) {
            case "+":
                Addition sum = new Addition(firstNum, lastNum, operation);
                sum.resultOperation(firstNum, lastNum, operation);
        }
        switch (operation) {
            case "-":
                Subtraction sub = new Subtraction(firstNum, lastNum, operation);
                sub.resultOperation(firstNum, lastNum, operation);
        }
        switch (operation) {
            case "*":
                Multiplication mp = new Multiplication(firstNum, lastNum, operation);
                mp.resultOperation(firstNum, lastNum, operation);
        }
        switch (operation) {
            case "/":
                try {
                    Division div = new Division(firstNum, lastNum, operation);
                    div.resultOperation(firstNum, lastNum, operation);
                } catch (Exception e) {
                   // e.printStackTrace();
                    System.err.println("Деление на ноль не возможно!");
                }
        }


    }
}
