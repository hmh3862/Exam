package exam.jo;

import java.util.Scanner;

/*
문제
두 개의 정수를 입력받아서 다음과 같이 4가지 관계연산자의 결과를 출력하시오.
이때 입력받은 두 정수를 이용하여 출력하시오.
 (JAVA는 1이면 true, 0이면 false를 출력한다.)

입력 예
4 5
출력 예
4 > 5 --- 0
4 < 5 --- 1
4 >= 5 --- 0
4 <= 5 --- 1
 */
public class Ex523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수 입력");
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println(i + " > " + j + " --- " + (i>j));
		System.out.println(i + " < " + j + " --- " + (i<j));
		System.out.println(i + " >= " + j + " --- " + (i>=j));
		System.out.println(i + " <= " + j + " --- " + (i<=j));
		
		System.out.println();
		
		System.out.printf("%d > %d --- %b\n", i, j, i > j ? true : false);
		System.out.printf("%d < %d --- %b\n", i, j, i < j ? true : false);
		System.out.printf("%d >= %d --- %b\n", i, j, i >= j ? true : false);
		System.out.printf("%d <= %d --- %b\n", i, j, i <= j ? true : false);
		
		sc.close();
	}
}
