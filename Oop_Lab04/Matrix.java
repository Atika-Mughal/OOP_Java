import java.util.Scanner;

class Matrix {
int rows, cols;
int[][]matrix; 

Matrix(int rows, int cols) {
this.rows=rows;
this.cols=cols;
matrix = new int[rows][cols];
}

public void initialize(Scanner input) {
    System.out.println("Enter elements for " + rows + "x" + cols + " matrix:");
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
             matrix[i][j] = input.nextInt();
            }
        }
    }

public void getMatrix(){
	System.out.println("Matrix (" + rows + "x" + cols + "):");
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < cols; j++) {
             System.out.print(matrix[i][j] + "  ");
          }
          System.out.println();
     }

}

public void setElement(int row, int col, int value) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            matrix[row][col] = value;
        } 
        else {
            System.out.println("Invalid index!");
        }

}

public static void main(String args[]){
Scanner input = new Scanner(System.in);

Matrix matrix1 = new Matrix(4,3);
matrix1.initialize(input);

Matrix matrix2 = new Matrix(3,3);
matrix2.initialize(input);

matrix1.setElement(1, 2, 3);

matrix1.getMatrix();
matrix2.getMatrix();


}
}
