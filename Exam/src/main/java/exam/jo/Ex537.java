package exam.jo;

import java.util.Scanner;

/*
문제
100 이하의 양의 정수만 입력된다.
while 문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.

입력 예
10
출력 예
55

1. 1~100 반복
2. 1부터 입력받은 정수의 합
 */
public class Ex537 {
	public static void main(String[] args) {
		int n, sum=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("양의 정수를 입력하시오 ");
			n = sc.nextInt();
			sum = 0;
			for(int i=1;i<=n;i++) sum += i;
			System.out.println("합 : " + sum);
			
			sc.close();
		}
	}
}
