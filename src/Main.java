import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		/**
		 * nextLine = String 형 
		 * nextInt = int형
		 * 
		 * 에러 : 실행햇는데 완전히 안되는거
		 * 예외 : 실행했는데 해보니깐 안됌  -> "필수"
		 */
		
		
		System.out.println("===프로그램 시작===");
		
		Scanner sc = new Scanner(System.in);
		
		//while -> 무한 루프
		while(true) {
			System.out.printf("명령어) :");
			String cmd = sc.nextLine(); //입력기능.
			
			if(cmd.equals("exit")) {
				
				break; // : 무한루프 종료
			}
		}
		
		
		System.out.println("===프로그램 끝===");
		sc.close();
	}
}
