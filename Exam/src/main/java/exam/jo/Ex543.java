package exam.jo;

import java.util.Scanner;

/*
문제
하나의 정수를 입력받아 1부터 입력받은 정수까지의 짝수를 차례대로 출력하는 프로그램을 작성하시오.
입력되는 정수는 50이하이다.

입력 예
10
출력 예
2 4 6 8 10
 */
public class Ex543 {
	public static void main(String[] args) {
		int num, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		for(i=2;i<=num;i+=2) {
			System.out.printf("%d ", i);
		sc.close();
		}
	}
}
