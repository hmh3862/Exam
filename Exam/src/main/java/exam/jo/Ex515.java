package exam.jo;
/*
문제
두 개의 정수를 입력 받아 곱과 몫을 출력하시오.
(먼저 입력 받는 수가 항상 크며 입력되는 두 정수는 1이상 500이하이다.)

입력 예
16 5
출력 예
16 * 5 = 80
16 / 5 = 3
 */
import java.util.Scanner;

public class Ex515 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2개 정수 입력 : ");
		int i, j;
		i = sc.nextInt();
		j = sc.nextInt();
		System.out.println(i + " * " + j + " = " + (i * j));
		System.out.println(i + " / " + j + " = " + (i / j));
		System.out.println();
		System.out.printf("%d * %d = %d\n", i, j, (i*j));
		System.out.printf("%d / %d = %d", i, j, (i/j));
		
		sc.close();
	}
}
