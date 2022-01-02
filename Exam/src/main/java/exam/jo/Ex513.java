package exam.jo;
/*
문제
1야드(yd)는 91.44cm이고 1인치(in)는 2.54cm이다.
2.1야드와 10.5인치를 각각 cm로 변환하여 다음 형식에 맞추어 소수 첫째자리까지 출력하시오.​

출력 예
 2.1yd = 192.0cm
10.5in =  26.7cm

Hint!
C, C++의 경우 아래와 같이 자리지정을 이용하여 출력예 처럼 위아래의 줄이 맞도록 해야 한다.
printf("%4.1fyd = %5.1fcm\n", 변수, 식);
 */
public class Ex513 {
	public static void main(String[] args) {
		float yd = 91.44f;
		float in = 2.54f;
		System.out.printf("%4.1fyd = %5.1fcm\n", 2.1, (2.1*yd));
		System.out.printf("%4.1fin = %5.1fcm", 10.5, (10.5*in));
	}
}
