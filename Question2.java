package task10;

import java.util.Scanner;

class Employee{
	int id;
	String firstname;
	String lastname;
	int salary;

public void raisesalary(int percentage)
{
	int newSalary;
	
	newSalary = (salary +(salary* percentage/100));
	System.out.println("Employee increased  salary is :" +newSalary);
}

public Employee(int id, String firstname,String lastname, int salary)
{
	this.id =id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.salary = salary;
}

public int getId()
{
	return id;
}
public String getFirstname()
{
	return firstname;
}
public String getLastname()
{
	return lastname;
}
public void setsalary(int salary)
{
	salary = salary;
}

public int getSalary()
{
	return salary;
}
public int getannualsalary()
{
	int annualsalary = salary *12;
	return annualsalary;
}
public String getName()
{
	String name = firstname +""+ lastname;
	return name;
}

public String toString() {
	   return "Employee[id=" + id + " name=" + firstname+" "+ lastname + " salary ="+salary +"]";
	}

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		int a = sc.nextInt();
		System.out.println("Enter the firstname");
		String b = sc.next();
		System.out.println("Enter the lastname");
		String c = sc.next();
		System.out.println("Enter the salary");
		int d = sc.nextInt();
		System.out.println("Enter the percentage");
		int e = sc.nextInt();
		
		Employee obj = new Employee(a,b,c,d);
		System.out.println(obj);
		
		System.out.println("Employee id:"+ obj.getId());
		System.out.println("Employee Name:"+ obj.getName());
		System.out.println("Employee salary:"+ obj.getSalary());
		System.out.println("Employee annual:"+ obj.getannualsalary());
		obj.raisesalary(e);
		
		
		

	}

}
}
