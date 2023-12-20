<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
		<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="../css/loginRegist.css"> 
		<title>ログイン結果</title>
	</head>
<body>
	<h1>ログイン結果</h1>
	<% String result = (String) request.getAttribute("result"); %>
	<% if (result.equals("true")) { %>
		<!-- redirect(login); -->

	<div>
		<div><%= request.getParameter("userName") %>さん</div>
		<button onclick="location.href='Logout'">ログアウト</button>
	</div>
	<div class="titile">授業</div
	<div>
		<form action="" method="post">
			<input type="text"  name="makeSubject" placeholder="授業名" >
	
			<input type="hidden" name="makeUser" value='<%= request.getParameter("userName") %>'>
			<!--   -->
			<input type="submit" value="新規作成">
		</form>
	</div>
	<div class="subject">
	<!-- 授業欄 -->
		<p><% %></p><!-- 授業名を取得 -->
		<div class="work">
	<!-- 課題欄 -->
		<img href="">
		</div>
	</div>

	<% } else { %>
		<p>ログインに失敗しました</p>
		<a href="http://localhost:8080/gogo/login.jsp">戻る</a>
	<% } %>
	</body>
	<script src='../js/redirect.js'></script>
</html>
