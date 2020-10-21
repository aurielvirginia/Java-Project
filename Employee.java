
public class Employee extends Office {
	protected int TotalSalary;
	
	public int getTotalSalary() {
		return TotalSalary;
	}

	public void setTotalSalary(int totalSalary) {
		TotalSalary = totalSalary;
	}

	public Employee(String name, String address,String gender, String position, int salary) {
		super(name, address, gender, position, salary);
		// TODO Auto-generated constructor stub
		this.TotalSalary =  TotalSalary();
	}

	@Override
	public int TotalSalary() {
		return TotalSalary = EmployeeSalary();
		
	}

	public String getposition() {
		// TODO Auto-generated method stub
		return null;
	}

}
