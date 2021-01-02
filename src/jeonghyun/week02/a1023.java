import java.util.Scanner;

public class a1023 {

	public static void main(String[] args) {
		// 실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력
		
		Scanner sc = new Scanner(System.in);
		String flo = sc.next();
		
		// 정수, 실수 부분을 split사용하여 나누기
		String[] arr = flo.split("\\.");
		
		System.out.println(arr[0] + " " + arr[1]);

	}

}
