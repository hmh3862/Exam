package exam.jo;

import java.util.Scanner;
/*
문제
100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.

입력 예
95
출력 예
585
 */
public class Ex544 {
	public static void main(String[] args) {
		int i, sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		sum = 0;
		i = sc.nextInt();
		for(;i<=100;i++) {
			sum += i;
		sc.close();
		}
		System.out.println("입력 정수부터 100까지의 합 =  " + sum);
	}
}
