import java.util.Scanner;
class task1 {
public static void main (String[]args) {

System.out.println("Enter any name: ");

Scanner obj = new Scanner(System.in);
String name = obj.nextLine();

if (name.isEmpty()) {
System.out.println("String is empty.");
}
else {
System.out.println("String is not empty.");
}

}
}