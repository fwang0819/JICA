
public class LargeNumber {
	public static void main(String[] args) {
		int large, total;
		int a=25, b=71;
		
		//1. 큰수 결정
		if (a>=b) {
			large =a;
		}
	    else {
		    large=b;
	
	    }
		total=a+b;
		System.out.println("주어진두수 :"+a+","+b);
		if (total>100) {
			System.out.println("두수의합계는="+total);
			
		}else {
			System.out.println("두수의합이 100보다 작습니다.");
		}
		System.out.println("큰수는?>="+large);
	}
	
}
