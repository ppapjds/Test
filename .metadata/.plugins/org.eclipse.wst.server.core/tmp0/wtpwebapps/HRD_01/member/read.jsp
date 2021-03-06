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

table, th, td {
	text-align: center;
	border: 1px solid black;
	margin: auto;
}
</style>

<script type="text/javascript">
	function sumbitFunction() {
		form = document.form;
		var inputs = form.querySelectorAll("input");
		var ths = form.querySelectorAll("th");
		
		for ( var index in inputs) {
			var th = ths[index];
			var input = inputs[index];
			if(input.type == "hidden"){ 
				input.value = input.value.replace(/[^0-9]g/,"");
			} 
			if (input.type != "text") {
				continue;
			}
			
			var value = input.value;
			var target = th.innerHTML;
			
			if (nullAndBlankCheck(value)) {
				alert(target + "의 값을 확인해 주세요.");
				input.focus();
				return;
			}
			
		}
		form.submit();
	}

	function nullAndBlankCheck(value) {
		return value === null || value === undefined || value === '';
	}
	
	function valueSet(self){
		if(nullAndBlankCheck(self.value) ){
			alert("값을 입력해 주세요.");
			self.focus();
			return;
		}
		
	/* 	var arr = self.value.split(/[0-9]/g);
		var alertText = "####-##-## 형식으로 입력해 주세요.";
		 
		if(arr.length > -1){
			for(var index in arr){
				console.log(arr[index]);  
				if(arr[index] != "-"){
					self.focus(); 
					alert(alertText); 
					self.value = "";
					return;
				}
			}
		}
		 */
		
		var value = self.value.replace(/[^0-9]/g,"");
		var form = document.form;
		var teg = form.querySelector("input[name='joindate']");
		teg.value = value;
		
	}
</script>
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
		<%
			Object obj = request.getAttribute("dto");
			if (obj instanceof MemberDTO) {
				MemberDTO dto = (MemberDTO) obj;
				String address = dto.getAddress().trim();
		%>
		<form action="/member/update.do" method="post" name="form">
			<table style="width: 50%">
				<tr>
					<th>회원번호</th>
					<td><input type="text" name="custno"
						value="<%=dto.getCustno()%>" readonly="readonly" /></td>
				</tr>
				<tr>
					<th>회원이름</th>
					<td><input type="text" name="custname"
						value="<%=dto.getCustname()%>" /></td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td><input type="text" name="phone"
						value="<%=dto.getPhone()%>" /></td>
				</tr>
				<tr>
					<th>주소</th>
					<td><input type="text" name="address" value="<%=address%>" /></td>
				</tr>
				<tr>
					<th>가입일자</th>
					<td><input type="text" name="date" onchange="valueSet(this)" value="<%=dto.getJoindate()%>"/>
						<input type = "hidden" name="joindate" value="<%=dto.getJoindate()%>"/>  
					</td>
				</tr> 
				<tr>
					<th>고객등급</th>
					<td><input type="text" name="grade"
						value="<%=dto.getGrade()%>" /></td>
				</tr>
				<tr>
					<th>거주지역</th>
					<td><input type="text" name="city" value="<%=dto.getCity()%>" /></td>
				</tr>
				<tr>
					<th colspan="2"><input type="button" value="수정"
						onclick="sumbitFunction()" /> <input type="button" value="조회"
						onclick="location.href='/member/list.do'" /></th>
				</tr>
			</table>
		</form>
		<%
			}
		%>

	</section>

	<footer> </footer>

</body>
</html>