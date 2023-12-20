package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegistCheck;
import model.User;
import model.Users;

@WebServlet("/Regist")
public class Regist extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String userName = request.getParameter("userName");
        String userPass = request.getParameter("userPass");

        HttpSession session = request.getSession();
        Users users = (Users) session.getAttribute("users");
        if (users == null) {
            users = new Users();
            session.setAttribute("users", users);  // この行を追加
        }

        boolean checkResult = RegistCheck.checkUser(session, userName);
        //検証のためフォームのデータを送信
        if (checkResult) {
            User user = new User(userName, userPass);
            users.addUser(user);
            session.setAttribute("users", users);
            request.setAttribute("result", "true");
        } else {
            request.setAttribute("result", "false");
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/registResult.jsp");
        dispatcher.forward(request, response);
    }
}
