package chapter5;

public class Employee1Main {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1("Harry", 20);
		System.out.println(e1.getName()+" ID: "+e1.getEmployeeID());
		Employee1 e2 = new Employee1("Potter", 21);
		System.out.println(e2.getName()+" ID: "+e2.getEmployeeID());
		e1.changePayRate(30);
		System.out.println("Harry's Pay new rate is " + e1.getPayRate());
		Employee1 e3 = new Employee1("Potter", 21);
		System.out.println(e3.getName()+" ID: "+e3.getEmployeeID());

	}

}
