//�ӽ� ������ �������� �ʰ� �� ġȯ �ϰ� a,b�� ��Ÿ����
public class HomeWork {
	public static void main(String[] args) {
		int a=5;
		int b=7;
			System.out.println("a�ǰ���? :"+a+" b�ǰ��� ? :"+b);
			System.out.println("a��b�ǰ��� ġȯ������ a��b�ǰ��� ���Ͻÿ�");
		
			a=a+b;
			b=a-b;
			a=a-b;
		
			System.out.println("a�ǰ���? :"+a+" b�ǰ��� ? :"+b);
		
		
	}
}


//2.����ū�� �߰��� ���ϱ� 
/*public static void main(String[] args) {
	int large;
	int middle;
	int small;
	int a=12;
	int b=6;
	int c=8;
	
	if(a-b>0) {
			if(a-c>0) {
				large=a; 
				System.out.println();
			 		if(c-b>0) {
			 			middle=c; small=b;
			 			System.out.println("����ū����a�Դϴ�.�߰�����c�̰� ������������b�Դϴ�");
			 	}
			 		else  {
			 			middle=b; small=c;
			 			System.out.println("����ū���� a�Դϴ�.�߰����� c�̰� ������������b�Դϴ�");
			 	}
			}else {
				large=c;  
				System.out.println("����ū���� c�Դϴ�.");
					if(c-b>0) {
						System.out.println("����ū����c�Դϴ�.�߰�����a�̰�����������b�Դϴ�");
						}
					else {
						System.out.println("����ū����"+c+"�Դϴ�."+"�߰�����"+a+"�̰�"+"������������"+b+"�Դϴ�");
		}
	}
	}
	else  {
			if(a-c>0) {
				large=b;
					if(a-c>0){
						System.out.println("����ū����b�Դϴ�. �߰�����a�̰� ������������ c�Դϴ�.");
			}			
					else {
						System.out.println("����ū����b�Դϴ�. �߰�����c�̰� ������������a�Դϴ�.");
						}
			}else {
				large=b;
				System.out.println("����ū����c�Դϴ�.�߰�����b�̰� ������������a�Դϴ�.");
							}
	}
	
}
}
	*/
//2������