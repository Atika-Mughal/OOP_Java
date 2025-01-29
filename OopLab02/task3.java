import java.util.Scanner;

class task3 {

public static void main (String[]args) {
Scanner input = new Scanner (System.in);

System.out.print("Enter number of rows: ");
int row = input.nextInt();

System.out.print("Enter number of columns: ");
int col = input.nextInt();

int matrix1 [][] = new int[row][col];
int matrix2 [][] = new int[row][col];

System.out.println("Enter Input for Matrix1: ");
 for (int i=0; i<row; i++) {
   for (int j=0; j<col; j++) {
     matrix1[i][j] = input.nextInt();
   }
}
System.out.println("Enter Input for Matrix2: ");
 for (int i=0; i<row; i++) {
   for (int j=0; j<col; j++) {
     matrix2[i][j] = input.nextInt();
   }
}
System.out.println("Sum: ");
 for (int i=0; i<row; i++) {
   for (int j=0; j<col; j++) {
      System.out.print(matrix1[i][j] + matrix2[i][j] +"\t");
   }
System.out.println();
}
System.out.println();
}
}