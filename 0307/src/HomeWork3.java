
public class HomeWork3 {
	public static void main(String[] args) {
		int i=1; //ȸ����
		int n=1; //���ۼ�
		int sum=0; // ȸ���������ۼ��� �����ִ°� 
		
		for(i=1; i<=10; i++) {
			
			for(n=1; n<=i; n++) {
				sum=sum+n;
				
				System.out.println(i+","+n+","+sum);
			}
			
		}
		
		System.out.println(sum);
	}
}
