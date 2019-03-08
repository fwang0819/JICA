
public class HomeWork3 {
	public static void main(String[] args) {
		int i=1; //회전수
		int n=1; //시작수
		int sum=0; // 회전수랑시작수를 더해주는거 
		
		for(i=1; i<=10; i++) {
			
			for(n=1; n<=i; n++) {
				sum=sum+n;
				
				System.out.println(i+","+n+","+sum);
			}
			
		}
		
		System.out.println(sum);
	}
}
