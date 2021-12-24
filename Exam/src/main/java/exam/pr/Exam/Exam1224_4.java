package exam.pr.Exam;

import java.util.Scanner;

/*
"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
예를 들어, 10번 문제의 점수는 3이 된다.

"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수가 주어진다. 
각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 
문자열은 O와 X만으로 이루어져 있다.
5
OOXXOXXOOO				10
OOXXOOXXOO				 9
OXOXOXOXOXOXOX			 7
OOOOOOOOOO				55
OOOOXOOOOXOOOOX			30
*/
public class Exam1224_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String str = sc.nextLine();
			System.out.println(solution(str));
			
		}
		sc.close();
		/*
		System.out.println(solution("OOXXOXXOOO"));
		System.out.println(solution("OOXXOOXXOO"));
		System.out.println(solution("OXOXOXOXOXOXOX"));
		System.out.println(solution("OOOOOOOOOO"));
		System.out.println(solution("OOOOXOOOOXOOOOX"));
		*/
	}
	public static int solution(String str) {
		int score = 0;
		int count = 0; // 연속된 0의 개수를 세어줄 변수
		for(char ch : str.toCharArray()) { // 글자 반복
			if(ch=='O') {
				count++;
				score += count;
			}else {
				count = 0;
			}
		}
		return score;
	}

}
