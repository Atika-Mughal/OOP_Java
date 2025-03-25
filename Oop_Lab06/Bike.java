class Bike extends Vehicle {

String helmetType;

Bike(String brand, int speed, String helmetType) {
super(brand, speed);
this.helmetType = helmetType;
}

void showDetails() {
System.out.println("------Bike Details-------");
System.out.println("Brand: " + super.brand + " Speed: " + super.speed + " Type of helmet: " + helmetType);
}
}