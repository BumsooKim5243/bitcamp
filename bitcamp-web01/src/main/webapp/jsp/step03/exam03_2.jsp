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
<h1>JSP 전용 태그: useBean</h1>
<pre>
jsp:useBean
- 태그를 이용하여 객체를 생성할 때 사용한다.
- 만약 객체가 없다면 해당 객체 생성할 수도 있다.

[문법] 
  jsp:useBean id="변수명" class="fully-qualified class name" scope="저장소"

scope
	객체를 꺼낼 저장소를 가리킨다.
	page      	=> PageContext 저장소 (기본값)
	request   	=> ServletRequest 저장소
	session   	=> HttpSession 저장소
	application => ServletContext 저장소

</pre>

<h2>PageContext에서 ArrayList 객체 꺼내기</h2>
<jsp:useBean id="list" class="java.util.ArrayList" scope="page"></jsp:useBean>
 <%=list.size() %>
 
<h2>Member 객체를 만들어 PageContext 에 보관하기 + 프로퍼티 값 설정하기</h2>

<jsp:useBean id="member" class="jsp.Member"></jsp:useBean>
<jsp:setProperty name="member"  property="id" value="홍길동"/>
<jsp:setProperty name="member"  property="email" value="hong@test.com"/>
<jsp:setProperty name="member"  property="password" value="1111"/>

아이디: <%=member.getId() %><br>
이메일: <%=member.getEmail() %><br>
암호: <%=member.getPassword() %><br>

 
</body>
</html>







