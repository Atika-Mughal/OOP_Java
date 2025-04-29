class FulltimeEmployee extends Employee implements TaxPayer {

	double monthlysalary;
	FulltimeEmployee(String name, String id, double monthlysalary) {
		super(name, id);
		this.monthlysalary = monthlysalary;
	}

	public double CalculateSalary() {
       return monthlysalary;
	}

	public double payTax() {
		return monthlysalary * 0.1;
	}

	public void display() {
		System.out.println("Full-time-Employee: " + name);
		System.out.println("Id: " + id);
		System.out.println("Monthly Salary: " + monthlysalary);
	}
} 