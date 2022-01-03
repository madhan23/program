package com.patterns;

public class Employee {

	private Integer Id;
	private String firstName;
	private String lastName;

	public Integer getId() {
		return Id;
	}

	
	public String getFirstName() {
		return firstName;
	}

	
	public String getLastName() {
		return lastName;
	}



	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}




	public static Employee builder() {
		return new Employee();
	}

	public Employee setId(Integer id) {
		this.Id = id;
		return this;
	}

	public Employee setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public Employee setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public  Employee build() {
		return this;
	}
}
