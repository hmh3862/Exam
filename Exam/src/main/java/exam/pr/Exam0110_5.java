package exam.pr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
이상한 문자 만들기
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
각 단어의 짝수번째 알파벳은 대문자로, 
홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
입출력 예
s					return
"try hello world"	"TrY HeLlO WoRlD"
입출력 예 설명
"try hello world"는 세 단어 "try", "hello", "world"로 구성되어 있습니다. 
각 단어의 짝수번째 문자를 대문자로, 
홀수번째 문자를 소문자로 바꾸면 "TrY", "HeLlO", "WoRlD"입니다. 따라서 "TrY HeLlO WoRlD" 를 리턴합니다.
*/
public class Exam0110_5 {
	// 아까 풀이에서는 split함수는 뒤에 연달아 공백이 오면 처리를 하지 못한다.
	// 그래서 그냥 날코딩 했다. 
	public String solution(String s) {
		String answer = "";
		int cnt=0;
		for(char c : s.toCharArray()) {
			if(c==' ') { // 빈칸이면
				answer += " "; // 빔칸 추가
				cnt = 0; // 새로운 단어 시작이니까 다시 세어야 한다.
			}else { // 글자라면
				if(cnt%2==0) // 짝수면 대문자로 
					answer += (c+"").toUpperCase();
				else // 홀수면 소문자로
					answer += (c+"").toLowerCase();
				cnt++; // 글자수 세기
			}
			
		}
		return answer;
	}

	@Test
	public void test() {
		assertEquals(new Exam0110_5().solution("try hello     world"), "TrY HeLlO     WoRlD");
		assertEquals(new Exam0110_5().solution("ab ab ab ab"), "Ab Ab Ab Ab");
	}
}
