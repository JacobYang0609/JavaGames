import java.util.Scanner;
/**
@author Jacob
@version v1.0
*/
public class LotteryGame_CN
{
	/**
	��ƱС��Ϸ��������������������Σ�
	����һ����λ���������Կ���Ӯ���Ľ���
	*/
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ĳ�Ʊ�ţ���10-99�е�����Ŷ��");
		int userNumber = input.nextInt();
		
		//�������һ����λ���Ĳ�Ʊ
		int lottery = (int)(Math.random()*90 + 10);
		System.out.println("��͸����" + lottery);
		if ((userNumber >= 10) && (userNumber <= 99))
		{
			int ten = userNumber / 10;
			int digit = userNumber % 10;

			int tenLo = lottery / 10;
			int digitLo = lottery % 10;


			if ((ten == tenLo) && (digit == digitLo))
			{
				System.out.println("��ϲ�㣡�����һ�Ƚ���10000���𣡽�����˵�ͷŶ��");
			}else if ((ten == digitLo) && (digit == tenLo))
			{
				System.out.println("��ϲ�㣡����˶��Ƚ���3000���𣡽�������Ǹ�С������Ŷ��");
			}else if ((ten == tenLo) || (digit == digitLo))
			{
				System.out.println("��ϲ�㣡��������Ƚ���1000���𣡽�������������Ŷ��");
			}else if ((ten == digitLo) || (digit == tenLo))
			{
				System.out.println("��ϲ�㣡������ĵȽ���500���𣡽�����������ܲ���Ŷ��");
			}else{
				System.out.println("���ź���û�л���κν�Ʒ������һ�Σ�˵�������������Ŷ��");
			}

		}else{
			System.out.println("������һ����Ч����λ����");
		}
	
	}
}