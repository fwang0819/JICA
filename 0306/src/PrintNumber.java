/*
 * 1���� 5���� ���ڸ� ���ʷ� ����Ͻÿ�
 */
public class PrintNumber {

	public static void main(String[] args) {
		int number=1;
		
		while(number<=5) {
			System.out.println(number+" ");
			number = number+1;
			
		}
		System.out.println();
		//1���� 100���� ������ Ȧ�����
		number=1;
		while(number<=100) {
			if(number %2==1) {
				System.out.println(number);
			}
			number = number +1;
		}
	}

}
