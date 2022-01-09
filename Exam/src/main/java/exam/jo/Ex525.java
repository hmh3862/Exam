package exam.jo;

import java.util.Scanner;
/*
문제
3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 
세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.
(JAVA는 1이면 true, 0이면 false를 출력한다.)

입력 예
10 9 9
출력 예
1 0
 */
public class Ex525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3개의 정수 입력 : ");
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		boolean b1 = (i>j) && (i>k);
		boolean b2 = (i==j) && (i==k);
		
		System.out.println(b1 + " " + b2);
		System.out.printf("%b %b", b1, b2);
		
		sc.close();
	}
}
