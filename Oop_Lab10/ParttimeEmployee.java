class ParttimeEmployee extends Employee implements TaxPayer {
	double monthlysalary; 
    double hourlyRate;

    ParttimeEmployee(String name, String id, double monthlysalary, double hourlyRate) {
    	super(name, id);
    	this.monthlysalary = monthlysalary;
    	this.hourlyRate = hourlyRate;
    }

    public double CalculateSalary() {
    	return monthlysalary * hourlyRate;
    }
    public double payTax() {
    	return monthlysalary * 0.1;
    }
    public void display() {
		System.out.println("Part-time-Employee: " + name);
		System.out.println("Id: " + id);
		System.out.println("Monthly Salary: " + monthlysalary);
		System.out.println("Time of hours: " + hourlyRate);
	}
}