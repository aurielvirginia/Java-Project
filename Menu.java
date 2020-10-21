import java.util.Scanner;
import java.util.Vector;

public class Menu {
	
	Scanner scan = new Scanner(System.in);
	protected int choose;
	protected String name;
	protected String address;
	protected String gender;
	protected String position;
	protected int salary;
	protected int bonussalary;
	
	Vector <Employee> employeelist = new Vector<>();
	Vector <PermanentEmployee> permanentList = new Vector<>();
	
	public Menu() {
		// TODO Auto-generated constructor stub
		Choose();
	}

	private void Choose() {
		// TODO Auto-generated method stub
		System.out.println("Logwarts School");
		System.out.println("===============");
		do {
		System.out.println("1. Insert Employee");
		System.out.println("2. Insert Permanent Employee");
		System.out.println("3. Exit");
		System.out.print(">>");
		try {
			choose =  scan.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			choose = 0;
		}scan.nextLine();
		}while(choose !=1 && choose !=2 && choose !=3 );
		
		if(choose == 1) {
			employee();
		}else if(choose == 2) {
			permanentemployee();
		}else {
			choose = 0;
		}
		
	}

	private void employee() {
		// TODO Auto-generated method stub
		Inputname();
		Inputaddress();
		Inputgender();
		Inputposition();
		Inputsalary();
		DisplayEmployee();
		Choose();
	}
	
	public void DisplayEmployee() {
		employeelist.add(new Employee(name, address, gender, position, salary));
		for (Employee Employee : employeelist) {
			System.out.println("Name : " + Employee.getName());
			System.out.println("Address : " + Employee.getAddreess());
			System.out.println("Gender : " + Employee.getGender());
			System.out.println("Position : " + Employee.getPosition());
			System.out.println("Total Salary" + Employee.TotalSalary);
		}
	}
	
	private void permanentemployee() {
		// TODO Auto-generated method stub
		Inputname();
		Inputaddress();
		Inputgender();
		Inputposition();
		Inputsalary();
		Inputbonus();
		DisplayPermanent();
		Choose();
	}
	
	public void DisplayPermanent() {
		permanentList.add(new PermanentEmployee(name, address, gender, position, salary, bonussalary));
		for(PermanentEmployee PermanentEmployee : permanentList) {
				System.out.println("Name : " + PermanentEmployee.getName());
				System.out.println("Address : " + PermanentEmployee.getAddreess());
				System.out.println("Male : " + PermanentEmployee.getGender());
				System.out.println("Position : " + PermanentEmployee.getPosition());
				System.out.println("Total Salary : " + PermanentEmployee.TotalSalary);
				System.out.println("Bonus Salary : " + PermanentEmployee.getBonussalary());
				
		}
	}
		
	private void Inputbonus() {
		// TODO Auto-generated method stub
		do {
			System.out.print("Bonus Salary [Must be greater than 50000]: ");
			try {
				bonussalary = scan.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				bonussalary = 0;
			}scan.nextLine();
		}while(bonussalary <= 50000 );
	}

	private void Inputname() {
		// TODO Auto-generated method stub
		do {
			System.out.print("Employee Name : ");
			name = scan.nextLine();
			}while(!name.contains("Mr.") && !name.contains("Mrs."));

	}

	private void Inputsalary() {
		// TODO Auto-generated method stub
		do {
			System.out.print("Employee Salary [Minimum Salary = 4000000]: ");
			try {
				salary = scan.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				salary = 0;
			}scan.nextLine();
		}while(salary < 4000000);
		
	}

	private void Inputposition() {
		// TODO Auto-generated method stub
		do {
			System.out.print("Employee Position [Teacher | Staff | Office boy]: ");
			position =  scan.nextLine();
		}while(!position.equals("Teacher") && !position.equals("Staff") && !position.equals("Office boy"));
		
	}

	private void Inputgender() {
		// TODO Auto-generated method stub
		do {
			System.out.print("Employee Gender [Male | Female]: ");
			gender = scan.nextLine();
		}while(!gender.equals("Male") && !gender.equals("Female"));
		
	}

	private void Inputaddress() {
		// TODO Auto-generated method stub
		do {
			System.out.print("Employee Address [Must end with ' Street'] : ");
			address = scan.nextLine();
		}while(!address.endsWith(" Street"));
		
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Menu();
	}

}
