package sec04.ex03;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//DAO는 서블릿으로부터 호출당하고 VO의 데이터를 리스트로 저장하고 그 정보들을 서블릿에게 전달하는 역할을한다.
public class MemberDAO {
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/servletex";
	private static final String user = "root";
	private static final String pwd = "1234";
	private Connection con = null;
	private Statement stmt = null;
	
	public List<MemberVO> listMembers(){
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			connDB();
			String query = "select * from t_member";
			System.out.println(query);
			ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			String id = rs.getString("id");
			String pwd = rs.getString("pwd");
			String name = rs.getString("name");
			String email = rs.getString("email");
			Date joinDate = rs.getDate("joinDate");
			MemberVO vo = new MemberVO();
			vo.setID(id);
			vo.setPwd(pwd);
			vo.setName(name);
			vo.setEmail(email);
			vo.setJoinDate(joinDate);
			list.add(vo);
		}
		rs.close();
		stmt.close();
		con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	private void connDB() {
		try {
			Class.forName(driver);
			System.out.println("Mysql 드라이버 로딩 성공");
			con = DriverManager.getConnection(url,user,pwd);
			System.out.println("Connection 생성 성공");
			stmt = con.createStatement();
			System.out.println("Statement 생성 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
