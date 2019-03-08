import java.util.Scanner;

public class Basicinput {

	public static void main(String[] args) {
		int score; 
		String title;
		double height;
		char grade;
		boolean pass;
		// 입력 전용 객체 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("성명입력: ");
	    title = scanner.nextLine();
		
		System.out.print("점수입력: ");
		score = scanner.nextInt();
		
		System.out.print("몸무게 입력: ");
		height = scanner.nextDouble();
		
		 scanner.nextLine();
		System.out.print("학점입력: ");
	    grade= scanner.nextLine().charAt(0);// 단수문자를 입력받ㅇㄹ떄
		
	    System.out.print("합격여부입력: ");
	    pass = scanner.hasNextBoolean();//true,false등 논리값을 입력받을떄 사용
	    
		System.out.println("이름 : "  +title+" 점수 : "+score+" 몸무게 입력: "+height
				+"학적입력: "+grade+"합격여부= "+pass);
		
		
		
	}

}
