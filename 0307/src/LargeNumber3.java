/*
 *  세숫자가 정해쪗을때 가장 큰수 구하기 
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
	//1.min<mid 그리고 mid<max가  될때까지 반복
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
	
	System.out.printf("%d %d %d 순서입니다%n", min,mid,max);
}


public static void decideLarge() {
	int large; //가장큰수
	int num1=7, num2=29,num3=58;//주어진수
	//1. 두수를 비교하여 큰수 결정
		if(num1>num2) {
		//나머지 수와 비교하여 가장큰수 결정
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
		//1.두수크기 비교
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
	//1.num1이 가장큰수인지 판별
	if (num1>num2&&num1>num3) {
		large =num1;
	}else if(num2>num1&& num2>num3) {//2.num2가 가장큰수이지 판별
		large =num2;
	}else {//3.num3이 가장큰수인지 판별
		large=num3;
	}
	//결과출력
	System.out.printf("%d는 %d %d %d 중에서 가장 큰수입니다.%n",large,num1,num2,num3);
}
}
	
	



