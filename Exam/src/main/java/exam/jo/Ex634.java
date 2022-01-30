package exam.jo;

import java.util.Scanner;

/*
문제
자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.

입력 예
5
출력 예
*
**
***
****
*****
 */
public class Ex634 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n 입력 : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
