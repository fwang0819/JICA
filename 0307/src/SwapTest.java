/*
 * 두변수의 내용값을 교환
 */
public class SwapTest {
	String title ="jICA";
	public static void main(String[] args) {
		System.out.println("임시변수를 사용한 내용값 교환");
		swap1(); // 메서드 호출
		System.out.println("두개의 변수만 이용해서 내용값 교환");
		swap2(); //2번메서드 호출
	}
	
	//임시기억 장소를 사용하여 두변수의 내용값을 교환하는 메서드
	public static void swap1 () {
		int a=5, b=7;
		int temp;
		
		System.out.println("교환전 :"+a+","+b);
		temp= a;
		a= b;
		b= temp;
		System.out.println("교환후"+a+","+b);
		
	}
	
	//두변수만 사용한 내용값 교환 메서드 
	public static void swap2() {
		int a=52,b=76;
		System.out.println("교환전 :"+a+","+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("교환후"+a+","+b);
		
				
	}
}
