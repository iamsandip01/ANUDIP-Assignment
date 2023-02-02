package labtest1;

public class Person {
	
	
   //instance variable
	String name;
	int age;
	String address;
	String mobile_no;
	
	//default constructor
	public Person() {
		super();
		
	}
	
	//paramiterized constructor
	public Person(String name, int age, String address, String mobile_no) {
		super();
		this.name = name; 
		this.age = age;
		this.address = address;
		this.mobile_no = mobile_no;
	}

	@Override
	//display the ditails
	public String toString() {
		return "Person Name=" + name + "\nAge=" + age + "\nAddress=" + address + "\nMobile_no=" + mobile_no;
	}
	
	
	
}
