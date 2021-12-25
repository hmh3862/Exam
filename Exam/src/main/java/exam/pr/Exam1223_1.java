package exam.pr;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Test;

/*
없는 숫자 더하기
0부터 9까지의 숫자 중 일부가 들어있는 배열 numbers가 매개변수로 주어집니다. 
numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 
solution 함수를 완성해주세요.

제한사항
1 ≤ numbers의 길이 ≤ 9
0 ≤ numbers의 모든 수 ≤ 9
numbers의 모든 수는 서로 다릅니다.

입출력 예
numbers				result
[1,2,3,4,6,7,8,0]	14
[5,8,4,0,6,7,9]		6

입출력 예 설명
입출력 예 #1 : 5, 9가 numbers에 없으므로, 5 + 9 = 14를 return 해야 합니다.
입출력 예 #2 : 1, 2, 3이 numbers에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.
 */
public class Exam1223_1 {
	public int solution(int[] numbers) {
        List<Integer> list1 = IntStream.range(0, 10).boxed().collect(Collectors.toList()); // 0~9까지를 리스트로
        List<Integer> list2 = Arrays.stream(numbers).boxed().collect(Collectors.toList()); // 배열을 리스트로
        list1.removeAll(list2); // 같은것 모두 지우기 : 차집합
        return list1.stream().reduce(0,(a,b)->  a + b); // 합계
    }
	public int solution2(int[] numbers) {
		int answer = 0;
		for(int i=0;i<10;i++) {
			boolean flag = true; // 포함되지 않았다고 가정
			for(int j=0;j<numbers.length;j++) {
				if(i==numbers[j]) { // 포함하면 
					flag=false; // 거짓
					break;// 탈출
				}
			}
			if(flag) answer += i; // 참일때만 더하기
		}
		return answer;
	}
	@Test
	public void test() {
		assertEquals(new Exam1223_1().solution(new int[] {1,2,3,4,6,7,8,0}), 14);
		assertEquals(new Exam1223_1().solution(new int[] {5,8,4,0,6,7,9}), 6);
	}
	@Test
	public void test2() {
		assertEquals(new Exam1223_1().solution2(new int[] {1,2,3,4,6,7,8,0}), 14);
		assertEquals(new Exam1223_1().solution2(new int[] {5,8,4,0,6,7,9}), 6);
	}
}
