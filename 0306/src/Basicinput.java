import java.util.Scanner;

public class Basicinput {

	public static void main(String[] args) {
		int score; 
		String title;
		double height;
		char grade;
		boolean pass;
		// �Է� ���� ��ü 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�����Է�: ");
	    title = scanner.nextLine();
		
		System.out.print("�����Է�: ");
		score = scanner.nextInt();
		
		System.out.print("������ �Է�: ");
		height = scanner.nextDouble();
		
		 scanner.nextLine();
		System.out.print("�����Է�: ");
	    grade= scanner.nextLine().charAt(0);// �ܼ����ڸ� �Է¹ޤ�����
		
	    System.out.print("�հݿ����Է�: ");
	    pass = scanner.hasNextBoolean();//true,false�� ������ �Է¹����� ���
	    
		System.out.println("�̸� : "  +title+" ���� : "+score+" ������ �Է�: "+height
				+"�����Է�: "+grade+"�հݿ���= "+pass);
		
		
		
	}

}
