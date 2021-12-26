package exam.jo;
/*
문제
다음과 같이 출력되는 프로그램을 작성하라.
(각 요소들은 10칸씩 공간을 확보하여 오른쪽으로 정렬하여 출력한다.)

출력 예
      item     count     price
       pen        20       100
      note         5        95
    eraser       110        97
 */
public class Ex508 {
	public static void main(String[] args) {
		String a = "item";
		String b = "count";
		String c = "price";
		String d = "pen";
		String e = "20";
		String f = "100";
		
		System.out.printf("%10s%10s%10s",a,b,c);
		System.out.println();
		System.out.printf("%10s%10s%10s",d,e,f);
	}
}
