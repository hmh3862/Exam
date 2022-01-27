package exam.jo;

import java.util.Scanner;
/*
문제
자연수 n을 입력받아서 n개의 줄에 n+1개의 숫자 혹은 문자로 채워서 
다음과 같이 출력하는 프로그램을 작성하시오.

입력 예
3
출력 예
1 2 3 A
4 5 B C
6 D E F
 */
public class Ex554 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 n 입력 : ");
		int n = sc.nextInt();
		int count = 1;
		char ch = 'A';
		for(int i=0;i<n;i++) {
			for(int j=n;i<j;j--) {
				System.out.printf("%d ", count++);
			}
			for(int k=0;k<=i;k++)
				System.out.printf("%c ", ch++);
			System.out.println();
		}
		sc.close();
	}
}
