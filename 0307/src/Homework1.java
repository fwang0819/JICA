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

		System.out.print("�����Է�: ");
	    title = scanner.nextLine();
		
		System.out.print("���������Է�: ");
		engscore = scanner.nextInt();
		
		System.out.print("���������Է�: ");
		mathscore = scanner.nextInt();
		
		System.out.print("���������Է�: ");
		koreanscore = scanner.nextInt();
		
		sum=engscore+mathscore+koreanscore;
		System.out.println("�������հ�� ="+sum);
		average=sum/3.0;
		System.out.println("�����? ="+average);
		
		if(average>=90) {
			System.out.println("����� ������  A�Դϴ�." );
		}else if(average>=80) {
			System.out.println("����� ������ B�Դϴ�.");
		}else if(average>=70) {
			System.out.println("����� ������ C�Դϴ�.");
		}else if(average>=60) {
			System.out.println("����� ������  D�Դϴ�.");
					
			}else {
				System.out.println("����� ������ F�Դϴ�.");
		}
	}
}
