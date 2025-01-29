import java.util.Scanner; 
class task1 {

public static void main (String[]args) {
Scanner input = new Scanner (System.in);

char consonants[] ={'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
System.out.print("Enter the character for finding letter: ");
char user_inp = input.next().charAt(0);

boolean isConst = false;
for (int i=0; i<consonants.length; i++) {
if (user_inp==consonants[i]) {
   isConst = true;
    break;
}
}

if (isConst) {
System.out.print("Constant!");
}

else {
System.out.print("Not Consonant!");
}

}
}