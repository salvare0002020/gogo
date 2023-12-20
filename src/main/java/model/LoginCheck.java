package model;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

public class LoginCheck {
    public static boolean checkUser(HttpSession session, String userName, String userPass) {
        Users users = (Users) session.getAttribute("users");
        ArrayList<User> userList = users.getUsers();
        for (User user : userList) {
            if (user.getUserName().equals(userName) && user.getUserPass().equals(userPass)) {
                return true;
            }
        }
        return false;
    }
}
