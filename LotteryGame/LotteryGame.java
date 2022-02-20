import java.util.Scanner;
/**
@author Jacob
@version v1.0
*/
public class LotteryGame
{
	/**
	Lottery Game!
	Please enter a two-digit number to see how much you have won! 
	*/
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your two guessing numbers: (10-99, Integer Only)");
		int userNumber = input.nextInt();
		
		//randomly generated a Lottery Number
		int lottery = (int)(Math.random()*90 + 10);
		System.out.println("The actual lottery number is:" + lottery);
		if ((userNumber >= 10) && (userNumber <= 99))
		{
			int ten = userNumber / 10;
			int digit = userNumber % 10;

			int tenLo = lottery / 10;
			int digitLo = lottery % 10;


			if ((ten == tenLo) && (digit == digitLo))
			{
				System.out.println("Congrats! You won the first prize, $10,000!");
			}else if ((ten == digitLo) && (digit == tenLo))
			{
				System.out.println("Congrats! You won the second prize, $3,000!");
			}else if ((ten == tenLo) || (digit == digitLo))
			{
				System.out.println("Congrats! You won the third prize, $1,000!");
			}else if ((ten == digitLo) || (digit == tenLo))
			{
				System.out.println("Congrats! You won the forth prize, $500!");
			}else{
				System.out.println("Sorry, you earned nothing. Try one more time!");
			}

		}else{
			System.out.println("Please enter a valid number!");
		}
	
	}
}