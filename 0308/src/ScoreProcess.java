import java.util.Scanner;

/*
 * 성명과 세점수를 입력받아 총점,평균,학점을 구하여 출력하시오
 * 홍길동70,80,95--------->처리----------->245,81,6666,'B'
 */
public class ScoreProcess {

	public static void main(String[] args) {
		int total;
		double average;
		char grade;
		
		String name;
		int score1,score2,score3;
		
		//입력 전용객체 선언 및 생성
		Scanner scanner = new Scanner(System.in);
		
		//1.성명과 세점수 입력
		System.out.print("성명입력: ");
		name =scanner.nextLine();
		
		System.out.print("점수입력: ");
		score1 =scanner.nextInt();
		
		System.out.print("점수2입력: ");
		score2 =scanner.nextInt();
		
		System.out.print("점수3입력: ");
		score3 =scanner.nextInt();
		
		//입력한 값을 확인해보자
		System.out.printf("%s %d %d %d%n",name,score1,score2,score3);
		
		//2.총점과 평균계산 
		total = score1 +score2 + score3;
		//average = total/3.0;
		average=(double)total/3 ;
		
		//3.학점계산
		/*
		if(average >=90.0) {
			grade='A';
		}else if(average>=80.0) {
			grade ='B';
		}else if(average>=70.0) {
			grade ='C';
		}else if(average>=60.0) {
			grade ='D';
	    }else {
	    	grade = 'F';
	    }
	    */
		int temp = (int)(average/10);
		switch(temp) {
		case 10:
		case 9:grade ='A';break;
		case 8:grade ='B';break;
		case 7:grade ='C';break;
		case 6:grade ='D';break;
		default :grade='F';break;
		
		}
		
		
		//4.결과출력
		System.out.printf("총점:%d 평균:%f 학점%c%n",total,average,grade);
		System.out.printf("총점:%10d 평균:%6.2f 학점%c%n",total,average,grade);
		
		//system.out.printf()로 벼수값을 출력할때 약속된 형식지정자
		//문자열 String %s
		//정수  int %d
		//실수 double %f
		//문자 char %c
		//줍바꾸기 기능 %n

	}
}