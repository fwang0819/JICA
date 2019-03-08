
public class HomeWork2 {
	public static void main(String[] args) {
		
	
		int sum=0;
		int number;
	//1 7 11 13 17
		
	for(number=1; number <=100; number=number+2) {
		sum = sum+number;
		if(number%3==0||number%5==0) {
			sum = sum-number;
		}
		System.out.println(number + " " + sum);
	}
	System.out.println("È¦¼öÇÕ°è"+sum);
}
}



