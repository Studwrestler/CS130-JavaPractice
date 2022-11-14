package Inheritance;

class ShapeMain {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		c1.setColor("Red");
		System.out.println("The circle color is: " +c1.getColor());
		System.out.println("Circle Area: "+c1.area());
		System.out.println("Circle Perimeter: "+c1.perimeter());
		Rectangle r1 = new Rectangle(7,5);
		r1.setColor("Blue");
		System.out.println("The rectangle color is: " +r1.getColor());
		System.out.println("Rectangle Area: "+r1.area());
		System.out.println("Rectangle Perimeter: "+r1.perimeter());

	}

}
