import java.util.Scanner;
class task4 {

public static void main (String[]args) {

String names[] = new String[6];
Scanner input = new Scanner (System.in);

System.out.print("Enter the 6 names: ");
for (int i=0; i<names.length; i++) {
names[i] = input.next();
}

boolean isAliPresent = false;
for (String name : names) {
if (name.equals("Ali")) {
    isAliPresent = true;
      break;
}
}

if (isAliPresent) {
System.out.print("Ali is present in names! ");
}

else {
System.out.print("Ali is not present in names! ");
}


}
}