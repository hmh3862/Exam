package exam.jo;

/*
문제
아래와 같이 출력되는 프로그램을 작성하시오.

출력 예
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
6 7 8 9 10

Hint!
i와 j값을 둘 다 활용하여 식을 만들어 본다.
 */
public class Ex547 {
	public static void main(String[] args) {
		for(int i=2;i<=6;i++) {
			for(int j=i;j<=i+4;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
