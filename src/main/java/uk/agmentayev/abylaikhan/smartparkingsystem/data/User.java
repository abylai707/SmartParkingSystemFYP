package uk.agmentayev.abylaikhan.smartparkingsystem.data;

public class User {
    private int id;
    private String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    private String first_name;
    private String last_name;
    private int brunel_id;
    private String password;

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

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getBrunel_id() {
        return brunel_id;
    }

    public void setBrunel_id(int brunel_id) {
        this.brunel_id = brunel_id;
    }
}
