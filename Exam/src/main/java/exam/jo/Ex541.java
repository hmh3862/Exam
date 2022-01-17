package exam.jo;

import java.util.Scanner;

/*
문제
문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램을 작성하시오.

입력 예
A
출력 예
AAAAAAAAAAAAAAAAAAAA
 */
public class Ex541 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String a = sc.next();
		for(int i=0;i<20;i++) {
			System.out.printf("%s", a);
		}
		sc.close();
	}
}
