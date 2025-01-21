import java.util.Scanner;

class task7 {

public static void main (String[] args){
Scanner Object1 = new Scanner (System.in);
Scanner Object2 = new Scanner (System.in);

System.out.print("Enter Radius: ");
double radius = Object1.nextDouble();
System.out.print("Enter Height: ");
double height = Object2.nextDouble();

System.out.println("Volume: " + (3.14*(radius*radius)*height));
 
}
}