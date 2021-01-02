import java.util.Scanner;

public class a1024 {

	public static void main(String[] args) {
//		단어를 1개 입력받는다.
//		입력받은 단어(영어)의 각 문자를
//		한줄에 한 문자씩 분리해 출력한다
		
		
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		int w = word.length();
		//반복문 사용해서 알파벳 분리, 차례대로 출력
		for(int i=0;i<w;i++) {
			System.out.println(word.charAt(i));
		}

	}

}
