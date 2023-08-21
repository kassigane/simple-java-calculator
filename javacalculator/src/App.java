import java.util.Scanner;

/**
 * This class implements a simple calculator that takes user input for an operator
 * and two numbers, performs the chosen arithmetic operation, and displays the result.
 */
class Main {
  public static void main(String[] args) {
    
    //Declare variables to store the operators
    char operator;
    Double number1, number2, result;

    // Create an object of Scanner class to read the user inputs
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter an operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // Promt the user to enter the first number
    System.out.println("Enter first number");
    number1 = input.nextDouble();

    //Prompt the user to enter the second number
    System.out.println("Enter second number");
    number2 = input.nextDouble();

    //Perform arithmetic operations based on the chosen operator
    switch (operator) {  
      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;
      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;
      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;
      case '/':
        if (number2 != 0) {
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        } else {
        System.out.println("Cannot divide by zero");
        }
        break;
      default:
        System.out.println("Invalid operator!");
        break;
    }

    //Close the Scanner object to release resources
    input.close();
  }
}
