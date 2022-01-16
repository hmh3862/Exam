package exam.jo;

import java.util.Scanner;

/*
문제
정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고 
3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가
-1이 입력되면 종료하는 프로그램을 작성하시오.

* 입출력예의 진한 글씨는 실행값이다.

입·출력 예
5
12
4
21
7
100
-1

Hint!
3의 배수는 3으로 나눈 나머지가 0이다.
 */
public class Ex540 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력(-1은 종료) ");
		while(true) {
			int i = sc.nextInt();
			if(i%3==0) {
				System.out.println(i/3);
			}
			if(i==-1) {
				break;
			}
		}
	}
}
