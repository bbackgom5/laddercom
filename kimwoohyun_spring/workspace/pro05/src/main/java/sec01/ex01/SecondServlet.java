package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Second")
public class SecondServlet extends HttpServlet {
	

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("SecondServlet init �޼��� ȣ�� >>>> ");
	}

	
	public void destroy() {
		System.out.println("SecondServlet destroy �޼��� ȣ�� >>>> ");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SecondServlet doGet �޼��� ȣ�� >>>> ");
	}

}
