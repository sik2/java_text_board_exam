package example;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Article {
    private long id;
    private String userId;
    private String title;
    private String content;

    Article(long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
    public long getId() {
        return this.id =id;
    }
    public String getContent() {
        return this.content =content;
    }
    public String getTitle() {
        return this.title =title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
