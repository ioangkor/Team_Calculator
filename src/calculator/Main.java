package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Team Calculator started!");

        Scanner scanner=new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result=0;

        System.out.print("Enter the first number: ");
        num1=scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^, log)");
        operator=scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2=scanner.nextDouble();

        switch(operator){
            case  '+' ->result=num1+num2;
            case '/' -> {
                while (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed!");
                    System.out.print("Please enter a non-zero number: ");
                    num2 = scanner.nextDouble();
                }
                result = num1 / num2;
            }

            case '*' -> result = num1 *num2;

            case '-' -> result = num1 - num2;

        }
        System.out.println(result);
        scanner.close();


    }
}