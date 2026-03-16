/*WAP to create ArrayList and store five employee objects in it and employee object contain data id, name and salary and filter the employee
 whose salary is greater than 10000 and name contain more than 3 letters and perform above task using Stream API and filter method.*/

package org.techhub;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private double salary;

	// Constructor
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
}

public class FilterWithStreamApp {

	public static void main(String[] args) {

		// Create ArrayList
		List<Employee> empList = new ArrayList<>();

		// Add Employee objects
		empList.add(new Employee(1, "Ram", 12000.0));
		empList.add(new Employee(2, "Anu", 9000.0));
		empList.add(new Employee(3, "Ramesh", 15000.0));
		empList.add(new Employee(4, "Priya", 20000.0));
		empList.add(new Employee(5, "Om", 18000.0));

		// Filter using Stream API
		empList.stream().filter(e -> e.getSalary() > 10000).filter(e -> e.getName().length() > 3).forEach(
				e -> System.out.println("Id: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary()));
	}
}
