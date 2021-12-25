package exam.jo;
/*
문제
다음 출력 예와 같이 모든 단어를 15칸씩 오른쪽에 맞추어 출력되는 프로그램을 작성하시오.

출력 예
          Seoul     10,312,545        +91,375
          Pusan      3,567,910         +5,868
        Incheon      2,758,296        +64,888
          Daegu      2,511,676        +17,230
        Gwangju      1,454,636        +29,774

Hint!
모두 ' '가 포함되어있으므로 숫자가 아닌 문자열로 처리하면 된다.
공백도 한 칸을 차지하게 됨을 주의하라.
"%15s %15s %15s" 이렇게 표시하면 두 번째와 세 번째는 16칸이 되므로 "%15s%15s%15s"와 같이 공백이 없이 표시해야 된다.
 */
public class Ex105 {
	public static void main(String[] args) {
		String a = "Seoul";
		String b = "10,312,545";
		String c = "+91,375";
		String d = "Pusan";
		String e = "3,567,910";
		String f = "+5,868";
		
		System.out.printf("%15s%15s%15s",a,b,c);
		System.out.println();
		System.out.printf("%15s%15s%15s",d,e,f);
	}
}
