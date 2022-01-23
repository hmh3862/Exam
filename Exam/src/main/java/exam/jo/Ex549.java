package exam.jo;

import java.util.Scanner;

/*
문제
자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 
합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.

입력 예
100
출력 예
10 100
 */
public class Ex549 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n 입력 : ");
		int n = sc.nextInt();
		int cnt = 0, sum = 0;
		for(int i=1;sum<n;i++) {
			if(i%2==1) {
				sum += i;
				cnt++;
			}
		}
		System.out.printf("%d %d", cnt, sum);
		sc.close();
	}
}
