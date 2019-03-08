/*
 * 값 교환하기 ! 
 */
public class Swap {

	public static void main(String[] args) {
		int a = 50;
		int b = 70;
		int temp;
		System.out.println("교환전:"+a+","+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("교환후:"+a+","+b);

	}

}
