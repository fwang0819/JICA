
public class HomeWork3 {
	public static void main(String[] args) {
		int a=852;
		int b=856;
		int c=855;
		if(a-b>0) {
			if(a-c<0) {
					System.out.println("�߰�����a�Դϴ�");
				}
		
			else if(b-c>0) {
				System.out.println("�߰�����b�Դϴ�");
			}
		}
		else if(a-b<0){
				if(b-c>0) {
					if(a-c>0) {
						System.out.println("�߰�����a�Դϴ�.");
					}
					else {
						System.out.println("�߰�����c�Դϴ�.");
					}
						}
					
				else  {
					System.out.println("�߰�����b�Դϴ�.");
				}
		}
	
 }
}
