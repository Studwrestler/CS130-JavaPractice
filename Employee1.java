package chapter5;

class Employee1 {
	private String name;
	private double payRate;
	private int EMPLOYEE_ID;
	private static int nextID= 1000;
	public static final double STARTING_PAY_RATE= 12.50;
	
	public Employee1(String name) {
		this.name=name;
		EMPLOYEE_ID = getNextID();
	}
	public Employee1(String name, double payRate) {
		this.name=name;
		this.payRate = payRate;
		EMPLOYEE_ID = getNextID();
	}
	public String getName() {
		return this.name;
	}
	public int getEmployeeID() {
		return this.EMPLOYEE_ID;
	}
	public double getPayRate() {
		return this.payRate;
	}
	public void changename(String newName) {
		this.name = newName;
	}
	public void changePayRate(double newPayRate) {
		this.payRate=newPayRate;
	}
	public static int getNextID() {
		int id = nextID;
		nextID++;
		return id;
	}

}
