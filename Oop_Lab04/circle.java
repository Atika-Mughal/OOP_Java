class circle {

double radius;
String color;

void CalculateArea() {

double area = (int)(3.14*radius*radius);
System.out.println ("The Calculated Area by applied formula is: " + area);

}

public static void main (String[]args) {

circle green_circle = new circle();
circle red_circle = new circle();

green_circle.radius = 2.2;
green_circle.color = "Green";

red_circle.radius = 3.3;
red_circle.color = "Red";

System.out.println ("The radius of green circle is: " + green_circle.radius);
System.out.println ("The radius of red circle is: " + red_circle.radius);

green_circle.CalculateArea();
red_circle.CalculateArea();

}
}