import java.util.Scanner;

class task8 {
public static void main (String[] args) {

Scanner Object = new Scanner (System.in);
double mile;

System.out.print("Enter distance in Miles: ");
mile = Object.nextDouble();

System.out.println("Distance in Kilometers is: " + (mile*1.6));

}
}