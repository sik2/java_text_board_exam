package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 프로그램 실행 ==");

        Scanner sc = new Scanner(System.in);

        List<Article> articleList = new ArrayList<>();
        List<Member> memberList = new ArrayList<>();
        long id = 0;

        while(true) {
            System.out.print("명령어 ) ");

            String command = sc.nextLine();

            if(command.equals("회원가입")) {
                String userId;
                String password;
                String passwordConfrim;


                System.out.print("아이디 ) ");
                userId = sc.nextLine();

                System.out.print("비밀번호 ) ");
                password = sc.nextLine();

                System.out.print("비밀번호 확인 ) ");
                passwordConfrim = sc.nextLine();

                Member member = new Member(userId, password, passwordConfrim);
                memberList.add(member);


                for(int i = 0; i < memberList.size(); i++) {
                    memberList.get(i);
                     if(member.getUserId().equals(member) == true) {
                         System.out.println("아이디를 확인해 주세요");
                         break;
                     }
                }

                for(int i = 0; i < memberList.size(); i++) {
                    memberList.get(i);
                    if(password.equals(passwordConfrim)) {
                        System.out.println(member.getUserId() + "님 회원가입이 완료 되었습니다.");
                        break;
                    }
                }

                for(int i = 0; i < memberList.size(); i++) {
                    memberList.get(i);
                    if(!password.equals(passwordConfrim)) {
                        System.out.println("비밀번호가 일치하지 않습니다.");
                        break;
                    }
                }
            } else if(command.equals("로그인")) {

                System.out.print("아이디 ) ");
                String userId = sc.nextLine();

                System.out.print("비밀번호 ) ");
                String password = sc.nextLine();


                Member member = new Member(userId, password);
                memberList.add(member);

                System.out.println(member.getUserId() + "님 로그인 되었습니다.");

            }
            else if(command.equals("등록")) {
                id++;

                System.out.print("제목 : ");
                String title = sc.nextLine();

                System.out.print("내용 : ");
                String content = sc.nextLine();

                System.out.println(id + "번 게시물이 등록 되었습니다.");
                Article article = new Article(id, title, content);
                articleList.add(article);

            }else if(command.equals("목록")) {
                System.out.println("번호 / 제목 / 내용 ");

                for(int i = 0; i < articleList.size(); i++) {
                    Article article = articleList.get(i);
                    System.out.printf("%d, %s, %s \n", article.getId(), article.getTitle(), article.getContent());
                }
            }else if(command.equals("수정")) {
                System.out.print("수정할 번호를 입력하세요 ) ");
                long modifyId = sc.nextLong();
                sc.nextLine();
                for(int i = 0; i < articleList.size(); i++) {
                    Article article = articleList.get(i);
                    if(modifyId == article.getId()) {
                        System.out.println("기존 제목 : " + article.getTitle());
                        System.out.print("수정 : ");
                        String title = sc.nextLine();
                        article.setTitle(title);

                        System.out.println("기존 내용 : " + article.getContent());
                        System.out.print("수정 : ");
                        String content = sc.nextLine();
                        article.setContent(content);
                    }
                }
                System.out.println(modifyId + "번 게시물이 수정 되었습니다.");
            }else if (command.equals("삭제")) {
                System.out.print("삭제할 번호를 입력하세요 ) ");
                long removeId = sc.nextLong();
                sc.nextLine();

                for(int i = 0; i < articleList.size(); i++) {
                    Article article = articleList.get(i);

                    if(removeId == article.getId()) {
                        articleList.remove(article);
                    }
                }
                System.out.println(removeId + "번 게시물이 삭제 되었습니다.");
            }

        }
    }
}
