package exam.jo;

import java.util.Scanner;
/*
문제
10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.

입력 예
10 15 36 99 100 19 46 88 87 13
출력 예
Multiples of 3 : 4
Multiples of 5 : 3
 */
public class Ex545 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10개 정수 입력 : ");
		int cnt1=0, cnt2=0;
		for(int i=0;i<10;i++) {
			int j = sc.nextInt();
			if(j%3==0) {
				cnt1++;
			}
			if(j%5==0) {
				cnt2++;
			}
		}
		System.out.println("Multiples of 3 : " + cnt1);
		System.out.println("Multiples of 5 : " + cnt2);
		sc.close();
	}
}
