package exam.jo;

import java.util.Scanner;

/*
문제
한 개의 정수를 입력 받아서 후치증가 연산자를 사용하여 출력한 후 
전치 증가 연산자를 사용하여 출력하는프로그램을 작성하시오.

입력 예
5
출력 예
5
7

Hint!
첫번째 줄은 후치증가 연산자를 사용한 결과 둘번째 줄은 전치증가 연산자를 사용한 결과
 */
public class Ex520 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		int i = sc.nextInt();
		System.out.printf("%d\n", i++);
		System.out.printf("%d", ++i);
		
		sc.close();
	}
}
