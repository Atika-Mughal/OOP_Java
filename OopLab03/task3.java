class task3 {

public static void main (String[]args) {

int matrix[][] = {
        {12, 13, 15, 16},
        {11, 110, 121, 17},
        {17, 18, 100, 21}
};
int sumofeven = 0;

for (int row=0; row<3; row++) {
   for (int col=0; col<4; col++) {
     if (matrix[row][col]%2==0) {
        matrix[row][col]=matrix[row][col]/2;
          }
System.out.print(matrix[row][col]+"\t");
      } System.out.println("");
}
for (int row=0; row<3; row++) {
   for (int col=0; col<4; col++) {
      if (matrix[row][col]%2!=0) {
        System.out.println("Odd numbers: "+matrix[row][col] + "  ");
}
}
}
for (int row=0; row<3; row++) {
   for (int col=0; col<4; col++) {
      if (matrix[row][col]%2==0) {
        sumofeven = sumofeven + matrix[row][col];
}
}
}
System.out.print("Sum of even is divided by 2: " + sumofeven);
}
}