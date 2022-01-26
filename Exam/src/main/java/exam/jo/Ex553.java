package exam.jo;

import java.util.Scanner;
/*
문제
자연수 n( 3 <= n <= 10) 을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성하시오.

입력 예
3
출력 예
ABC
DE
F
 */
public class Ex553 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n 입력 : ");
		int n = sc.nextInt();
		char ch = 'A';
		for(int i=0;i<n;i++) {
			for(int j=n;i<j;j--) {
				System.out.printf("%c", ch++);
			}
			System.out.println();
		}
		sc.close();
	}
}
