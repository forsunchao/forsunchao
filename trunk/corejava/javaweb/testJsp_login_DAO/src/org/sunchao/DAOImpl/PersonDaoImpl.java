package org.sunchao.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.sunchao.DAO.PersonDao;
import org.sunchao.dbc.DataBaseConnection;
import org.sunchao.vo.Person;

public class PersonDaoImpl implements PersonDao {
	public boolean isLogin(Person person) {
		boolean flag = false;
		//��ɾ�������ݿ���֤
		String sql = "select name from person2 where name=? and password=?";
		DataBaseConnection dbc = new DataBaseConnection();//�������ݿ�
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		try{
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1,person.getName());
			pstmt.setString(2,person.getPassword());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {//�жϽ����
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
