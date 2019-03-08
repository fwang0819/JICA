/*      1항     2항           3항               4항                                   10항                      number
 *      1 + (1+2) + (1+2+3) + (1+2+3+4) +...... +(1+2+3+....+9+10)   subNumber
 * 항의값 1     3        6          10                  55             subSum
 * 최종합 1     4        10         20                   ?             sum
 */
public class NastedSum {

	public static void main(String[] args) {

		int subSum;    //항의값
        int subNumber;  //항의값을 계산하기 위한 값
        
        int number = 1; //항
		int sum = 0;   //최종합        
        while(number <=10) {
        	//항의값을 계산
        	subNumber = 1;
        	subSum = 0;
        	while(subNumber <= number) {
        		subSum += subNumber;
        		subNumber++;
        	}
        	//총합 누적
        	sum += subSum;
        	
        	//중간결과 출력
        	System.out.println(number +","+subSum+","+sum);
        	
        	number++;
        }
        
        System.out.println("최종 합계 : " + sum);
	}

}
