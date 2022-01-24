package exam.jo;

import java.util.Scanner;

/*
문제
자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.

입력 예
3
출력 예
***
 **
  *
 */
public class Ex551 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n 입력 : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
			for(int k=i+1;k>0;k--) {
				System.out.print(" ");
			}
		sc.close();
		}
	}
}
