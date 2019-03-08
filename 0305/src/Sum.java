
public class Sum {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=7;
		int j=6;
		int sum;
		double pyung;
		pyung=(i+j)/2.0;
		sum=i+j;
		System.out.println(sum);
		System.out.println(i+j);
		System.out.println(pyung);
		System.out.println((i+j)/2);
		//변수가 선언되었지만 유효한 값이 지정되지 않았으므로 사용 할수 없다 . 
		//1. 값을 읽어서 사용할때는 유효한갑이 있어야하고 
		//값을 변경시킬때는 상관없다. 
		if(sum==10) {
			System.out.println("sum은10입니다.");
			
		}
		else {
			System.out.println("sum은10이아닙니다.");
		}
		
	
	}

}
