package exam.pr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
평균 구하기
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

제한사항
arr은 길이 1 이상, 100 이하인 배열입니다.
arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

입출력 예
arr	return
[1,2,3,4]	2.5
[5,5]	5
*/
public class Exam0112_4 {

	public double solution(int[] arr) {
		int sum = 0;
		for(int i : arr) sum += i; // 합구하기
		return (double)sum/arr.length; // 평균 구하기
	}

	@Test
	public void test() {
		assertEquals(new Exam0112_4().solution(new int[] {1,2,3,4}), 2.5, 0);
		assertEquals(new Exam0112_4().solution(new int[] {5,5}), 5, 0);

	}
}
