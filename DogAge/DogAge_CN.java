import java.util.Scanner;

/**
@author Jacob
@version v1.0
���İ�
*/
class DogAge_CN
{
	/**
	��������빷�������䣬����⿴��������Ķ�����
	*/
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.println("��Ĺ�����ʲô�����أ�");
		String name = input.next();

		System.out.println("��Ĺ������������� (���������)");
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
			System.out.println(name + "���� " + age + "���ˡ�");
		}else{
			System.out.println("������û����Ŷ~");
		}

		
	}
}