import java.util.Scanner;

/**
@author Jacob
@version v1.0
*/
public class DogAge 
{
	/**
	You can input the dog's year to see what's his/her actual age.
	*/
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.println("What is your dog's name?");
		String name = input.next();

		System.out.println("What is your dog's year? (0-30)");
		double year = input.nextDouble();
		double age;
		if ((year >= 0) && ( year <= 30)) 
		{
			if ( year <= 2)
			{
				age = year*10.5;
			}else {
				age = 10.5*2 + (year-2)*4;
			}
			System.out.println(name + " is " + age + " years old.");
		}else{
			System.out.println("Please enter a valid year.");
		}

		
	}
}
