package ex_24_Java_Encapsulation;

public class GoodVMOLogin_193 {

    private String username;
    private String password;

    public GoodVMOLogin_193(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin == true)
        {
            this.password = password;
        }
        else {
            System.out.println("Can't change the password");
        }

    }
}
