package org.sunchao.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.sunchao.DAO.PersonDao;
import org.sunchao.dbc.DataBaseConnection;
import org.sunchao.vo.Person;

public class PersonDaoImpl implements PersonDao {
	public boolean isLogin(Person person) {
		boolean flag = false;
		//完成具体的数据库验证
		String sql = "select name from person2 where name=? and password=?";
		DataBaseConnection dbc = new DataBaseConnection();//连接数据库
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		try{
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1,person.getName());
			pstmt.setString(2,person.getPassword());
			rs = pstmt.executeQuery();
//			System.out.println(sql);
			
			if(rs.next()) {//判断结果集
				flag = true;
				//person.setName(rs.getString(1));
				//person.setPassword(rs.getString(2));
			}
			rs.close();
			pstmt.close();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			dbc.close();
		}
		return flag;
	}
}
