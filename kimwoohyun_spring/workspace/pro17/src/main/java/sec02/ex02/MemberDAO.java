package sec02.ex02;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
		private Connection con;
		private PreparedStatement pstmt;
		private DataSource dataFactory;
		
		public MemberDAO() {
			try {
				Context ctx=new InitialContext();
				Context envContext=(Context)ctx.lookup("java:/comp/env");
				dataFactory=(DataSource)envContext.lookup("jdbc/servletex");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		public List<MemberVO> listMembers() {
			List<MemberVO> membersList=new ArrayList();
			try {
				con=dataFactory.getConnection();
				String query = "select * from t_member order by joinDate desc";
				System.out.println(query);
				pstmt = con.prepareStatement(query);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next()) {
					String id=rs.getString("id");
					String pwd=rs.getString("pwd");
					String name=rs.getString("name");
					String email=rs.getString("email");
					Date joinDate=rs.getDate("joinDate");
					MemberVO memberVO=new MemberVO(id,pwd,name,email,joinDate);
					membersList.add(memberVO);
				   
				}
				rs.close();
				pstmt.close();
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return membersList;
		}
	  public void addMember(MemberVO m)
	  {
		  try {
			  con=dataFactory.getConnection();
			  String id=m.getId();
			  String pwd=m.getPwd();
			  String name=m.getName();
			  String email=m.getEmail();
			  String query="insert into t_member(id,pwd,name,email)" + "values(?, ?, ?, ?)";
			  System.out.println(query);
			  pstmt=con.prepareStatement(query);
			  pstmt.setString(1, id);
			  pstmt.setString(2, pwd);
			  pstmt.setString(3, name);
			  pstmt.setString(4, email);
			  pstmt.executeUpdate();
			  pstmt.close();
			  con.close();
		  }catch(SQLException e) {
			  e.printStackTrace();
		  }
	  }
	  public MemberVO findMember(String _id) {
		  MemberVO memInfo = null;
		  try {
			  con=dataFactory.getConnection();
			  String query="select * from t_member where id=?";
			  pstmt=con.prepareStatement(query);
			  pstmt.setString(1, _id);
			  System.out.println(query);
			  ResultSet rs=pstmt.executeQuery();
			  rs.next();
			  String id=rs.getString("id");
			  String pwd=rs.getString("pwd");
			  String name=rs.getString("name");
			  String email=rs.getString("email");
			  Date joinDate=rs.getDate("joinDate");
			  memInfo=new MemberVO(id,pwd,name,email,joinDate);
			  pstmt.close();
			  con.close();
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
		  return memInfo;
	  }
	  public void modMember(MemberVO memberVO) {
		  String id=memberVO.getId();
		  String pwd=memberVO.getPwd();
		  String name=memberVO.getName();
		  String email=memberVO.getEmail();
		  try {
			  con=dataFactory.getConnection();
			  String query="update t_member set pwd=?, name=?, email=? where id=?";
			  System.out.println(query);
			  pstmt=con.prepareStatement(query);
			  pstmt.setString(1, pwd);
			  pstmt.setString(2, name);
			  pstmt.setString(3, email);
			  pstmt.setString(4, id);
			  pstmt.executeUpdate();
			  pstmt.close();
			  con.close();
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
	  }
	  public void delMember(String id) {
		  try {
			  con=dataFactory.getConnection();
			  String query="delete from t_member where id=?";
			  System.out.println(query);
			  pstmt=con.prepareStatement(query);
			  pstmt.setString(1,id);      //1번째 인덱스의 ? 값 지정. 즉, id=? 의 ? 값 지정
			  pstmt.executeUpdate();
		  }catch(Exception e) {
			  e.printStackTrace();
		  }
	  }
	}