package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*@WebServlet("/member")*/   //작업을 완료하였으면 매핑부분을 주석처리 해야한다. 다음 작업시 충돌이 날 수 있음.
public class MemberServlet extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8"); //웹 출력이 가능하게함
		PrintWriter out = response.getWriter();
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.listMembers();
		
		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor=lightbrown>");
		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입날짜</td>");
		
		for (int i=0; i<list.size();i++) { //get메소드를 이용하여 정보들을 가져와서 웹 출력
			MemberVO memberVO=(MemberVO) list.get(i);
			String id = memberVO.getID();
			String pwd = memberVO.getPwd();
			String name = memberVO.getName();
			String email = memberVO.getEmail();
			Date joinDate = memberVO.getJoinDate();
			out.print("<tr><td>"+ id + "</td><td>"+pwd+"</td><td>"+name+"</td><td>"+email+"</td><td>"+joinDate+
			"</td></tr>");
		}
		out.print("</table></body></html>");
	}

}
