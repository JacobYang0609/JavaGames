import java.util.Scanner;
/**
@author Jacob
@version v1.0
*/
public class LotteryGame_CN
{
	/**
	彩票小游戏！来看看你今天的运气如何！
	输入一个两位数，来试试看能赢多大的奖！
	*/
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的彩票号：（10-99中的整数哦）");
		int userNumber = input.nextInt();
		
		//随机生成一个两位数的彩票
		int lottery = (int)(Math.random()*90 + 10);
		System.out.println("乐透号是" + lottery);
		if ((userNumber >= 10) && (userNumber <= 99))
		{
			int ten = userNumber / 10;
			int digit = userNumber % 10;

			int tenLo = lottery / 10;
			int digitLo = lottery % 10;


			if ((ten == tenLo) && (digit == digitLo))
			{
				System.out.println("恭喜你！获得了一等奖，10000美金！今天鸿运当头哦！");
			}else if ((ten == digitLo) && (digit == tenLo))
			{
				System.out.println("恭喜你！获得了二等奖，3000美金！今天的你是个小幸运星哦！");
			}else if ((ten == tenLo) || (digit == digitLo))
			{
				System.out.println("恭喜你！获得了三等奖，1000美金！今天的你好运满满哦！");
			}else if ((ten == digitLo) || (digit == tenLo))
			{
				System.out.println("恭喜你！获得了四等奖，500美金！今天你的运气很不错哦！");
			}else{
				System.out.println("很遗憾，没有获得任何奖品。再试一次，说不定运气会更好哦！");
			}

		}else{
			System.out.println("请输入一个有效的两位数！");
		}
	
	}
}