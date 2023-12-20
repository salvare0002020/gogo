package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginCheck;
import model.User;
import model.Users;

@WebServlet("/Login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("userName");
        String userPass = request.getParameter("userPass");

        HttpSession session = request.getSession();
        Users users = (Users) session.getAttribute("users");
        if (users == null) {
            users = new Users();
            session.setAttribute("users", users);  // ユーザ比較用sessionScore"users"を定義
        }
        //ログイン結果を返す
        boolean checkResult = LoginCheck.checkUser(session, userName, userPass);
        if (checkResult) {
            User user = new User(userName, userPass);
            users.addUser(user);
            session.setAttribute("users", users);
            request.setAttribute("result", "true");
        } else {
            request.setAttribute("result", "false");
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/loginResult.jsp");
        dispatcher.forward(request, response);
    }
}
