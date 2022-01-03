package com.patterns;

public class BuilderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = Employee.builder().setFirstName(null).setLastName("R").build();

		Employee e1 = Employee.builder().setFirstName("Madhan").setId(1).build();

		Employee e2 = Employee.builder().setId(1).build();
		
		System.out.println(e);

		System.out.println(e1);
		
		System.out.println(e2);
		
		System.out.println(Character.isDigit('c'));
		
		System.out.println(((Object)100).getClass().getSimpleName());

	}

}
