package entities;

public class EmployeeList {
	private String name;
	private Integer id;
	private Double salary;
	
	public EmployeeList( Integer id, String name, Double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void vetName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void vetId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(Double percentage) {
		this.salary = this.salary * ( 1 + ( percentage / 100));
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
