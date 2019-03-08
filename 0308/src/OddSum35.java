
public class OddSum35 {

	public static void main(String[] args) {
		int sum=0;
		int number=0;
		int remain3;
		int remain5;
		for(number=1; number<=100; number=number+2) {
			remain3=number%3;
			remain5=number%5;
			if(remain3!=0 && remain5!=0) {
				sum=sum+number;
			}
		}
		System.out.println(sum);
	}

}
