package exam.pr;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
/*
실패율
슈퍼 게임 개발자 오렐리는 큰 고민에 빠졌다. 
그녀가 만든 프랜즈 오천성이 대성공을 거뒀지만, 요즘 신규 사용자의 수가 급감한 것이다. 
원인은 신규 사용자와 기존 사용자 사이에 스테이지 차이가 너무 큰 것이 문제였다.

이 문제를 어떻게 할까 고민 한 그녀는 동적으로 게임 시간을 늘려서 난이도를 조절하기로 했다. 
역시 슈퍼 개발자라 대부분의 로직은 쉽게 구현했지만, 
실패율을 구하는 부분에서 위기에 빠지고 말았다. 오렐리를 위해 실패율을 구하는 코드를 완성하라.

실패율은 다음과 같이 정의한다.
스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 
stages가 매개변수로 주어질 때, 실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 
담겨있는 배열을 return 하도록 solution 함수를 완성하라.

제한사항
스테이지의 개수 N은 1 이상 500 이하의 자연수이다.
stages의 길이는 1 이상 200,000 이하이다.
stages에는 1 이상 N + 1 이하의 자연수가 담겨있다.
각 자연수는 사용자가 현재 도전 중인 스테이지의 번호를 나타낸다.
단, N + 1 은 마지막 스테이지(N 번째 스테이지) 까지 클리어 한 사용자를 나타낸다.
만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.

입출력 예
N	stages						result
5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
4	[4,4,4,4,4]					[4,1,2,3]

입출력 예 설명
입출력 예 #1
1번 스테이지에는 총 8명의 사용자가 도전했으며, 
이 중 1명의 사용자가 아직 클리어하지 못했다. 
따라서 1번 스테이지의 실패율은 다음과 같다.
1 번 스테이지 실패율 : 1/8

2번 스테이지에는 총 7명의 사용자가 도전했으며, 
이 중 3명의 사용자가 아직 클리어하지 못했다. 
따라서 2번 스테이지의 실패율은 다음과 같다.
2 번 스테이지 실패율 : 3/7

마찬가지로 나머지 스테이지의 실패율은 다음과 같다.
3 번 스테이지 실패율 : 2/4
4번 스테이지 실패율 : 1/2
5번 스테이지 실패율 : 0/1
각 스테이지의 번호를 실패율의 내림차순으로 정렬하면 다음과 같다.

[3,4,2,1,5]

입출력 예 #2
모든 사용자가 마지막 스테이지에 있으므로 4번 스테이지의 실패율은 
1이며 나머지 스테이지의 실패율은 0이다.

[4,1,2,3]
 */
public class Exam1230_1 {

	public int[] solution(int n, int[] stages) {
		int[] answer = new int[n];
		// stage별 사용자 수를 담는 HashMap 생성(key:stage, value:사용자 수)
		Map<Integer, Integer> frequency = new HashMap<>();
		// stage별 실패율을 담는 HashMap 생성(key:stage, value:실패율)
		Map<Integer, Double> failureRate = new HashMap<>();

		// stage별 사용자 수를 HashMap에 데이터를 추가
		for (int stage : stages) {
			// stage가 key로 존재하면 value값에 1을 더하고, key가 존재하지 않으면 1을 넣음
			int count = frequency.containsKey(stage) ? frequency.get(stage) + 1 : 1;
			frequency.put(stage, count);
		}
		System.out.println(frequency);
		// stages배열의 길이로 사용자 수를 구함.
		int numberOfUsers = stages.length;

		// stage별 사용자 수를 이용해 각 stage별 실패율을 구함
		// stage는 1부터, N까지
		for (int i = 1; i <= n; i++) {
			// stage번호 i가 키 값으로 존재하면
			// 실패율을 담는 HashMap에 key로 스테이지 값 i와
			// value로 stage에 남아 있는 사람과 통과한 사람을 나누어 저장 후
			// 해당 스테이지를 통과하지 못한(남아있는 사람 수)를 전체사용자 수에서 뺌(다음 스테이지 실패율을 위해)
			if (frequency.containsKey(i)) {
				failureRate.put(i, (double) (frequency.get(i)) / numberOfUsers);
				numberOfUsers -= frequency.get(i);
			} else {
				// stage번호 i가 key값으로 있지 않으면,
				// 전부 해당 stage를 통과했으므로 실패율은 '0'
				failureRate.put(i, 0.0);
			}
		}
		// 키값이 아닌 실패율을 가지고 내림차순 정렬
		// entrySet()은 Map.Entry<Integer, Double>을 리턴해 준다.
		List<Map.Entry<Integer, Double>> list = new LinkedList<>(failureRate.entrySet());
		// 정렬전 출력
		System.out.println(list);
		Collections.sort(list, new Comparator<Map.Entry<Integer, Double>>() {
			@Override
			public int compare(Entry<Integer, Double> o1, Entry<Integer, Double> o2) {
				double comint = (o2.getValue() - o1.getValue());
				return (int) (comint == 0 ? o1.getKey().compareTo(o2.getKey()) : comint > 0 ? 1 : -1);
			}
		});
		// 정렬된 값을 출력
		System.out.println(list);
		// 답은 정렬된 실패율이 아니라 스테이지이다. 배열에 스테이지 번호 담기
		Iterator<Map.Entry<Integer, Double>> it = list.iterator();
		for(int i=0;it.hasNext();i++) {
			answer[i] = it.next().getKey();
		}
		// 배열 출력
		System.out.println(Arrays.toString(answer));
		return answer;
	}

	@Test
	public void test() {
		assertArrayEquals(new Exam1230_1().solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3}), new int[] {3,4,2,1,5});
		assertArrayEquals(new Exam1230_1().solution(4, new int[] {4,4,4,4,4}), new int[] {4,1,2,3});
	}
}
