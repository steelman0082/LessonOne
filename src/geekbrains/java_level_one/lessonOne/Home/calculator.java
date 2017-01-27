package geekbrains.java_level_one.lessonOne.Home;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Wallb on 27.01.2017.
 */
public class calculator {

    public static void main(String[] args) {
        System.out.println("The Calculator.");
        calculator();
    }

    private static void calculator() {
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        float first = 0;
        float second = 0;
        int counter = 0;
        String divZeroMessage;
        String operator;
        System.out.println("Here we put numbers, operator, and get the result");
        do {
            System.out.print("Enter the operator (ex. + / * - ^) or 'exit' without quotes to quit! >>> ");
            operator = scanner.next();
            if (!Objects.equals(operator, "exit")) {
                System.out.print("Enter the first number, be sure not to input characters! >>> ");
                first = scanner.nextFloat();
                if (operator.equals("/")) {
                    do {
                        switch (counter) {
                            case 0:
                                divZeroMessage = "Enter the second number, should not be zero! >>> ";
                                break;
                            case 1:
                                divZeroMessage = "Come on, don't try zero here! >>> ";
                                break;
                            case 2:
                                divZeroMessage = "Seriously? O_o >>> ";
                                break;
                            case 3:
                                divZeroMessage = "I give up, do whatever you want... >>> ";
                                break;
                            default:
                                divZeroMessage = "No zeroes in divider allowed! >>> ";
                                break;
                        }
                        System.out.print(divZeroMessage);
                        second = scanner.nextFloat();
                        counter++;
                    } while (second == 0);
                } else {
                    System.out.print("Enter the second number, rules are the same! >>> ");
                    second = scanner.nextFloat();
                }
            }
            System.out.print("Your result is: ");
            switch (operator) {
                case "+":
                    System.out.println(first + second);
                    break;
                case "-":
                    System.out.println(first - second);
                    break;
                case "*":
                    System.out.println(first * second);
                    break;
                case "/":
                    System.out.println(first / second);
                    break;
                case "^":
                    System.out.println(power(first, second));
                    break;
                case "exit":
                    System.out.println("getting outta here!");
                    work = false;
                    break;
            }
        } while (work);
    }

    private static float power(float base, float significative){
        float res = 1.0f;
        for (int i = 0; i < significative; i++) {
            res *= base;
        }
        return res;
    }

}
