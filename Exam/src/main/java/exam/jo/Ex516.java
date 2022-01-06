package exam.jo;
import java.util.Scanner;

/*
문제
실수 2개와 한 개의 문자를 입력 받아 출력하되 실수는 반올림하여 소수 둘째자리까지 출력하는 프로그램을작성하시오.
(C, C++, Java 의 경우 실수는 "double"로 선언하세요.)

입력 예
12.2536
526.129535
A
출력 예
12.25
526.13
A
 */
public class Ex516 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("실수 2개와 한 개의 문자 입력");
		double i, j;
		String k;
			i = sc.nextDouble();
			j = sc.nextDouble();
			k = sc.next();
		System.out.printf("%.2f\n", i);
		System.out.printf("%.2f\n", j);
		System.out.printf("%s", k);
		
		sc.close();
	}
}
