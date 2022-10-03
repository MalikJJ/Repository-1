package _5_4_abstract_classes;

public abstract class User {
    private int id;
    private String login;
    private String password;

    static int count = 1;

    public abstract String getUserData();

    public User() {
    }
    public User(String login, String password) {
        this.id = count;
        this.login = login;
        this.password = password;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "id " + id +
                ", login " + login +
                ", password " + password;
    }
}

//------------------------------------------------------------------

