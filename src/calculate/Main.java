package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// object

        char choice = 'Y';
        while (choice == 'Y') {

            System.out.println("Enter first number: ");
            int number1 = scanner.nextInt();

            System.out.println("Enter second number: ");
            int number2 = scanner.nextInt();

            System.out.println("Enter one of symbols : +, - , *,/ ");
            char symbol = scanner.next().charAt(0);

            Calculator obj = new Calculator(); // super class object
            switch (symbol) {
                case '+':
                    obj.addition(number1, number2);// super class method via object
                    break;
                case '/':
                    obj.division(number1, number2);
                    break;
                case '*':
                    obj.multiplication(number1, number2);
                    break;
                case '-':
                    obj.subtraction(number1, number2);
                    break;
                default:
                    System.out.println("Invalid symbol");
            }
            obj.caluculateResult(number1, number2, symbol);// call super class instance method with parameters
            System.out.println("would you like to do more calculation please enter Y or N :");

            choice = scanner.next().charAt(0);
            choice = Character.toUpperCase(choice);
        }
        scanner.close();
    }
}
