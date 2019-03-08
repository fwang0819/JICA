/*
 * 성명과 세 점수가 주어졌을때 총점과 평균을 구하여 출력하시오 
 */
public class ScoreProcess {

	public static void main(String[] args) {
		String name ="홍길동";
		int score1,score2,score3;
		int total;
		double average;
		
		score1=70;//세정수지정 
		score2=80;
		score3=95;
		
		total=score1+score2+score3;//총점계산
		average=(double)total/3;//평균계산
		
		System.out.println("총점은? "+total+" 평균은? "+average);
		
	}

}
