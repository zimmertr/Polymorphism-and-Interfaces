public class SalariedEmployee extends Employee {

	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName,
					String ssn, double weeklySalary) {
		super(firstName, lastName, ssn);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	public double earnings() {
		return weeklySalary;
	}
	
	public String toString() {
		return "salaried employee: " + super.toString() + "\n" +
			"weekly salary: " + weeklySalary;
	}
}
