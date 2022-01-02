package exam.jo;
/*
문제
키를 입력받아 출력하는 프로그램을 작성하라.
(입력할때 "height = " 문장을 먼저 출력하고 키를 입력 받아야 합니다.)

입력 예
height = 170
출력 예
Your height is 170cm.
 */
import java.util.Scanner;

public class Ex514 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h;
		System.out.print("height = ");
		h = sc.nextInt();
		System.out.println("Your height is " + h + "cm.");
		
		sc.close();
	}
}
