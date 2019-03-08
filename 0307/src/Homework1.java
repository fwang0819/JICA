import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		String title;
		int engscore;
		int mathscore;
		int koreanscore;
		int sum;
		double average;
		char grade;
		
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("성명입력: ");
	    title = scanner.nextLine();
		
		System.out.print("영어점수입력: ");
		engscore = scanner.nextInt();
		
		System.out.print("수학점수입력: ");
		mathscore = scanner.nextInt();
		
		System.out.print("국어점수입력: ");
		koreanscore = scanner.nextInt();
		
		sum=engscore+mathscore+koreanscore;
		System.out.println("점수의합계는 ="+sum);
		average=sum/3.0;
		System.out.println("평균은? ="+average);
		
		if(average>=90) {
			System.out.println("당신의 학점은  A입니다." );
		}else if(average>=80) {
			System.out.println("당신의 학점은 B입니다.");
		}else if(average>=70) {
			System.out.println("당신의 학점은 C입니다.");
		}else if(average>=60) {
			System.out.println("당신의 학점은  D입니다.");
					
			}else {
				System.out.println("당신의 학점은 F입니다.");
		}
	}
}
