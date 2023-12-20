<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録結果</title>
</head>
<body>
<h1>登録結果</h1>
<% String result = (String) request.getAttribute("result"); %>
<% if (result.equals("true")) { %>
<p>登録が正常に終了しました</p>
<a href="http://localhost:8080/gogo/">戻る</a>
<% } else { %>
<p>登録が失敗しました</p>
<a href="http://localhost:8080/gogo/">戻る</a>
<% } %>
</body>
</html>
