class task4 {
public static void main (String[]args) {

int i=0;
int array[] = new int[10];
do {
    array[i] = i*i;
    i++;
} while (i<array.length);

int j=0;
int sum=0;

while(j<array.length) {
     if (array[j]==81) { 
        break;
     }
if (array[j]%2!=0) {
 sum = sum + array[j];
} 
j++;
}
System.out.println(sum);
}
}