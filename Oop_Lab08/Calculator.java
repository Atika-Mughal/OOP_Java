class Calculator {
	
int add (int a, int b) {
	return a+b;
}

double add (double a, double b) {
	return a+b;
}

String add (String a, String b) {
	return a+b;
}
public static void main (String[]args) {
	Calculator c = new Calculator();
	System.out.println(c.add(10, 5));
	System.out.println(c.add(10.5, 5.5));
	System.out.println(c.add("Atika", "Mughal"));
}
}