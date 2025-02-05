import java.util.Scanner;
class task2 {

public static void main (String[]args) {
Scanner input = new Scanner (System.in);

System.out.print("Enter any name for check pallindrome: ");
String text = input.nextLine();
String rev = "";

System.out.println(text);
for (int i=text.length()-1; i>=0; i--) {
    rev = rev+text.charAt(i);
}

if (text.equals(rev)) {
   System.out.println("It is pallindrome. ");
}
else {
System.out.println("It is not pallindrome. ");
}

}
}