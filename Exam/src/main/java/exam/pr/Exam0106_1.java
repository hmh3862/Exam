package exam.pr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
두 정수 사이의 합
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, 
solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

제한 조건
a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
a와 b의 대소관계는 정해져있지 않습니다.

입출력 예
a	b	return
3	5	12
3	3	3
5	3	12
*/
public class Exam0106_1 {

	public long solution(int a, int b) {
		//  -10,000,000 이상 10,000,000 이하인 정수
		// 합이 int의 범위를 넘을 수 있을까?
		long answer = 0; 
		// a와 b의 대소관계는 정해져있지 않습니다. 
		// 그래서 앞의 수가 크면 두 수를 바꿉니다
		if(a>b) {
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
		}
		// 적은수 부터 큰수까지의 합을 구한다.
		for(;a<=b;a++) {
			answer += a;
		}
		// System.out.println(answer);
		return answer;
	}

	@Test
	public void test() {
		assertEquals(new Exam0106_1().solution(3,5), 12);
		assertEquals(new Exam0106_1().solution(3,3), 3);
		assertEquals(new Exam0106_1().solution(5,3), 12);
	}
}
