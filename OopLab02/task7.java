class task7 {

public static void main (String[]args) {

int array[] = {12, 5, 9, 78, 4};

int smallest = array[0], largest = array[0]; 

for (int i=0; i<5; i++) {
   System.out.println(array[i]);
}
for (int i=0; i<5; i++) {
   if (array[i]>largest) 
     {
        largest=array[i];
     }
   if (array[i]<smallest)
     {
        smallest=array[i];
     }
}
System.out.println("Maximum number: " + largest);
System.out.println("Minimum number: " + smallest);

if (largest%2==0) 
{
System.out.println("The largest number is divided by 2. ");
}
else 
{
System.out.println("The largest number is not divided by 2. ");
}

}
}