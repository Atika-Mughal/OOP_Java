import java.util.Scanner;
class task6 {

public static void main (String[]args) {
Scanner input = new Scanner (System.in);

System.out.print("Enter your age: ");
int age = input.nextInt();

String remarks = (age>=18)? "You are eligible for voting. " : "Sorry, you are not eligible for voting. ";
System.out.println(remarks);

}
}