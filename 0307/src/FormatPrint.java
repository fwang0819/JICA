
public class FormatPrint {

	public static void main(String[] args) {
		String name="ȫ�浿";
		int score=87;
		double phi =3.141592;
		char grade ='B';
		System.out.println("����:"+name);
		System.out.printf("����:%s, ����%d%n",name,score);
		System.out.printf("%f%n,",phi);
		System.out.printf("%c%n",grade);
		System.out.printf("%-10s,%d,%f,%c%n",name,score,phi,grade);
	}

}
