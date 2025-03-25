class Car extends Vehicle {

int numDoors;

Car(String brand, int speed, int numDoors) {
super(brand, speed);
this.numDoors = numDoors;
}

void showDetails() {
System.out.println("-----Bike Details------");
System.out.println("Brand: " + super.brand + " Speed: " + super.speed + " Number of Doors: " + numDoors);
}
}