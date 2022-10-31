package chapter5;

public class CircleEn {
	private double radius;
	//Constructor
	public CircleEn(double radius) {
		this.radius=radius;
	}
	//Getters
	public double getRadius() {
		return radius;
	}
	//Setters
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double periCir() {
		double peri=2*Math.PI*radius;
		return peri;
	}
	public double areaCir() {
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	public static void main(String[] args) {
		CircleEn c1 = new CircleEn(10);
		System.out.println("Area: "+c1.areaCir());
		System.out.println("Perimeter: "+c1.periCir());
		c1.setRadius(25);
		System.out.println("Area: "+c1.areaCir());
		System.out.println("Perimeter: "+c1.periCir());
		
		

	}

}
