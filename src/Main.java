import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/**
		 * nextLine = String 형 nextInt = int형
		 * text is hard......
		 * 에러 : 실행햇는데 완전히 안되는거 예외 : 실행했는데 해보니깐 안됌 -> "필수"
		 */

		System.out.println("===프로그램 시작===");
		Scanner sc = new Scanner(System.in);
		int lastArticleID = 0;
		
		List<Article> articles = new ArrayList<>();
		

		// while -> 무한 루프
		while (true) {

			System.out.printf("명령어) :");
			String cmd = sc.nextLine().trim(); // 입력기능.
			// trim() :처음과 끝의 공백을 제거

			if (cmd.length() == 0) {
				System.out.println("명령어를 입력해주세요");
				continue;
			}

			if (cmd.equals("article write")) {
				int id = lastArticleID + 1;
				lastArticleID = id;

				System.out.printf("제목 :");
				String title = sc.nextLine();
				System.out.printf("내용 :");
				String content = sc.nextLine();
//				lastArticleID++;

				Article article = new Article(id, title, content);

				System.out.printf("%d글이 생성되었습니다\n", id);

//				System.out.printf("%s, %s\n",title,content);
			} else if (cmd.equals("article list")) {
				System.out.println("게시글이 없습니다");
			} else {
				System.out.println("존재하지 않는 명령어 입니다.");
			}

			if (cmd.equals("exit")) {
				break; // : 무한루프 종료
			}
		}

		System.out.println("===프로그램 끝===");
		sc.close();
	}
}

class Article {
	
	int id;
	String title;
	String content;
	
	public Article() {
	}

	public Article(int id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}

}
