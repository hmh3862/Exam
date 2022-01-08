package exam.jo;

import java.util.Scanner;

/*
문제
세 개의 실수를 입력 받아 반올림하여 소수 셋째 자리까지 출력하는 프로그램을 작성하시오.

입력 예
1.2568
95.21438
526.851364
출력 예
1.257
95.214
526.851
 */
public class Ex517 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 개의 실수 입력");
		double i, j, k;
			i = sc.nextDouble();
			j = sc.nextDouble();
			k = sc.nextDouble();
		System.out.printf("%.3f\n", i);
		System.out.printf("%.3f\n", j);
		System.out.printf("%.3f", k);
		
		sc.close();
	}
}
