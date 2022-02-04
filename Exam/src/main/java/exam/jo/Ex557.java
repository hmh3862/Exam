package exam.jo;

import java.util.Scanner;
/*
문제
10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 
차례로 출력하는 프로그램을 작성하시오.

입력 예
A B C D E F G H I J
출력 예
A D G
 */
public class Ex557 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("10개 문자 입력 : ");
		String ch = sc.nextLine();
		String[] ch_arr = ch.split(" ");
		
		System.out.print(ch_arr[0] + " " + ch_arr[3] + " " + ch_arr[6]);
		sc.close();
	}
}
