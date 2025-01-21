import java.util.Scanner;

class task9 {
public static void main (String[] args) {

Scanner Object = new Scanner (System.in);

System.out.print("Enter the num1: ");
int num1 = Object.nextInt();

System.out.print("Enter the num2: ");
int num2 = Object.nextInt();

System.out.print("Enter the operation from +,-,*,/: ");
String operation = Object.next();

int result = 0;

switch (operation) {
      case "+":
        result = num1 + num2;
        break;
      case "-":
        result = num1 - num2;
        break;
      case "*":
        result = num1 * num2;
        break;
      case "/":
        result = num1 / num2;
        break;
default: 
      System.out.println("Invalid Option");
        return;
}

System.out.println("The result is: " + result);

}
}