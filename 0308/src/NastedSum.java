/*      1��     2��           3��               4��                                   10��                      number
 *      1 + (1+2) + (1+2+3) + (1+2+3+4) +...... +(1+2+3+....+9+10)   subNumber
 * ���ǰ� 1     3        6          10                  55             subSum
 * ������ 1     4        10         20                   ?             sum
 */
public class NastedSum {

	public static void main(String[] args) {

		int subSum;    //���ǰ�
        int subNumber;  //���ǰ��� ����ϱ� ���� ��
        
        int number = 1; //��
		int sum = 0;   //������        
        while(number <=10) {
        	//���ǰ��� ���
        	subNumber = 1;
        	subSum = 0;
        	while(subNumber <= number) {
        		subSum += subNumber;
        		subNumber++;
        	}
        	//���� ����
        	sum += subSum;
        	
        	//�߰���� ���
        	System.out.println(number +","+subSum+","+sum);
        	
        	number++;
        }
        
        System.out.println("���� �հ� : " + sum);
	}

}
