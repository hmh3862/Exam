package exam.jo;

import java.util.Scanner;
/*
문제
10 이하의 과목수 n이 주어진다.
정수로 주어진 n개 과목의 점수를 입력받아서 실수 평균을 구하여 출력하고 
평균이 80점이상이면 "pass", 80점 미만이면 "fail"이라고 출력하는 프로그램을 작성하시오.

평균은 반올림하여 소수 첫째자리까지 출력한다.​

입력 예
4
75 80 85 90
출력 예
avg : 82.5
pass
 */
public class Ex546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목수 입력 : ");
		int sub = sc.nextInt();
		int score=0, sum=0, cnt=0;
		double avg=0;
		for(int i=0;i<sub;i++) {
			score = sc.nextInt();
			sum += score;
			cnt++;
		}
		avg = (double)sum/cnt;
		System.out.printf("avg : %.1f\n", avg);
		
		if(avg>=80) {
			System.out.print("pass");
		}else {
			System.out.print("fail");
		}
		sc.close();
	}
}
