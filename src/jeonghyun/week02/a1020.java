import java.util.Scanner;

public class a1020 {

	public static void main(String[] args) {
		/*
		 * 주민번호는 다음과 같이 구성된다. 
		 * XXXXXX-XXXXXXX 
		 * 앞의 6자리는 생년월일(yymmdd)이고 뒤 7자리는 성별, 지역,
		 * 오류검출코드이다. 주민번호를 입력받아 형태를 바꿔 출력해보자.
		 */
		
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		// '-'로 구분되어있는 부분 쪼갠 뒤 바로 출력
		String arr[] = id.split("\\-");
		
		System.out.printf("%s%s", arr[0], arr[1]);
		
	


	}

}
