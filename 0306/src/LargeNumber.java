
public class LargeNumber {
	public static void main(String[] args) {
		int large, total;
		int a=25, b=71;
		
		//1. ū�� ����
		if (a>=b) {
			large =a;
		}
	    else {
		    large=b;
	
	    }
		total=a+b;
		System.out.println("�־����μ� :"+a+","+b);
		if (total>100) {
			System.out.println("�μ����հ��="+total);
			
		}else {
			System.out.println("�μ������� 100���� �۽��ϴ�.");
		}
		System.out.println("ū����?>="+large);
	}
	
}
