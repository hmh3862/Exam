package exam.pr;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

/*
문자열 내 마음대로 정렬하기
문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 
각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 
각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

제한 조건
strings는 길이 1 이상, 50이하인 배열입니다.
strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
모든 strings의 원소의 길이는 n보다 큽니다.
인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
입출력 예
strings					n	return
["sun", "bed", "car"]	1	["car", "bed", "sun"]
["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]

입출력 예 설명
입출력 예 1
"sun", "bed", "car"의 1번째 인덱스 값은 각각 "u", "e", "a" 입니다. 
이를 기준으로 strings를 정렬하면 ["car", "bed", "sun"] 입니다.

입출력 예 2
"abce"와 "abcd", "cdx"의 2번째 인덱스 값은 "c", "c", "x"입니다. 
따라서 정렬 후에는 "cdx"가 가장 뒤에 위치합니다. 
"abce"와 "abcd"는 사전순으로 정렬하면 "abcd"가 우선하므로, 
답은 ["abcd", "abce", "cdx"] 입니다.
*/
public class Exam0106_2 {

	public String[] solution(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {
			// 같으면 0, 알의것이 크면 양수, 뒤의것이 크면 음수를 리턴하도록 만들어 주면된다.  
			@Override
			public int compare(String o1, String o2) {
				if(o1.charAt(n) - o2.charAt(n)==0) { // n번째 글자가 같다면
					return o1.compareTo(o2); // 일반 문자열 정렬을 한다. String은 이미 정렬하는 메서드가 만들어져있다.
				}
				return o1.charAt(n) - o2.charAt(n);// 같지 않으면 n번째 글자로 정렬 한다.
				// 'b' - 'a' = 98-97 = 1
				// 'a' - 'a' = 97-97 = 0
				// 'a' - 'b' = 97-98 = -1
			}
		});
		return strings;
	}

	@Test
	public void test() {
		assertArrayEquals(new Exam0106_2().solution(new String[] {"sun", "bed", "car"},1), 
				new String[]{"car", "bed", "sun"});
		assertArrayEquals(new Exam0106_2().solution(new String[] {"abce", "abcd", "cdx"},2), 
				new String[]{"abcd", "abce", "cdx"});
		
	}
}
