package com.etc.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.util.List;
import java.util.ArrayList;

public class JavaDB_Util implements DBResource {

	private Connection conn = null;
	private Statement st = null; // ����״̬ͨ��ִ��sql
	private PreparedStatement ps = null; // ����Ԥͨ��ִ����Ӧ��sql
	private CallableStatement cs = null;
	public ResultSet rs = null;
	public static String dbtype;

	public JavaDB_Util() {

	}

	public JavaDB_Util(String dbtype) {
		this.dbtype = dbtype;
	}

	public void getConnection() {
		try {

			if (dbtype.equals("oracle")) {
				// 1�������������ݿ�������࣬������ͨ�����ʵ��
				Class.forName(dbdiver).newInstance();
				// 2���������������Ļ����Ͻ�������
				conn = DriverManager.getConnection(orclurl, orcluser,
						orclpassword);
				// Ϊ��ʵ����������ӵ�
				// conn.setAutoCommit(false);
			} else if (dbtype.equals("mysql")) {
				Class.forName(mysqldriver).newInstance();
				conn = DriverManager.getConnection(mysqlurl, mysqluser,
						mysqlpassword);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void getStatement() {
		try {
			if (conn == null || conn.isClosed()) {
				getConnection();
			}
			st = conn.createStatement();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	// ִ���˲�ѯ
	public ResultSet doQuery(String sql) {
		try {
			getStatement();
			rs = st.executeQuery(sql);
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			return rs;
		}
	}

	// ִ������,�޸�,ɾ��
	public boolean doInsert(String sql) {
		boolean isCorrect = false;
		try {
			getStatement();
			boolean is = st.execute(sql);
			isCorrect = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
			return isCorrect;
		}
	}

	// ͨ��Statement�е�executeִ�в�ѯ,�õ�һ�������
	public boolean doSelect(String sql) {
		boolean isCorrect = false;
		try {
			getStatement();
			boolean is = st.execute(sql);
			System.out.println("is:" + is);
			rs = st.getResultSet();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "---" + rs.getString(2)
						+ "----" + rs.getInt(3) + "---" + rs.getString(4));
			}
			isCorrect = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
			return isCorrect;
		}
	}

	// ִ��ɾ�����޸�
	public boolean doDeleteOrUpdate(String sql) {
		boolean isCorrect = false;
		try {
			getStatement();
			int num = st.executeUpdate(sql);
			isCorrect = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
			return isCorrect;
		}
	}
	//
	public String getOnevalue(String sql) {
		String value = "";
		try {
			getStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				value = rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
			return value;
		}
	}

	// select max(uid) from userinfo;
	public int getPk(String sql) {
		int pk = 0;
		try {
			rs = doQuery(sql);
			if (rs.next()) {
				pk = rs.getInt(1) + 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
			return pk;
		}
	}

	/**
	 * ��ߵĶ��ǻ���Ԥͨ��ִ��sql String sql="delete from dept where deptid=?";
	 */
	public void getPreparedStatement(String sql) {
		try {
			if (conn == null || conn.isClosed()) {
				getConnection();
			}
			ps = conn.prepareStatement(sql);
			ps.setString(1, "bb");
			// ps.setInt(2,20);
			ps.setString(2, "20");
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean getPreparedStatement(String sql, String[] str) {
		boolean isCorrect = false;
		try {
			if (conn == null || conn.isClosed()) {
				getConnection();
			}
			ps = conn.prepareStatement(sql);
			// ps.setString(1,"bb");
			// ps.setInt(2,20);
			// ps.setString(2,"20");
			for (int i = 0; i < str.length; i++) {
				ps.setString(i + 1, str[i]);
			}
			ps.executeUpdate();
			isCorrect = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
			return isCorrect;
		}
	}

	public ResultSet getPSselect(String sql, String[] str) {
		try {
			if (conn == null || conn.isClosed()) {
				getConnection();
			}
			ps = conn.prepareStatement(sql);
			for (int i = 0; i < str.length; i++) {
				ps.setString(i + 1, str[i]);
			}
			rs = ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return rs;
		}
	}

	/**
	 * ͨ��CallableStatement���ô洢����
	 */
	public void getCs(String Sql, String[] str) {
		// String sql="{call insertDept(?,?,?,?)}";
		try {
			if (conn == null || conn.isClosed())
				getConnection();
			cs = conn.prepareCall(Sql);
			for (int i = 0; i < str.length; i++) {
				cs.setString(i + 1, str[i]);
			}
			cs.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	// ������
	public boolean doBatch(List list) {
		boolean isCorrect = false;
		try {
			getStatement();
			for (int i = 0; i < list.size(); i++) {
				st.addBatch(list.get(i).toString());
			}
			int num[] = st.executeBatch();
			for (int i = 0; i < num.length; i++) {
				System.out.println(num[i]);
			}
			// conn.commit();
			isCorrect = true;
		} catch (Exception e) {
			// conn.rollback();
			e.printStackTrace();
		} finally {
			close();
			return isCorrect;
		}
	}

	// ͨ��һ����ѯ��sql�õ�һ�����ֶ�ֵ��List
	public List getColsList(String sql) {
		rs = doQuery(sql);
		List list = new ArrayList();
		try {
			int count = rs.getMetaData().getColumnCount();// һ����¼���ֶθ���
			while (rs.next()) {
				for (int i = 1; i <= count; i++) {
					list.add(rs.getString(i));
				}
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			close();
			return list;
		}
	}

	//
	public void close() {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static {
		// dbtype="oracle";
		dbtype = "mysql";

	}

}
