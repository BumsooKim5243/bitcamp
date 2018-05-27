<%@page import="java.util.ArrayList"%>
<%@page import="jsp.Member"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam03</title>
</head>
<body>
<h1>JSP 전용 태그: useBean without 객체 생성</h1>
<pre>
저장소에서 값 꺼내기. 만약 그 아이디에 해당하는 값이 없다면 예외 발생!

</pre>

<%
Member obj = new Member();
obj.setId("홍길동");
obj.setEmail("hong@test.com");
obj.setPassword("1111");

Member obj2 = new Member();
obj2.setId("홍길동2");
obj2.setEmail("hon2g@test.com");
obj2.setPassword("111221");

ArrayList<Member> arr = new ArrayList<Member>();
arr.add(obj);
arr.add(obj2);

pageContext.setAttribute("list",arr);
%>
 
<h2>type 과 class 속성을 동시에 설정하기</h2>
<jsp:useBean id="list" 
			 type="java.util.List<Member>"
			 class="java.util.ArrayList"></jsp:useBean>

<%
for (Member member : list) {
%>
<%=member.getId() %>, <%=member.getEmail() %>, <%=member.getPassword() %><br>
<%}%>
</body>
</html>







