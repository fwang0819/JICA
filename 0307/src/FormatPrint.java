
public class FormatPrint {

	public static void main(String[] args) {
		String name="홍길동";
		int score=87;
		double phi =3.141592;
		char grade ='B';
		System.out.println("성명:"+name);
		System.out.printf("성명:%s, 점수%d%n",name,score);
		System.out.printf("%f%n,",phi);
		System.out.printf("%c%n",grade);
		System.out.printf("%-10s,%d,%f,%c%n",name,score,phi,grade);
	}

}
