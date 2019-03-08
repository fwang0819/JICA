
public class BytoPrint {

	public static void main(String[] args) {
		// 바이트형 변수에 저장되는 값을 확인해 보자(128~0~127)
		
		byte num=1;
		
		while(num<130) {
			System.out.println(num);
			num++;
			if(num==-128){
				break; //반복구조 내부에서 break 는 반복구조를 무조건강제 탈출시킨다 .
				 
				
			}
		}

	}

}
