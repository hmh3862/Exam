package exam.pr;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/*
나누어 떨어지는 숫자 배열
array의 각 element 중 divisor로 
나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.

입출력 예
arr				divisor	return
[5, 9, 7, 10]	5		[5, 10]
[2, 36, 1, 3]	1		[1, 2, 3, 36]
[3,2,6]			10		[-1]

입출력 예 설명
입출력 예#1
arr의 원소 중 5로 나누어 떨어지는 원소는 5와 10입니다. 따라서 [5, 10]을 리턴합니다.

입출력 예#2
arr의 모든 원소는 1으로 나누어 떨어집니다. 
원소를 오름차순으로 정렬해 [1, 2, 3, 36]을 리턴합니다.

입출력 예#3
3, 2, 6은 10으로 나누어 떨어지지 않습니다. 
나누어 떨어지는 원소가 없으므로 [-1]을 리턴합니다.
*/
public class Exam0105_3 {

	public int[] solution(int[] arr, int divisor) {
		int[] answer=null;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
        	if(arr[i]%divisor==0) {
        		// 나누어 떨어지면 리스트에 추가
        		list.add(arr[i]);
        	}
        } 
		Collections.sort(list);
		System.out.println(list);
		if(list.size()!=0) { // 있으면 배열로 복사
	        // 리스트의 크기가 배열의 크기
	        answer = new int[list.size()];
	        // 리스트의 내용을 배열로 복사
	        for(int i=0;i<answer.length;i++) answer[i] = list.get(i);
		}else { // 없으면 -1 배열을 리턴
			answer = new int[]{-1};
		}
		return answer;
	}

	@Test
	public void test() {
		assertArrayEquals(new Exam0105_3().solution(new int[] {5, 9, 7, 10},5), new int[] {5, 10});
		assertArrayEquals(new Exam0105_3().solution(new int[] {2, 36, 1, 3},1), new int[] {1, 2, 3, 36});
		assertArrayEquals(new Exam0105_3().solution(new int[] {3,2,6},10), new int[] {-1});
	}
}
