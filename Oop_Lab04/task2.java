class task2 {

double radius;
String color;

task2 (String color, double radius) {
this.radius = radius;
this.color = color;

}

double CalculateArea() {

double area = (int)(3.14*radius*radius);
System.out.println ("The Calculated Area by applied formula is: " + area);

return area;

}

public static void main (String[]args) {

task2 green_circle = new task2 ("Green", 2.2);
task2 red_circle = new task2 ("Red", 3.3);

System.out.println ("The radius of green circle is: " + green_circle.radius);
System.out.println ("The radius of red circle is: " + red_circle.radius);

green_circle.CalculateArea();
red_circle.CalculateArea();

}
}