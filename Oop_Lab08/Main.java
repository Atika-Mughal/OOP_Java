class Main {
	public static void main (String[]args) {

	/* Animal a = new Animal();
	Animal d = new Dog();
	Animal c = new Cat();

	a.makeSound();
	d.makeSound();
	c.makeSound(); */ 
    
    Bank b = new Bank();
	Bank sbi = new SBI();
	Bank icici = new ICICI();
	Bank hdfc = new HDFC();

    System.out.println("Bank Interest: " + b.getInterestRate());
	System.out.println("SBI Interest: " + sbi.getInterestRate());
	System.out.println("ICICI Interest: " + icici.getInterestRate());
	System.out.println("HDFC Interest: " + hdfc.getInterestRate());
	}
}