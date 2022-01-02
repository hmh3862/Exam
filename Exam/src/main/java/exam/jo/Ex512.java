package exam.jo;
/*
문제
추의 무게를 저장할 변수와 중력의 비율을 저장할 변수를 선언하고,
다음 두 값을 변수에 저장하여 곱셈 계산식을 출력하는 프로그램을 작성하라.

추의 무게 = 49, 중력의 비율 = 0.2683

출력 예
49 * 0.268300 = 13.146700
 */
public class Ex512 {
	public static void main(String[] args) {
		int i = 49;
		double j = 0.268300;
		System.out.printf("%d * %f = %f", i, j, (i*j));
	}
}
