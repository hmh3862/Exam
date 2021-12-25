package exam.jo;
/*
문제
다음 출력 예와 같이 출력되는 프로그램을 작성하시오.
합계와 평균은 수식을 이용하세요. 

출력 예
kor 90
mat 80
eng 100
sum 270
avg 90
 */
public class Ex104 {
	public static void main(String[] args) {
		int k, m, e, sum, avg;
		k = 90;
		m = 80;
		e = 100;
		sum = k + m + e;
		avg = sum / 3;
		System.out.println("kor " + k);
		System.out.println("mat " + m);
		System.out.println("eng " + e);
		System.out.println("sum " + sum);
		System.out.println("avg " + avg);
	}
}
