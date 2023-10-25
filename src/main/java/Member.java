public class Member {
    long id;
    String userId;
    String password;
    String regDate;

    Member(String userId, String password, String regDate) {
        this.userId = userId;
        this.password = password;
        this.regDate = regDate;
    }

    public long getId() {
        return this.id;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return this.password;
    }
}
