package task10;

import java.util.Scanner;

class Circle {
	
	int radius =10;
	double circumference;
	double pi =3.14f;
	public Circle()
	{
		
		circumference = 2 *pi*radius;
		System.out.println("The circumference of circle of default constructor: " +circumference);
		
	}
	public Circle(double pi,int radius)
	{
		this.pi=pi;
		this.radius = radius;
		this.circumference= circumference;
	}
	public double getn1()
	{
		return pi;
	}
	public int getn2()
	
	{
		return radius;
	}
	public double getn3()
	{
		
		circumference = 2*pi*radius;
		return circumference;
	}
	public void circum()
	{
		circumference = 2 *pi*radius;
		System.out.println("The circumference of circle : " +circumference);	
	}

}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Pi");
		double a = sc.nextDouble();
		System.out.println("Enter the radius");
		int b = sc.nextInt(); 
		Circle obj1 = new Circle(a,b);

		System.out.println("Radius is: "+obj1.getn1());
		System.out.println("Pi value is :"+obj1.getn2());
		System.out.println("Circum value of parametrized constructor is :"+obj1.getn3());
		Circle obj = new Circle();
		obj1.circum();
		
		
	
	}

}
