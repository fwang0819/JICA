import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int factorial =1; //long factorial =1L;
		int inputNumber;
		int number;
		
		//입력전용 객체 선언 및 생성
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Factorial을 계산할 값을 입력하시오(1~20) ");
		inputNumber=scanner.nextInt();
		
		//팩토리얼 계산
		for(number=1;number<=inputNumber; number++) {
			factorial*=number;
			
			
		}
		System.out.printf("%d! = %d%n",inputNumber,factorial);
		
		//12!까지는 int자료형의 범위 내에서 표현되지만
		//13!부터는 21억을  넘어서므로 오버플로가 발생하여 정확히 값이 저장되지않는다. 
		//그러므로 자료형을 long자료형으로 변경하여 실행시키자 .
	}

}
