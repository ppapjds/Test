<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
* {
	margin: 0;
	padding: 0;
	max-height: 1300px;
}

.menu a {
	text-decoration: none;
	color: white;
	padding: 0 20px;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<header style="background-color: blue; width: 100%; height: 15%;">
		<h1 style="color: white; text-align: center; padding-top: 50px;">쇼핑몰
			회원관리 ver1.0</h1>
	</header>

	<nav style="background-color: red; height: 5%;">
		<div class="menu">
			<a href="/member/insertUI.do"><strong>회원 가입</strong></a> 
			<a href="/member/list.do"><strong>회원목록 수정/삭제</strong></a> 
			<a href=""><strong>회원 매출 조회</strong></a> 
			<a href="/"><strong>홈으로</strong></a>
		</div>
	</nav>

	<section style="background-color: green; height: 800px">
		<h1 style="text-align: center;">쇼핑몰회원관리프로그램</h1>
	</section>

	<footer> </footer>

</body>
</html>