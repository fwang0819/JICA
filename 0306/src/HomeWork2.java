
public class HomeWork2 {
	public static void main(String[] args) {
		int a=8; 
		int b=12;
		int c=9;
		if(a-b>0){
			if(a-c>0) {
				System.out.println("가장큰수는 a 입니다");
			}
			else {
				System.out.println("가장큰수는 c 입니다");
			}
		}else {
			if(b-c>0) {
				System.out.println("가장큰수는 b입니다.");
				}
			else {
				System.out.println("가장큰수는 c입니다.");
			}
		}
	}
}
