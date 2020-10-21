
public class PermanentEmployee extends Office {
	
	private int bonussalary;
	protected int TotalSalary;
	
	public int getTotalSalary() {
		return TotalSalary;
	}
	public void setTotalSalary(int totalSalary) {
		TotalSalary = totalSalary;
	}
	public PermanentEmployee(String name, String address,String gender, String position, int salary, int bonussalary) {
		super(name, address, gender, position, salary);
		this.bonussalary = bonussalary;
		this.TotalSalary = TotalSalary();
		// TODO Auto-generated constructor stub
	}
	public int getBonussalary() {
		return bonussalary;
	}
	public void setBonussalary(int bonussalary) {
		this.bonussalary = bonussalary;
	}
	
	@Override
	public int TotalSalary() {
		
		return TotalSalary = EmployeeSalary() + bonussalary;
	}

}
