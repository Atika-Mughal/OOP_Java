class Employee {

String name;
int empID;
int salary;

Employee (String name, int empID, int salary) {
this.name = name;
this.empID = empID;
this.salary = salary;
}

void display () {
    System.out.println("Employee's name: " + name);
    System.out.println("Employee's ID: " + empID);
    System.out.println("Employee's Salary: " + salary);
}

void increaseSalary (int amount) {
    salary += amount;
    System.out.println("Increased Salary: " + salary);
}

int annualSalary() {
    System.out.println("Annual Salary: " + salary*12);
    return salary;
}

public static void main (String[]args) {
Employee e1 = new Employee ("Atika", 90, 65000);

e1.display();
e1.increaseSalary (2000);
e1.annualSalary();



}
}