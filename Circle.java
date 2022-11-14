package Inheritance;

class Circle extends Shape {
	double radius;
	public Circle(double radius){
		this.radius=radius;
	}
	public double perimeter() {
		double peri = 2*Math.PI*radius;
		return peri;
	}
	public double area() {
		double area = Math.PI*Math.pow(radius,2);
		return area;
	}

}
