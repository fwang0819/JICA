/*
 * 1~100���� ���ڿ��� Ȧ���� �հ� ���ϱ�
 */
public class OddSum {
	public static void main(String[] args) {
		//calculateSum();
		calculateSum2();
	}
	public static void calculateSum() {
		int sum=0;
		int number;
		
		number=1;
		while(number <=100) {
			sum=sum+number;
			System.out.printf("%d %d%n",number,sum);//�߰����
			number = number+2;
		}
		System.out.println("Ȧ���հ�:"+ sum);
	}

	public static void calculateSum2() {
		int sum=0;
		int number;
		
		for(number=1; number <=100; number=number+2) {
			sum = sum+number;
		}
		System.out.println("Ȧ���հ�"+sum);
	}
}
	