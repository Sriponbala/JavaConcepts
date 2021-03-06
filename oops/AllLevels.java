package oops;
//Multilevel inheritance
import java.util.Scanner;

class SecondaryEducation 
{
	String name ;
	float percentage ;
	SecondaryEducation(String name,float percentage)
	{
		this.name = name;
		this.percentage = percentage;
	}
	void details() 
	{
		System.out.println("\t"+name +" has completed the secondary education with "+percentage);
	}
}
class HigherSecondary extends SecondaryEducation
{
	
	float percentage ;
	HigherSecondary(String name, float percent, float percentage)
	{
		super(name, percent);
		this.percentage = percentage;
	}	
	void higherSecDetails()
	{
		System.out.println("\t"+name + " has completed the higher secondary education with "+ percentage);
	}
}
class College extends HigherSecondary
{
	float cgpa;
	College(String name, float percent, float percentage, float cgpa) {
		super(name, percent, percentage);
		this.cgpa = cgpa;
	}

	void collegeDetails()
	{
		System.out.printf("\t%s is gratuated with an aggregate of %.2f gpa", name, cgpa);
		System.out.println();
	}
	
}
public class AllLevels extends College
{
	AllLevels(String name, float percent, float percentage, float cgpa) {
		super(name, percent, percentage, cgpa);	
	}
    
	void completeDetails() 
	{
		details();
		higherSecDetails();
		collegeDetails(); 
	}
	
	public static void main(String... args)
	{			
		System.out.println("Complete educational details : \n");
		AllLevels object = new AllLevels("Ram", 90.45f, 95f, 91.7f);
		object.completeDetails();
		System.out.println();
		
		AllLevels object1 = new AllLevels("Sam", 87.45f, 97.09f, 90.7f);
		object1.completeDetails();
		System.out.println();
		
		AllLevels object2 = new AllLevels("Sri", 100f, 97.39f, 95.7f);	
		object2.completeDetails();
		System.out.println();
		
		
		System.out.println("Students Secondary Education details :");
		System.out.println();
		object.details();
		object1.details();
		object2.details();
		System.out.println();
		
		System.out.println("Students Higher Secondary Education details :");
		System.out.println();
		object.higherSecDetails();
		object1.higherSecDetails();
		object2.higherSecDetails();
		System.out.println();
		
		System.out.println("Students UG Education details :");
		System.out.println();
		object.collegeDetails();
		object1.collegeDetails();
		object2.collegeDetails();
		
	}
		
}























/*class class1{
	void ex1() {
		System.out.println("example 1");
	}
	static {
		System.out.println("static block of class1");
	}
	{
		System.out.println("Instance block of class1");
	}
}
class class2 extends class1{
	void ex2() {
		System.out.println("example 2");
	}
	static {
		System.out.println("static block of class2");
	}
	{
		System.out.println("Instance block of class2");
	}
}
public class MultilevelInheritance extends class2 {
	static {
		System.out.println("static block of class3");
	}
	public static void main(String[] args) {
		MultilevelInheritance obj = new MultilevelInheritance();
		MultilevelInheritance obj1 = new MultilevelInheritance();
		obj.ex1();
		obj.ex2();
	}
}*/
