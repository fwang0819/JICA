
public class BytoPrint {

	public static void main(String[] args) {
		// ����Ʈ�� ������ ����Ǵ� ���� Ȯ���� ����(128~0~127)
		
		byte num=1;
		
		while(num<130) {
			System.out.println(num);
			num++;
			if(num==-128){
				break; //�ݺ����� ���ο��� break �� �ݺ������� �����ǰ��� Ż���Ų�� .
				 
				
			}
		}

	}

}
