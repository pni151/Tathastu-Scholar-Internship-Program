//Write a Java program to perform basic Calculator operations.
import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {

    char op;
    Double number1, number2, result;

    // create an object for Scanner class for taking input
    Scanner in = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, or /: ");
    op = in.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first operand: ");
    number1 = in.nextDouble();

    System.out.println("Enter second operand: ");
    number2 = in.nextDouble();

    switch (op) {

      // performs addition between numbers
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      // performs subtraction between numbers
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      // performs multiplication between numbers
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      // performs division between numbers
      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    in.close();
  }
}