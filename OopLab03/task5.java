import java.util.Scanner;
class task5 {

public static void main(String[]args){
Scanner input = new Scanner(System.in);

boolean exit=true;
boolean isSeats[][] = {{false,false},{true,true},{false,true},{true,false}}; 

do {
System.out.println("Available Seats: 1");
System.out.println("Reserve Seats: 2");
System.out.println("Exit: 3");
System.out.println("Enter any number you want to see details: ");
char userinput= input.next().charAt(0);

switch(userinput)
{
case '1' :
System.out.println("\t Available Seats. ");
System.out.println("Seats which are true consider them not Reserved. ");
System.out.println("Seats which are false consider them Reserved. ");
for(int row=0; row<4; row++)
{
for(int col=0; col<2; col++)
{
System.out.print(row + "," + col + ". " + isSeats[row][col] + "\t");
}
System.out.println();
System.out.println();
}
break;

case '2' :
System.out.println("\t Reserve a Seat: ");
System.out.println("Enter the Row: ");
int userrow= input.nextInt();
System.out.println("Enter the Column: ");
int usercol= input.nextInt();
if (userrow>3)
{
System.out.println("Invalid row input. ");

if (usercol>1)
{
System.out.println("Invalid column input. ");
}
}

else
{
if (isSeats[userrow][usercol])
{
System.out.println("This is not reserved. If you want to reserve this, Press '1'. ");
int reserving = input.nextInt();

if (reserving==1)
{
isSeats[userrow][usercol] = false;
System.out.println("Thank you for Reserving Seat No. " + userrow + "," + usercol);
}

else {
System.out.println("This Seat is Reserved! ");
}

}
}
break;

case '3' :
System.out.println("Thank you for Using Atika's Theatre E-Reservation System! ");
exit = false;

default:
System.out.println("Invalid Input. ");
}

}
while (exit);

}
}
