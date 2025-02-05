import java.util.Scanner;
class task1 {

public static void main (String[]args) {
Scanner input = new Scanner (System.in);

System.out.print("Enter the starting point to generate Prime numbers: ");
int start = input.nextInt();

System.out.print("Enter the range to generate Prime numbers: ");
int range = input.nextInt();

for (int num=start; num<=range; num++) {
boolean isPrime = true;

for (int j=start; j<num; j++) {
     if (num%j==0) {
            isPrime = false;
              break;
}
}
if (isPrime) {
   System.out.println(num);
}

}

}
}