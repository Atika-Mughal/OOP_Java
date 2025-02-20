class Employees {

String name;
int year;
int salary;
String address;

Employees (String name, int year, int salary, String address) {
this.name = name;
this.year = year;
this.salary = salary;
this.address = address;
}

void display() {
System.out.println();
System.out.println(name + "\t" + year + "\t" + salary + "\t" + address + "\t");
}

public static void main (String[]args) {

Employees emp1 = new Employees ("Atika", 2024, 80000, "Sukkur");
Employees emp2 = new Employees ("Ayesha", 2023, 70000, "Sukkur");
Employees emp3 = new Employees ("Fariha", 2022, 60000, "Sukkur");

emp1.display();
emp2.display();
emp3.display();

}
}