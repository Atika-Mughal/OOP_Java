import java.util.Scanner;
class task3 {
public static void main (String[]args) {

Scanner obj = new Scanner (System.in);   

String name[] = new String[5];
System.out.println("Enter 5 names: ");
for (int i=0; i<5; i++) {
  name[i] = obj.nextLine();
}

System.out.println("\n Uppercase Strings: ");
for (int i=0; i<5; i++) {
 System.out.println(name[i].toUpperCase());
}

}
}