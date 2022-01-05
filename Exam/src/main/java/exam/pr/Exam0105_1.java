package exam.pr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
다트 게임
카카오톡 게임별의 하반기 신규 서비스로 다트 게임을 출시하기로 했다. 
다트 게임은 다트판에 다트를 세 차례 던져 그 점수의 합계로 실력을 겨루는 게임으로, 모두가 간단히 즐길 수 있다.
갓 입사한 무지는 코딩 실력을 인정받아 게임의 핵심 부분인 점수 계산 로직을 맡게 되었다. 
다트 게임의 점수 계산 로직은 아래와 같다.

다트 게임은 총 3번의 기회로 구성된다.
각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 
각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 
아차상(#) 당첨 시 해당 점수는 마이너스된다.
스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.

입력 형식
"점수|보너스|[옵션]"으로 이루어진 문자열 3세트.
예) 1S2D*3T

점수는 0에서 10 사이의 정수이다.
보너스는 S, D, T 중 하나이다.
옵선은 *이나 # 중 하나이며, 없을 수도 있다.
출력 형식
3번의 기회에서 얻은 점수 합계에 해당하는 정수값을 출력한다.
예) 37

입출력 예제
예제		dartResult		answer		설명
1			1S2D*3T			37			11 * 2 + 22 * 2 + 33
2			1D2S#10S		9			12 + 21 * (-1) + 101
3			1D2S0T			3			12 + 21 + 03
4			1S*2T*3S		23			11 * 2 * 2 + 23 * 2 + 31
5			1D#2S*3S		5			12 * (-1) * 2 + 21 * 2 + 31
6			1T2D3D#			-4			13 + 22 + 32 * (-1)
7			1D2S3T*			59			12 + 21 * 2 + 33 * 2
*/
public class Exam0105_1 {

	public int solution(String dartResult) {
		int answer = 0;
		char[] darts = dartResult.toCharArray(); // 문자 배열로 만든다.
        int[] score = new int[3]; // 3게임의 점수를 저장하기 위한 배열. 왜? 이전 게임의 점수를 처리할 상황이 있다.
        int cnt = -1; // 배열의 첨자(증가해서 0이 되어야 하므로 -1로 초기화)
 
        for(int i = 0; i < darts.length; i++) { // 모든 문자 반복
            if(darts[i] >= '0' && darts[i] <= '9') { // 숫자라면 
                cnt++; // 첨자 증가 왜? 점수 다음에 게임의 상태가 나옴
                if(darts[i] == '1' && darts[i+1] == '0') { // 10점 처리
                    score[cnt] = 10;
                    i++; // 두개를 처리 했으니 +1을 해서 다다음 글자로 이동
                } else {
                    score[cnt] = darts[i] - '0'; // 문자를 숫자로 바꾸어 점수 처리
                }
            } else if(darts[i] == 'D') { // 더블이라면 점수의 제곱
                score[cnt] *= score[cnt];
            } else if(darts[i] == 'T') { // 트리플이라면 점수의 세제곱
                score[cnt] *= score[cnt] * score[cnt];
            } else if(darts[i] == '*') { // 스타 상이면 현재 게임과 이전 게임의 점수를 두배
                if(cnt > 0) {
                    score[cnt-1] *= 2; // 이전 게임이 있다면 이전 게임 점수 2배
                }
                score[cnt] *= 2; // 현재게임 점수 2배
            } else if(darts[i] == '#') { // 아차상이면 점수를 빼준다. --- 음수로 만든다.
                score[cnt] *= -1; // -1을 곱해 음수로 만듬
            }
        }
        answer = score[0] + score[1] + score[2]; // 세개의 합이 점수!!!!
		return answer;
	}

	@Test
	public void test() {
		assertEquals(new Exam0105_1().solution("1S2D*3T"), 37);
		assertEquals(new Exam0105_1().solution("1D2S#10S"), 9);
		assertEquals(new Exam0105_1().solution("1D2S0T"), 3);
		assertEquals(new Exam0105_1().solution("1S*2T*3S"), 23);
		assertEquals(new Exam0105_1().solution("1D#2S*3S"), 5);
		assertEquals(new Exam0105_1().solution("1T2D3D#"), -4);
		assertEquals(new Exam0105_1().solution("1D2S3T*"), 59);
	}
}
