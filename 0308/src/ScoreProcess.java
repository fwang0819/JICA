import java.util.Scanner;

/*
 * ����� �������� �Է¹޾� ����,���,������ ���Ͽ� ����Ͻÿ�
 * ȫ�浿70,80,95--------->ó��----------->245,81,6666,'B'
 */
public class ScoreProcess {

	public static void main(String[] args) {
		int total;
		double average;
		char grade;
		
		String name;
		int score1,score2,score3;
		
		//�Է� ���밴ü ���� �� ����
		Scanner scanner = new Scanner(System.in);
		
		//1.����� ������ �Է�
		System.out.print("�����Է�: ");
		name =scanner.nextLine();
		
		System.out.print("�����Է�: ");
		score1 =scanner.nextInt();
		
		System.out.print("����2�Է�: ");
		score2 =scanner.nextInt();
		
		System.out.print("����3�Է�: ");
		score3 =scanner.nextInt();
		
		//�Է��� ���� Ȯ���غ���
		System.out.printf("%s %d %d %d%n",name,score1,score2,score3);
		
		//2.������ ��հ�� 
		total = score1 +score2 + score3;
		//average = total/3.0;
		average=(double)total/3 ;
		
		//3.�������
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
		
		
		//4.������
		System.out.printf("����:%d ���:%f ����%c%n",total,average,grade);
		System.out.printf("����:%10d ���:%6.2f ����%c%n",total,average,grade);
		
		//system.out.printf()�� �������� ����Ҷ� ��ӵ� ����������
		//���ڿ� String %s
		//����  int %d
		//�Ǽ� double %f
		//���� char %c
		//�ݹٲٱ� ��� %n

	}
}