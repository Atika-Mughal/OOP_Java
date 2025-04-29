class Main {
	public static void main (String[]args) {
		/* Dog a = new Dog();
		a.eat();
		a.makeSound();

		Cat c = new Cat();
		c.eat();
		c.makeSound(); */

		/* Car v = new Car();
		v.Start();
		v.Stop();

		Bike b = new Bike();
		b.Start();
		b.Stop(); */

		/* Rectangle s = new Rectangle(10, 10);
		System.out.println("Area of Rectangle: " + s.Area());
        s.Print(); */

       /*  Duck d = new Duck();
        d.Fly();
        d.Swim(); */
        
        FulltimeEmployee fte = new FulltimeEmployee("Abdul Saboor", "F93", 35000);
        fte.display();
        fte.CalculateSalary();
        System.out.println("Tax of Full-time-Employee: " + fte.payTax());

        ParttimeEmployee pte = new ParttimeEmployee("Atika", "F90", 25000, 16);
        pte.display();
        pte.CalculateSalary();
        System.out.println("Tax of Part-time-Employee: " + pte.payTax()); 
	}
}