package exam.pr;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

/*
정수 내림차순으로 배치하기
문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다. 
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.

입출력 예
n		return
118372	873211
*/
public class Exam0111_3 {

	public long solution(long n) {
        String[] t = (n+"").split(""); // 1글자씩 잘라서 문자열 배열을 만든다.
        Arrays.sort(t, new Comparator<String>() { // 배열을 내림차순 정렬한다.
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		return Long.parseLong(String.join("", t)); // 배열을 합쳐서 숫지러 바꾼다.
	}

	@Test
	public void test() {
		assertEquals(new Exam0111_3().solution(118372), 873211);
	}
}
