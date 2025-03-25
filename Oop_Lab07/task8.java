import java.util.Scanner;
class task8 {
public static void main (String[]args) {

System.out.println("Enter a message: ");
Scanner obj = new Scanner(System.in);
String text = obj.nextLine();

String words[] = text.split(" ");

int wordCount = 0;
for (String word : words) {
System.out.println(word);
wordCount++;
}

System.out.println("Total words: " + wordCount);

}
}