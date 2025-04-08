class Employee {
	
	int calculateBonus(int salary) {
	    return (salary*10)/100;
	}

	int calculatebonus(int salary, int extrahours) {
	    return (salary)/10+(extrahours*500);
	}
	public static void main (String[]args) {

	Employee e = new Employee();
	System.out.println(e.calculateBonus(50000));
	System.out.println(e.calculatebonus(50000, 3));
	}
}