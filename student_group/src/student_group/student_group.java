package student_group;

import java.util.Scanner;

public class student_group {
	public static void main(String[] args) {
		
		
		// create an object of Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking the input 
		System.out.println("Enter the Rollno to find the group");
		int RollNo = sc.nextInt();
		
		//find the group 4 
		if (RollNo%4==0)
		{
			System.out.println("Emerald");
		}
		
		//find the group 3
		else if(RollNo%2==0)
		{
			System.out.println("Perl");
		}
		
		//find the group 2
		else if(RollNo%3==0)
		{
			System.out.println("Ruby");
		}
		//find the group 1
		else
		{
			System.out.println("Sapphire");
		}
		
		sc.close();
	}
	
}
		
		

			