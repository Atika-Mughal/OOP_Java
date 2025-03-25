import java.util.Scanner;
class task6 {
public static void main (String[]args) {

System.out.print("Enter any message: ");
Scanner obj = new Scanner(System.in);
String text = obj.nextLine();

if (text.contains("Java")) {
System.out.println("String contains java....");
}
else {
System.out.println("String does not contains java..");
}

}
}