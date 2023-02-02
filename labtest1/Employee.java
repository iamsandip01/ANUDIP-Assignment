package labtest1;

public class Employee extends Person{
	
	//instance variable
	String eid;
	String dept;
	int salary;
	
	//default constructor
		public Employee() {
			super();
			
    }
	
	//paramiterized constructor
	public Employee(String eid, String dept, int salary) {
		super();
		this.eid = eid;
		this.dept = dept;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee Id=" + eid + "\nDepartment=" + dept + "\nSalary=" + salary;
	}
	

}
