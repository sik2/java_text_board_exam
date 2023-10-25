public class Article {
    private long id;
    private String title;
    private String content;
    private String userId;

    Article (long id, String title, String content, String userId){
        this.id = id;
        this.title = title;
        this.content = content;

    }
    long getId(){
        return this.id;
    }
    String getTitle() {
        return this.title;
    }
    String getContent(){
        return this.content;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
