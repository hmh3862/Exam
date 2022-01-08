package exam.jo;

/*
문제
세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)

입력 예
10 25 33
출력 예
sum : 68
avg : 22
 */
import java.util.Scanner;

public class Ex518 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, sum, avg;
		i = sc.nextInt();
		j = sc.nextInt();
		k = sc.nextInt();
		sum = i + j + k;
		avg = sum / 3;
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);
		
		sc.close();
	}
}
