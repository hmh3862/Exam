package exam.jo;

import java.util.Scanner;

/*
문제
정수를 계속 입력받다가 100 이상의 수가 입력이 되면 마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오.
(평균은 반올림하여 소수 첫째자리까지 출력한다.)

입력 예
1 2 3 4 5 6 7 8 9 10 100
출력 예
155
14.1

Hint!

입력을 받으면 먼저 누적을 시킨 후에 조건을 확인한다.
 */
public class Ex539 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 ");
		int cnt = 0;
		int sum = 0;
		float avg = 0;
		
		while(true) {
			int i = sc.nextInt();
				cnt++;
				sum += i;
			if(i>=100) {
				break;
			}
		}
		avg=(float)sum/(float)cnt;
		System.out.println(sum);
		System.out.printf("%.1f", avg);
	}
}
