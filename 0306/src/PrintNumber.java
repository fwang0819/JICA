/*
 * 1부터 5까지 숫자를 차례로 출력하시오
 */
public class PrintNumber {

	public static void main(String[] args) {
		int number=1;
		
		while(number<=5) {
			System.out.println(number+" ");
			number = number+1;
			
		}
		System.out.println();
		//1부터 100까지 숫자중 홀수출력
		number=1;
		while(number<=100) {
			if(number %2==1) {
				System.out.println(number);
			}
			number = number +1;
		}
	}

}
