package task10;

import java.util.Scanner;

//Creating class

class person  
{
	private String name;
	private int Age;

//Parameterized constructor is created to set values 
	public person(String name, int Age)
	{
		this.name = name;
		this.Age = Age;

	}
	
//Using getter method
	
	public String getN1()
	{
		return name;
	}
	public int getN2 ()
	{
		return Age;
	}

	public class Question1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value");
			String a = sc.next();
			int b = sc.nextInt();
			person obj = new person(a,b);

			System.out.println("Name is: "+obj.getN1());
			System.out.println("Age is :"+obj.getN2());

		}



	}

}
