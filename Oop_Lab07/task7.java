import java.util.Scanner;
class task7 {
public static void main (String[]args) {

System.out.println("Enter a message: ");
Scanner obj = new Scanner(System.in);
String text = obj.nextLine();
System.out.println(text.replace(" ", ""));

}
}