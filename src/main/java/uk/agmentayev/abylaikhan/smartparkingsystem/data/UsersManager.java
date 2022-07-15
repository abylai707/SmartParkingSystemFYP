package uk.agmentayev.abylaikhan.smartparkingsystem.data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class UsersManager {
    private static final File usersFile = new File("data/users.dat");
    private static final String USER_DELIMITER = "== user ==";
    private static UsersManager usersManager = null;
    private final List<User> ulist = new ArrayList<>();

    private UsersManager() {
        User u = new User(1, "vasya", "123", "Vasya", "Pyatakov", 121);
        ulist.add(u);

//        u = new User(2);
//        u.setUname("pete");
//        u.setPassword("321");
//        u.setFirst_name("Petya");
//        u.setLast_name("Rytakov");
//        u.setBrunel_id(122);
//        ulist.add(u);
    }

    public static UsersManager getUsersManager() {
        if (usersManager == null) {
            usersManager = new UsersManager();
        }
        return usersManager;
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

    /** flashing users list to users storage
     *
     */
    public void writeUsers() throws IOException {
        try (BufferedWriter f = new BufferedWriter(new FileWriter(usersFile))) {
            for (User user : ulist) {
                f.write("id:"); f.write(String.valueOf(user.getId())); f.newLine();
                f.write("br:"); f.write(String.valueOf(user.getBrunelId()));  f.newLine();
                f.write("un:"); f.write(user.getUname()); f.newLine();
                f.write("pw:"); f.write(user.getPassword()); f.newLine();
                f.write("fn:"); f.write(user.getFirstName()); f.newLine();
                f.write("ln:"); f.write(user.getLastName()); f.newLine();
                f.write("pn:"); f.write(user.getLastName()); f.newLine();
                f.write("em:"); f.write(user.getLastName()); f.newLine();
                f.write(USER_DELIMITER); f.newLine();
            }
        }
    }
}
