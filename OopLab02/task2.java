import java.util.Scanner;
class task2 {

public static void main (String[]args) {
Scanner input = new Scanner (System.in);

int array[] = new int[10];
int sum=0;

System.out.println("Enter the 10 numbers for finding sum of 4: ");
for (int i=0; i<array.length; i++) {
array[i] = input.nextInt();

if (array[i]%4==0) {
    sum+=array[i];
}
}
System.out.println("----------------------------");
System.out.println("It is a sum of multiple of 4: ");
System.out.print(sum);

}
}