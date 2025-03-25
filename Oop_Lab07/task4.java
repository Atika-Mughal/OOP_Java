import java.util.Scanner;
class task4 {
public static void main (String[]args) {

System.out.print("Enter anny message: ");
Scanner obj = new Scanner(System.in);
String text = obj.nextLine();

if (text.startsWith("Hello")) {
System.out.println("String starts with Hello..");
}
else {
System.out.println("String does not start with hello....");
}

}
}