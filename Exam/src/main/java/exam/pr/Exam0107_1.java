package exam.pr;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

/*
문자열 내림차순으로 배치하기
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, 
solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
입출력 예
s			return
"Zbcdefg"	"gfedcbZ"
*/
public class Exam0107_1 {

	public String solution(String s) {
		String[] ar = s.split(""); // 문자열을 1글자씩 잘라서 배열로 만든다.
		Arrays.sort(ar, new Comparator<String>() { // 내림차순한다.
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		return String.join("",ar); // 배열을 구분자로 구분하여 문자열로 만든다.
	}

	@Test
	public void test() {
		assertEquals(new Exam0107_1().solution("Zbcdefg"), "gfedcbZ");
	}
}
