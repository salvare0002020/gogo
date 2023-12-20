package model;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

public class RegistCheck {
    public static boolean checkUser(HttpSession session, String userName) {
        Users users = (Users) session.getAttribute("users");
        if (users != null) {
            ArrayList<User> userList = users.getUsers();
            for (User user : userList) {
                if (user.getUserName().equals(userName)) {
                    return false;
                }
            }
        }
        return true;
    }
}



/*package model;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

public class RegistCheck {
    public static boolean checkUser(HttpSession session, String userName) {
        Users users = (Users) session.getAttribute("users");
        ArrayList<User> userList = users.getUsers();
        for (User user : userList) {
            if (user.getUserName().equals(userName)) {
                return false;
            }
        }
        return true;
    }
}
*/
