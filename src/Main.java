import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/**
		 * nextLine = String 형 nextInt = int형
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
				
			}else if (cmd.equals("article write")) {
				int id = lastArticleID + 1;
				lastArticleID = id;

				System.out.printf("제목 :");
				String title = sc.nextLine();
				System.out.printf("내용 :");
				String content = sc.nextLine();
//				lastArticleID++;

				Article article = new Article(id, title, content);
				articles.add(article);
				System.out.printf("%d글이 생성되었습니다\n", id);

//				System.out.printf("%s, %s\n",title,content);
			}else if (cmd.equals("article list")) {
				System.out.println("번호	|	제목");
				/**
				 * 배열 , list를 역순 조회 할때는
				 * 초기값에 size() -1해주고 종료조건을 0이 될때까지 i--해준다
				 */
				for(int i = articles.size() - 1; i>=0; i--) {
					Article article = articles.get(i);
					System.out.printf("%d	|	%s\n",article.id,article.title);
				}
				if(articles.size() == 0){
					System.out.println("게시물이 없습니다");
					continue;
				}
			} else if (cmd.startsWith("article detail ")) {
				String[] detail = cmd.split(" ");
				int num = Integer.parseInt(detail[2]) ;
//				boolean found = false;
				Article foundArticle = null;
				
				for (Article article : articles) {
					/**
					 * 반복문을 돌면서 인덱스값num 기준으로
					 * 글번호id값 매칭 시킬때까지
					 * for문을 돌려준다.
					 * 돌려서 매칭되면 if문 실행
					 */
					if (article.id == num) {
						foundArticle =article;
//						found = true;
//						System.out.printf("번호	|	%d\n",article.id);
//						System.out.printf("날짜	|	%s\n",article.title);
//						System.out.printf("제목	|	%s\n",article.title);
//						System.out.printf("내용	|	%s\n",article.content);
						break;
					}
				}
				
				if(foundArticle == null) {
					System.out.printf("%d번 글 존재하지않아요\n",num);
					continue;
				}
				System.out.printf("번호	|	%d\n",foundArticle.id);
				System.out.printf("날짜	|	%s\n",foundArticle.title);
				System.out.printf("제목	|	%s\n",foundArticle.title);
				System.out.printf("내용	|	%s\n",foundArticle.content);
					
			}else if (cmd.startsWith("article delete ")) {
				String[] detail = cmd.split(" ");
				int num = Integer.parseInt(detail[2]) ;
//				boolean found = false;
				/**
				 * 이유: ArrayList안에는 -1이 없기때문에 초기화값을 -1로해준다
				 */
				int foundIndex = -1; 
				
				for (int i = 0; i < articles.size(); i++) {
					Article article = articles.get(i);
					
					if (article.id == num) {
						foundIndex = i;
						break;
				}
				
				}
				if(foundIndex == -1) {
					System.out.printf("%d번 글 존재하지않아요\n",num);
					continue;
				}
				articles.remove(foundIndex);
				System.out.printf("%d번 글이 삭제 되었습니다\n",num);
			}
			
			else {
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
