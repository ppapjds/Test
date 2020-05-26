<%@page import="com.hrd.member.domain.MemberDTO"%>
<%@page import="java.util.List"%>
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

table,th,td{
	text-align: center;
	border:  1px solid black;
	margin: auto;
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
			<a href="/member/insertUI.do"><strong>회원 가입</strong></a> <a
				href="/member/list.do"><strong>회원목록 수정/삭제</strong></a> <a href=""><strong>회원
					매출 조회</strong></a> <a href="/"><strong>홈으로</strong></a>
		</div>
	</nav>

	<section style="background-color: green; height: 800px">
		<h1 style="padding: 10px; text-align: center;">회원목록조회/수정</h1>
		<table>
			<thead>
				<tr>
					<th>회원번호</th>
					<th>회원이름</th>
					<th>전화번호</th>
					<th>주소</th>
					<th>가입일자</th>
					<th>고객등급</th>
					<th>거주지역</th>
				</tr>
			</thead>
			<tbody>
		<%
			List list = (List) request.getAttribute("list");
			for (Object obj : list) {
				MemberDTO dto = null;
				if (obj instanceof MemberDTO) {
					dto = (MemberDTO) obj;
					String url = "/member/read.do?custno="+dto.getCustno();
		%>
			<tr>
				<td><a href=<%=url  %>><%=dto.getCustno() %></a></td>
				<td><%=dto.getCustname() %></td>
				<td><%=dto.getPhone() %></td>
				<td><%=dto.getAddress() %></td>
				<td><%=dto.getJoindate() %></td>
				<td><%=dto.getGrade() %></td>
				<td><%=dto.getCity() %></td>
			</tr> 
		<%}else{
		%>
			<tr>
				<td colspan="7">등록된 회원이 존재하지 않습니다.</td>
			</tr>
		<%
			}}
		%>
			</tbody>
		</table>
	</section>

	<footer> </footer>

</body>
</html>