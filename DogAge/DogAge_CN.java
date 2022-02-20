import java.util.Scanner;

/**
@author Jacob
@version v1.0
中文版
*/
class DogAge_CN
{
	/**
	你可以输入狗狗的年龄，来测测看它是人类的多少岁
	*/
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.println("你的狗狗叫什么名字呢？");
		String name = input.next();

		System.out.println("你的狗狗今年多大了呢 (请输入年份)");
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
			System.out.println(name + "今年 " + age + "岁了。");
		}else{
			System.out.println("狗狗还没出生哦~");
		}

		
	}
}