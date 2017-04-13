/*Create a class called Employee that includes three pieces of information as instance variables—a first name
(type String), a last name (type String) and a monthly salary (double). Your class should have a constructor that
initializes the three instance variables. Provide a set and a get method for each instance variable. If the monthly
salary is not positive, set it to 0.0. Write a test application named EmployeeTest that demonstrates class
Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. Then give each
Employee a 10% raise and display each Employee’s yearly salary again.*/

/*Powered by vlad-aizen@yandex.by*/

package Topic2_Class;

import java.util.Scanner;

public class Employee {

	private String first_name;
	private String last_name;
	private double salary, yearSalary, yearSalary10;
    
    public Employee (String first_name, String last_name,double salary){
    	this.first_name = first_name;
    	this.last_name = last_name;
    	this.salary = salary;
    }
	
    public void setFirst_name (String first_name){
    	this.first_name = first_name;
    }
    
    public void setLast_name (String last_name){
    	this.last_name = last_name;
    }
    
    public void setSalary (double salary){
    	this.salary = salary;
    }
    
    public String getFirst_name (){
		return first_name;
    }

    public String getLast_name (){
    	return last_name;
    }
    
    public double getSalary (){
    	if (salary > 0){
    		return salary;
    	}
    	else return 0.0;
    	
    }
    
    public double yearSalary (){
    	if (salary > 0){
    		yearSalary = salary * 12;
    		return yearSalary;
    	}
    	else return 0.0;
    }
    
    public double yearSalary10 (){
    	if (salary > 0){
        	yearSalary10 = (yearSalary*110)/100;
        	return yearSalary10;
    	}
    	else return 0.0;

    }
    
	public static void main(String[] args) {
		String a, b, a1, b1;
		double c, c1;
		Scanner in = new Scanner( System.in );
		System.out.println("\t\tEmployee #1");
		System.out.print("Enter the first name: \n>");
		a = in.nextLine();
		System.out.print("Enter the last name: \n>");
		b = in.nextLine();
		System.out.print("Enter the salary: \n>");
		c = in.nextDouble();
		
		Employee employee1 = new Employee("first name", "last name", 0.0);
		
		employee1.setFirst_name(a);
		employee1.setLast_name(b);
		employee1.setSalary(c);

		System.out.println("The first name of employee #1: " + employee1.getFirst_name()
		+ "\nThe last name of employee #1: " + employee1.getLast_name()
		+ "\nThe monthly salary of employee #1: " + employee1.getSalary()
		+ "\nThe annual salary of employee #1: " + employee1.yearSalary()
		+ "\nThe annual salary * 10% of employee #1: " + employee1.yearSalary10());
		
		
		Scanner in2 = new Scanner( System.in );
		System.out.println("\t\tEmployee #2");
		System.out.print("\n\nEnter the first name: \n>");
		a1 = in2.nextLine();
		System.out.print("Enter the last name: \n>");
		b1 = in2.nextLine();
		System.out.print("Enter the salary: \n>");
		c1 = in2.nextDouble();
		Employee employee2 = new Employee("first name", "last name", 0.0);
		
		employee2.setFirst_name(a1);
		employee2.setLast_name(b1);
		employee2.setSalary(c1);
		
		System.out.println("The first name of employee #2: " + employee2.getFirst_name()
		+ "\nThe last name of employee #2: " + employee2.getLast_name()
		+ "\nThe monthly salary of employee #2: " + employee2.getSalary()
		+ "\nThe annual salary of employee #2: " + employee2.yearSalary()
		+ "\nThe annual salary * 10% of employee #2: " + employee2.yearSalary10());
		
		in.close();
		in2.close();
	}

}
