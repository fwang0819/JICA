import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int factorial =1; //long factorial =1L;
		int inputNumber;
		int number;
		
		//�Է����� ��ü ���� �� ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Factorial�� ����� ���� �Է��Ͻÿ�(1~20) ");
		inputNumber=scanner.nextInt();
		
		//���丮�� ���
		for(number=1;number<=inputNumber; number++) {
			factorial*=number;
			
			
		}
		System.out.printf("%d! = %d%n",inputNumber,factorial);
		
		//12!������ int�ڷ����� ���� ������ ǥ��������
		//13!���ʹ� 21����  �Ѿ�Ƿ� �����÷ΰ� �߻��Ͽ� ��Ȯ�� ���� ��������ʴ´�. 
		//�׷��Ƿ� �ڷ����� long�ڷ������� �����Ͽ� �����Ű�� .
	}

}
