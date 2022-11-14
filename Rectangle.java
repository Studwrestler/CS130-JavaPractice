package Inheritance;

class Rectangle extends Shape {
	double length;
	double width;
	public Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	public double perimeter() {
		double peri = length+length+width+width;
		return peri;
	}
	public double area() {
		double area = length*width;
		return area;
	}

}
