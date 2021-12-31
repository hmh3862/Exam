package exam.pr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
2016년
2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, 
solution을 완성하세요. 
요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT

입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.

제한 조건
2016년은 윤년입니다.
2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
입출력 예
a	b	result
5	24	"TUE"
 */
public class Exam1231_3 {

	public String solution(int a, int b) {
		String answer = "";
		String[] w = "FRI,SAT,SUN,MON,TUE,WED,THU".split(",");// 금요일부터 시작
		int m[] = {31,29,31,30,31,30,31,31,30,31,30,31}; // 월의 길이(윤년이라 2월을 29일로)
		int sum=0;
		for(int i=1;i<a;i++) sum += m[i-1]; // 전월까지의 일수 합
		sum += b-1; // 전일까지의 일수
		answer = w[sum%w.length]; // 일을 7로 나눈 나머지가 요일
		System.out.println(answer);
        return answer;
    }

	@Test
	public void test() {
		assertEquals(new Exam1231_3().solution(5, 24), "TUE");
	}
}
