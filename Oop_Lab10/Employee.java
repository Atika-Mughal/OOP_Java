abstract class Employee {
	
	String name;
	String id;
	Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}

	abstract public double CalculateSalary();

	public void display() {
		System.out.println(" ");
	}
}