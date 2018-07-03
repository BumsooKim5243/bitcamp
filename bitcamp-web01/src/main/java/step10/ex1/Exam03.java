// 쿠키 : 한글 데이터 보내
package step10.ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step10/ex1/exam03")
public class Exam03 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 쿠키 데이터의 조건:
		// => 문자열만 가능하다.
		// => 응답 헤더로 보내기 때문에 반드시 URL 인코딩 해야 한다.
		// => Tomcat 9에서는 한글 데이터를 보내고 받을 수 있다.
		//    만약 Tomcat 8 이하 버전이나 다른 서블릿 컨테이너를 사용하면
		//    한글이 깨질 수 있다.
		//    그럴 경우에는 URL 인코딩 하여 보내라!
		
		Cookie cookie1 = new Cookie("c1", URLEncoder.encode("홍길동", "UTF-8"));
		Cookie cookie2 = new Cookie("c2", URLEncoder.encode("임꺽정", "UTF-8"));
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		response.setContentType("text/plain;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("쿠키를 보냈습니다.");

// 쿠키란?
// => 웹서버에서 데이터를 보내 웹브라우저에 저장하는 것
// => 웹브라우저는 웹서버로부터 받은 데이터를 보관하고 있다가
//    웹서버에 요청할 때마다 다시 보낸다.
// 	  예) 쿠폰
//
// 쿠키를 클라이언트로 보내는 HTTP 프로토콜?
//		HTTP/1.1 200
//		Set-Cookie: c1=aaa
//		Set-Cookie: c2=123
//		Content-Type: text/plain;charset=UTF-8
//		Content-Length: 27
//		Date: Wed, 23 May 2018 01:18:16 GMT
		
	}
	
}