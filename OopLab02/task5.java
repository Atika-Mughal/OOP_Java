import java.util.Scanner;
class task5 {
 
public static void main (String[]args) {
Scanner input = new Scanner (System.in);

int matrix[][] = {{'1', '1', '0', '0', '1'}, {'1', '0', '1', '0', '1'}, {'1', '0', '0', '1', '1'}, {'1', '0', '0', '0', '1'}};
int check[][] = new int[4][5];

boolean MatrixN = false;
for (int row=0; row<4; row++) {
  for (int col=0; col<5; col++) {
     System.out.print("Enter the values of Row: "+row+" Column: " +col);
        check[row][col] = input.nextInt();

}
}
for (int row=0; row<4; row++) {
  for (int col=0; col<5; col++) {
    System.out.print(check[row][col]);
      if (matrix[row][col]==check[row][col]) {
          MatrixN = true;
}
  
}
System.out.println();
}

if (MatrixN) {
System.out.print("Matrix Contains N: ");
}

else {
System.out.print("Matrix doesn't Contains N: ");
}

}
}