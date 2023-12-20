<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
<h1>ユーザー登録</h1>
<form action="Regist" method="post">
    ユーザー名: <input type="text" name="userName" required><br>
    パスワード: <input type="password" name="userPass" required><br>
    <input type="submit" value="登録">
    <a href="http://localhost:8080/gogo/index.jsp">戻る</a>
</form>
</body>
</html>
