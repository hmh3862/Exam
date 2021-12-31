package exam.pr;

import static org.junit.Assert.assertArrayEquals;

import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

/*
두 개 뽑아서 더하기
정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 
두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 
return 하도록 solution 함수를 완성해주세요.

제한사항
numbers의 길이는 2 이상 100 이하입니다.
numbers의 모든 수는 0 이상 100 이하입니다.

입출력 예
numbers		result
[2,1,3,4,1]	[2,3,4,5,6,7]
[5,0,2,7]	[2,5,7,9,12]

입출력 예 #1
2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)
3 = 2 + 1 입니다.
4 = 1 + 3 입니다.
5 = 1 + 4 = 2 + 3 입니다.
6 = 2 + 4 입니다.
7 = 3 + 4 입니다.
따라서 [2,3,4,5,6,7] 을 return 해야 합니다.

입출력 예 #2
2 = 0 + 2 입니다.
5 = 5 + 0 입니다.
7 = 0 + 7 = 5 + 2 입니다.
9 = 2 + 7 입니다.
12 = 5 + 7 입니다.
따라서 [2,5,7,9,12] 를 return 해야 합니다.
*/
public class Exam1231_2 {

    public int[] solution(int[] numbers) {
        int[] result = null;
        // 두개씩 더해서 존재하는 모든 수를 중복을 제거해서 만들어야 한다.
        Set<Integer> set = new TreeSet<Integer>(); // 중복제거되고 정렬되는 자료구조
        // 두개를 더해서 존재하는 모든 경우를 처리 : 선택정렬 알고리즘 사용
        for(int i=0;i<numbers.length-1;i++) {
        	for(int j=i+1;j<numbers.length;j++) {
        		set.add(numbers[i]+numbers[j]); // 추가
        	}
        }
        result = new int[set.size()]; // 셑의 개수가 배열의 크기
        int i=0;
        for(int t : set) result[i++] = t; // 셑의 내용을 배열로 옮기기
        return result;
    }

	@Test
	public void test() {
		assertArrayEquals(new Exam1231_2().solution(new int[] {2,1,3,4,1}), new int[] {2,3,4,5,6,7});
		assertArrayEquals(new Exam1231_2().solution(new int[] {5,0,2,7}), new int[] {2,5,7,9,12});
	}
}
