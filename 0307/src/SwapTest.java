/*
 * �κ����� ���밪�� ��ȯ
 */
public class SwapTest {
	String title ="jICA";
	public static void main(String[] args) {
		System.out.println("�ӽú����� ����� ���밪 ��ȯ");
		swap1(); // �޼��� ȣ��
		System.out.println("�ΰ��� ������ �̿��ؼ� ���밪 ��ȯ");
		swap2(); //2���޼��� ȣ��
	}
	
	//�ӽñ�� ��Ҹ� ����Ͽ� �κ����� ���밪�� ��ȯ�ϴ� �޼���
	public static void swap1 () {
		int a=5, b=7;
		int temp;
		
		System.out.println("��ȯ�� :"+a+","+b);
		temp= a;
		a= b;
		b= temp;
		System.out.println("��ȯ��"+a+","+b);
		
	}
	
	//�κ����� ����� ���밪 ��ȯ �޼��� 
	public static void swap2() {
		int a=52,b=76;
		System.out.println("��ȯ�� :"+a+","+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("��ȯ��"+a+","+b);
		
				
	}
}
