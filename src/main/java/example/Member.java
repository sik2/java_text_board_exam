package example;

public class Member {
    private String userId;
    private String password;
    private String passwordConfrim;

    Member(String userId, String password, String checkedPassword) {
        this.userId = userId;
        this.password = password;
        this.passwordConfrim = checkedPassword;
    }
    Member(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    public String getUserId() {
        return this.userId;
    }
    public String getPassword() {
        return this.password;
    }
    public String getCheckedPassword() {
        return this.passwordConfrim;
    }

    public Object setUserId(String userId) {
       return this.userId = userId;
    }

}
