package uk.agmentayev.abylaikhan.smartparkingsystem.data;

public class User {
    private int id;
    private String uname;
    private String password;
    private String first_name;
    private String last_name;
    private int brunel_id;

    public User(int id, String uname, String password, String first_name, String last_name, int brunel_id) {
        this.id = id;
        this.uname = uname;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.brunel_id = brunel_id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getBrunelId() {
        return brunel_id;
    }

    public void setBrunel_id(int brunel_id) {
        this.brunel_id = brunel_id;
    }
}
