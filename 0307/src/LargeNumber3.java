/*
 *  �����ڰ� ���إ����� ���� ū�� ���ϱ� 
 */
public class LargeNumber3 {

	public static void main(String[] args) {
		//decideLarge();
		//decideLarge2();
		//decideLarge3();
		minmidmax();
	}
public static void minmidmax() {
	int min= 123, mid =87, max =58;
	int temp;
	//1.min<mid �׸��� mid<max��  �ɶ����� �ݺ�
	while(min>mid || mid >max) {
		if(min>mid) {
			temp=min;
			min=mid;
			mid=temp;
		}
		if(mid>max) {
			temp=mid;
			mid=max;
			max=temp;
		}
	
	}
	
	System.out.printf("%d %d %d �����Դϴ�%n", min,mid,max);
}


public static void decideLarge() {
	int large; //����ū��
	int num1=7, num2=29,num3=58;//�־�����
	//1. �μ��� ���Ͽ� ū�� ����
		if(num1>num2) {
		//������ ���� ���Ͽ� ����ū�� ����
			if(num1>num3) {
			large= num1;
			System.out.println(large);
		}
			else {
			large=num3;
			System.out.println(large);
			} 	
				{
				
			}
	}else {
		if(num2>num3) {
			large=num2;
			System.out.println(large);
	}else {
		large=num3;
		System.out.println(large);
	}
		
	}
	
}
	public static void decideLarge2() {
		int large; //
		int num1 =58, num2=29,num3=7; 
		//1.�μ�ũ�� ��
		if(num1>num2) {
			large= num1;
			if(large>num3) {
				System.out.println(large);
			}
			else {
				large=num3;
				System.out.println(large);
			}
				
		}else {
			large=num2;
			}	if(large>num3) {
				System.out.println(large);
			}else {
				large=num3;
				System.out.println(large);
			}
	}
	

public static void decideLarge3() {
	int large;
	int num1 =58,num2 =29, num3=7;
	//1.num1�� ����ū������ �Ǻ�
	if (num1>num2&&num1>num3) {
		large =num1;
	}else if(num2>num1&& num2>num3) {//2.num2�� ����ū������ �Ǻ�
		large =num2;
	}else {//3.num3�� ����ū������ �Ǻ�
		large=num3;
	}
	//������
	System.out.printf("%d�� %d %d %d �߿��� ���� ū���Դϴ�.%n",large,num1,num2,num3);
}
}
	
	



