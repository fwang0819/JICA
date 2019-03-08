
public class HomeWork3 {
	public static void main(String[] args) {
		int a=852;
		int b=856;
		int c=855;
		if(a-b>0) {
			if(a-c<0) {
					System.out.println("중간수는a입니다");
				}
		
			else if(b-c>0) {
				System.out.println("중간수는b입니다");
			}
		}
		else if(a-b<0){
				if(b-c>0) {
					if(a-c>0) {
						System.out.println("중간수는a입니다.");
					}
					else {
						System.out.println("중간수는c입니다.");
					}
						}
					
				else  {
					System.out.println("중간수는b입니다.");
				}
		}
	
 }
}
