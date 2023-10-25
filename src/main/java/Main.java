
import java.lang.reflect.Member;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Article> articleList = new ArrayList<>();
        List<Member> memberList = new ArrayList<>();
        Member loginedMember = null;
        System.out.println("== 프로그램 시작 ==");
        long lastId = 0;
        while (true) {
            System.out.printf("명령어 :");
            String command = sc.nextLine();
            String passwordConfirm = null;
            if (command.equals("종료")) {
                break;
            } else if (command.equals("회원가입")) {
                String userId;
                String password;

                System.out.println("아이디 :");
                userId = sc.nextLine();
                boolean existUserId = false;
                for (int i = 0; i < memberList.size(); i++) {
                    Member member = memberList.get(i);
                    if (userId.equals(existUserId) != false) {
                        System.out.printf("존재하는 아이디입니다.");
                        continue;
                    }
                }

                System.out.printf("비번 :");
                password = sc.nextLine();
                System.out.printf("비번 확인 :");
                passwordConfirm = sc.nextLine();

                if (password.equals(passwordConfirm) != false) {
                    System.out.printf("비밀번호가 일치하지않습니다.");
                } else {
                    LocalDate now = LocalDate.now();
                    Member member = new Member(userId, password, now.toString());
                    memberList.add(member);

                    System.out.printf(userId + "님 회원가입 완료되었습니다.");
                }
            } else if (command.equals("로그인")) {
                if (loginedMember != null) {
                    System.out.println("로그인이 되어 있습니다.");
                }
                System.out.printf("아이디 :");
                String userId = sc.nextLine();

                System.out.println("비번 :");
                String password = sc.nextLine();

            } else if (command.equals("등록")) {
                System.out.printf("제목");
                String title = sc.nextLine();
                System.out.printf("내용");
                String content = sc.nextLine();
                Article article = new Article(lastId, title, content, loginedMember);
                articleList.add(article);

                System.out.printf(lastId + "번 게시글이 등록되었습니다.");
                lastId++;
            } else if (command.equals("목록")) {
                if (articleList == null) {
                    System.out.printf("게시물이 없습니다.");
                } else {
                    System.out.println("번호 / 제목 / 내용 / 작성자 \n");
                }
                for (int i = 0; i < articleList.size(); i++) {
                    Article article = articleList.get(i);
                    System.out.printf("%d / %s / %s / %s\n" + article.getId(), article.getContent(), article.getTitle());
                }
            } else if (command.equals("삭제")) {
                System.out.printf("삭제 번호 :");
                long id = sc.nextLong();
                sc.nextLine();

                long foundIndex = -1;
                for (int i = 0; i < articleList.size(); i++) {
                    Article article = articleList.get(i);
                    if (article.getId() == id) {
                        foundIndex = id;
                        articleList.remove(article);
                        break;
                    }
                }
                if (foundIndex == -1) {
                    System.out.println(id + "번째 게시물은 존재하지 않습니다.");
                } else {
                    System.out.println(id + "번째 게시글이 삭제 되었습니다.");
                }
            } else if (command.equals("수정")) {
                System.out.printf("수정 번호 :");
                long id = sc.nextLong();
                sc.nextLine();
                long foundIndex = -1;

                for (int i = 0; i < articleList.size(); i++) {
                    Article article = articleList.get(i);
                    if (article.getId() == id) {
                        System.out.printf("기존 제목: %d\n", article.getTitle());
                        System.out.printf("제목:");
                        article.setTitle(title);
                        System.out.printf("기존 내용: %s\n", article.getContent());
                        System.out.printf("내용:");
                        article.setContent(content);
                        break;
                    }
                }
                if (foundIndex == -1) {
                    System.out.println(id + "번째 게시물은 존재하지 않습니다.");
                } else {
                    System.out.println(id + "번째 게시글이 수정 되었습니다.");
                }
            }
            sc.close();
            System.out.println("== 프로그램 종료 ==");
        }
    }
}