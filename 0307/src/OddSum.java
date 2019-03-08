/*
 * 1~100까지 숫자에서 홀수의 합계 구하기
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
			System.out.printf("%d %d%n",number,sum);//중간출력
			number = number+2;
		}
		System.out.println("홀수합계:"+ sum);
	}

	public static void calculateSum2() {
		int sum=0;
		int number;
		
		for(number=1; number <=100; number=number+2) {
			sum = sum+number;
		}
		System.out.println("홀수합계"+sum);
	}
}
	