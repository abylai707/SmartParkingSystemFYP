package uk.agmentayev.abylaikhan.smartparkingsystem.data;

import java.util.ArrayList;
import java.util.List;

public class Users {

    private final List<User> ulist = new ArrayList<>();

    public Users() {
        User u = new User();
        u.setFirst_name("Vasya");
        u.setUname("vasya");
        u.setPassword("123");
        u.setId(1);
        u.setBrunel_id(121);
        u.setLast_name("Pyatakov");
        ulist.add(u);

        u = new User();
        u.setFirst_name("Petya");
        u.setUname("pete");
        u.setPassword("321");
        u.setId(2);
        u.setBrunel_id(122);
        u.setLast_name("Rytakov");
        ulist.add(u);
    }

    public List<User> getUsers(int brId) {
        return ulist;
    }

    public boolean checkUser(String uname, String password) {
        for (User user : ulist) {
            if (user.getUname().equals(uname) && user.getPassword().equals(password))
                return true;
        }
        return false;
    }

    public void flush() {

    }
}
