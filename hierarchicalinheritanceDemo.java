package v;
class Employee {
	String name;
	int Id;
	double salary;
	public Employee(String name,int Id,double salary) {
		this.name = name;
		this.Id  = Id;
		this.salary = salary;
	}
	public void Employeedetails() {
		System.out.println("Employee name is"+" " +name);
		System.out.println("Employee Id is " +Id);
		
	}
 
} 
class permanentemployee extends Employee{

		
	public permanentemployee(String name, int Id,double salary) {
		super(name, Id, salary);
		
	}
	public void salaryonmonthly() {
		System.out.println("salary on monthly"+" " +salary);
	}
	
}
class contractemployee extends Employee{

	public contractemployee(String name, int Id, double salary) {
		super(name, Id, salary);
	}
	public void salaryonHourly() {
		System.out.println("salary on hourly"+" " +salary);
	}
	
}


public class hierarchicalinheritanceDemo {
public static void main(String[] args) {
	Employee v = new Employee("wills" ,101,100000.0);
	v.Employeedetails();
	permanentemployee c = new permanentemployee("smith",102,200000.0);
	c.Employeedetails();
	c.salaryonmonthly();
	contractemployee m = new contractemployee("lenin",103,3000.0);
	m.Employeedetails();
	m.salaryonHourly();
	
}
}
	
	


