//임시 변수를 선언하지 않고 값 치환 하고 a,b를 나타내기
public class HomeWork {
	public static void main(String[] args) {
		int a=5;
		int b=7;
			System.out.println("a의값은? :"+a+" b의값은 ? :"+b);
			System.out.println("a와b의값을 치환했을때 a와b의값을 구하시오");
		
			a=a+b;
			b=a-b;
			a=a-b;
		
			System.out.println("a의값은? :"+a+" b의값은 ? :"+b);
		
		
	}
}


//2.가장큰수 중간수 구하기 
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
			 			System.out.println("가장큰수는a입니다.중간수는c이고 가장작은수는b입니다");
			 	}
			 		else  {
			 			middle=b; small=c;
			 			System.out.println("가장큰수는 a입니다.중간수는 c이고 가장작은수는b입니다");
			 	}
			}else {
				large=c;  
				System.out.println("가장큰수는 c입니다.");
					if(c-b>0) {
						System.out.println("가장큰수는c입니다.중간수는a이고가장작은수는b입니다");
						}
					else {
						System.out.println("가장큰수는"+c+"입니다."+"중간수는"+a+"이고"+"가장작은수는"+b+"입니다");
		}
	}
	}
	else  {
			if(a-c>0) {
				large=b;
					if(a-c>0){
						System.out.println("가장큰수는b입니다. 중간수는a이고 가장작은수는 c입니다.");
			}			
					else {
						System.out.println("가장큰수는b입니다. 중간수는c이고 가장작은수는a입니다.");
						}
			}else {
				large=b;
				System.out.println("가장큰수는c입니다.중간수는b이고 가장작은수는a입니다.");
							}
	}
	
}
}
	*/
//2번문제