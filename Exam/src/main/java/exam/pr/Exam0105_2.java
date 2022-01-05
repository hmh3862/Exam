package exam.pr;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

/*
같은 숫자는 싫어
배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 

예를 들면,
arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 
solution 함수를 완성해 주세요.

제한사항
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

입출력 예
arr				answer
[1,1,3,3,0,1,1]	[1,3,0,1]
[4,4,4,3,3]		[4,3]

입출력 예 설명
입출력 예 #1,2
문제의 예시와 같습니다.
*/
public class Exam0105_2 {

	public int[] solution(int []arr) {
        int[] answer = null;
        // 순서가 유지되어야 한다. List를 사용하자.
        List<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]); // 첫번째것은 무조건 넣는다.
        for(int i=1;i<arr.length;i++) {
        	if(list.get(list.size()-1) != arr[i]) {
        		// 마지막에 있는 값과 배열의 값이 같지 않을때만 리스트에 추가
        		list.add(arr[i]);
        	}
        }
        System.out.println(list);
        // 리스트의 크기가 배열의 크기
        answer = new int[list.size()];
        // 리스트의 내용을 배열로 복사
        for(int i=0;i<answer.length;i++) answer[i] = list.get(i);
		return answer;
	}
	public int[] solution2(int []arr) {
		int[] answer = null;
		// 스텍으로 풀어보자
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[0]); // 첫번째것은 무조건 넣는다.
		for(int i=1;i<arr.length;i++) {
			if(stack.peek() != arr[i]) {
				// 마지막에 있는 값과 배열의 값이 같지 않을때만 스택에 추가
				stack.push(arr[i]);
			}
		}
		System.out.println(stack);
		// 스택의 크기가 배열의 크기
		answer = new int[stack.size()];
		// 스택의 내용을 배열에 뒤에서부터 복사
		for(int i=answer.length-1;i>=0;i--) answer[i] = stack.pop();
		return answer;
	}

	@Test
	public void test() {
		assertArrayEquals(new Exam0105_2().solution(new int[] {1,1,3,3,0,1,1}), new int[] {1,3,0,1});
		assertArrayEquals(new Exam0105_2().solution(new int[] {4,4,4,3,3}), new int[] {4,3});
		
	}
	@Test
	public void test2() {
		assertArrayEquals(new Exam0105_2().solution2(new int[] {1,1,3,3,0,1,1}), new int[] {1,3,0,1});
		assertArrayEquals(new Exam0105_2().solution2(new int[] {4,4,4,3,3}), new int[] {4,3});
		
	}
}
