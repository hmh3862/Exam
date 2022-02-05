package exam.jo;

import java.util.Scanner;
/*
문제
100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 
0 이 입력되면 0 을 제외하고 그 때까지 입력된 정수를 
가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.

입력 예
3 5 10 55 0
출력 예
55 10 5 3
 */

public class Ex558 {
	static final int LIMIT = 100;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int[] num = new int[LIMIT];
		int start_num = 0;
		
		for(int i=0;i<LIMIT;i++) {
			num[i] = sc.nextInt();
			if(num[i] == 0) {
				start_num = i-1;
				break;
			}
		}
		for(int i=start_num;0<=i;i--)
			System.out.print(num[i] + " ");
		
		sc.close();
	}
}
