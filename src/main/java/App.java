
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    void run() {
        Scanner sc = new Scanner(System.in);
        List<Member> memberList = new ArrayList<>();
        List<Article> articleList = new ArrayList<>();

        System.out.println("== 프로그램 실행 ==");

        while (true) {
            System.out.print("명령어: ");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                System.out.println("== 종료 되었습니다 ==");
                break;
            } else if (command.equals("회원가입")) {
                String userId;
                String password;
                String passwordconfirm;

                while (true) {
                    System.out.print("아이디: ");
                    userId = sc.nextLine();
                    break;
                }
                while (true) {
                    System.out.print("비밀번호: ");
                    password = sc.nextLine();

                    System.out.print("비밀번호 재확인: ");
                    passwordconfirm = sc.nextLine();

                    if (!password.equals(passwordconfirm)) {
                        System.out.println("비밀번호가 다릅니다.\n== 다시 입력해 주세요 ==");
                        continue;
                    }
                    break;
                }
                Member member = new Member(userId, password);
                memberList.add(member);
                System.out.println("== 회원가입이 완료 되었습니다 ==");
            } else if (command.equals("등록")) {
                String title;
                String body;

                System.out.print("제목: ");
                title = sc.nextLine();
                System.out.print("내용: ");
                body = sc.nextLine();

                Article article = new Article(title, body);
                articleList.add(article);
            } else if (command.equals("목록")) {
                if (articleList.isEmpty()) {
                    System.out.println("작성된 게시글이 없습니다.");
                } else {
                    System.out.println("id // 제목 // 내용 // 작성자");
                    for (int i = 0; i < articleList.size(); i++) {
                        System.out.println(articleList.get(i));
                    }
                }


            } else if (command.equals("수정")) {

            } else if (command.equals("삭제")) {

            }
        }
        sc.close();
    }

    private class Article {
        public Article(String title, String body) {
        }
    }

    private class Member {

        Member(String userId, String password) {
        }
    }
}
