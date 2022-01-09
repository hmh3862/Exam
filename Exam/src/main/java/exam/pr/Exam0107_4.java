package exam.pr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
소수 찾기
문제 설명
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.
입출력 예
n	result
10	4
5	3
*/
public class Exam0107_4 {

	// 에라토스테네스의 체 알고리즘
	public int solution2(int n) {
		int answer = 0;
		// boolean배열을 쓰면 용량도 적고 속도도 더 빠르다.
		boolean ar[] = new boolean[n + 1]; // 크기보다 1 크게 배열 선언
		for (int i = 2; i < ar.length; i++) {
			// 값이 참인 수들은 합성수
			if (ar[i]) continue;
			// i를 제외한 i의 배수들을 참으로 체크
			for (int j = i + i; j < ar.length; j += i) ar[j] = true;
		}
		for (int i = 2; i < ar.length; i++) {
			if (!ar[i]) answer++;
		}
		return answer;
	}
	// 에라토스테네스의 체 알고리즘
	public int solution(int n) {
		int answer = 0;
		int ar[] = new int[n + 1]; // 크기보다 1 크게 배열 선언
		for (int i = 2; i < ar.length; i++) {
			// 이미 체크된 수의 배수들은 합성수
			if (ar[i] == 1)
				continue;
			// i를 제외한 i의 배수들을 1로 체크
			for (int j = i + i; j < ar.length; j += i)
				ar[j] = 1;
		}
		for (int i = 2; i < ar.length; i++) {
			if (ar[i] != 1) { // 1이아닌(배수가 아닌) 갯수
				answer++;
				// System.out.printf("%4d", i);
			}
		}
		return answer;
	}

	@Test
	public void test() {
		assertEquals(new Exam0107_4().solution(10), 4);
		assertEquals(new Exam0107_4().solution(5), 3);
	}
	@Test
	public void test2() {
		assertEquals(new Exam0107_4().solution2(10), 4);
		assertEquals(new Exam0107_4().solution2(5), 3);
	}
}
