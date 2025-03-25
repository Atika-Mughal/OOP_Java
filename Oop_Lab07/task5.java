import java.util.Scanner;
class task5 {
public static void main (String[]args) {

System.out.print("Enter any message: ");
Scanner obj = new Scanner(System.in);
String text = obj.nextLine();

if (text.endsWith("world")) {
System.out.println("String ends with world....");
}
else {
System.out.println("String does not ends with world..");
}

}
}