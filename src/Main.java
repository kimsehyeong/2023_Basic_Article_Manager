import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("===프로그램 시작===");
		
		Scanner sc = new Scanner(System.in);
		
		String cmd = sc.nextLine(); //입력기능.
		
		/**
		 * nextLine = String 형 
		 * nextInt = int형
		 * 
		 * 에러 : 실행햇는데 완전히 안되는거
		 * 예외 : 실행했는데 해보니깐 안됌  -> "필수"
		 */
		System.out.println("입력된 명령어 : " + cmd);
		
		
		System.out.println("===프로그램 끝===");
		sc.close();
	}
}
