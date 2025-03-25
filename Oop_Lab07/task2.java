import java.util.Scanner;
class task2 {
public static void main (String[]args) {

System.out.println("Enter any name: ");
Scanner obj = new Scanner(System.in);
String name = obj.nextLine();

int index = name.indexOf('z');
System.out.println("Index of first 'z': " + index);

}
}