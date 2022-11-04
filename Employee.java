package chapter5;

public class Employee {
	private String firstName;
	private String lastName;
	private String position;
	private double salary;
	private double hoursWorked;
	public Employee() {
		this.firstName=" ";
		this.lastName=" ";
		this.position=" ";
		this.salary=8.25;
		this.hoursWorked=0;
	}
	public Employee(String firstName, String lastName, String position, double salary, double hoursWorked) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.position=position;
		this.salary=salary;
		this.hoursWorked=hoursWorked;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPosition() {
		return position;
	}
	public double getSalary() {
		return salary;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public void setlastName(String lastName) {
		this.lastName=lastName;
	}
	public void setPostion(String position) {
		this.position=position;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked=hoursWorked;
	}
	public double showCurrentPay() {
		double pay=0.0;
		if(hoursWorked<=40)
			pay = hoursWorked*salary;
		else
			pay = (40*salary)+((hoursWorked-40)*salary*1.5);
		return pay;
	}
	public String displayPayCheck() {
		StringBuilder sb = new StringBuilder();
		sb.append("====="+firstName.toUpperCase()+" "+lastName.toUpperCase()+"=====\n");
		sb.append("Hours Worked: "+hoursWorked +"\n");
		sb.append("Position: "+ position +"\n");
		sb.append("Salary: " +salary+"\n");
		sb.append("Total Pay: "+ this.showCurrentPay()+"\n");
		return sb.toString();
	}
	public static void main(String[] args) {
		Employee employee1 = new Employee("Harry", "Potter", "Actor", 200.0 , 41);
		System.out.println(employee1.displayPayCheck());
		Employee employee2 = new Employee("John", "Doe", "The Boss", 20.00 , 30);
		System.out.println(employee2.displayPayCheck());

	}

}
