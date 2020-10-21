
public abstract class Office {
	protected String name;
	protected String address;
	protected String gender;
	protected String position;
	protected int salary;
	protected int total;
	
	public Office(String name, String address, String gender, String position, int salary) {
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.position = position;
		this.salary = salary;
	}
    
	public int EmployeeSalary() {
		if(position.equals("Teacher")){
			total = salary + (salary*20/100);
		}else if(position.equals("Staff")) {
			total = salary + (salary*15/100);
		}else if(position.equals("Office boy")) {
			total = salary;
		}
		return total;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public abstract int TotalSalary();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddreess() {
		return address;
	}
	public void setAddreess(String addreess) {
		this.address = addreess;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
