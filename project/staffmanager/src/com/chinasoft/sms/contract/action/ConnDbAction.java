package com.chinasoft.sms.contract.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jfree.data.general.PieDataset;
import org.jfree.data.jdbc.JDBCPieDataset;
/**

 * 
 * @author huiyuan.wang
 */
public class ConnDbAction {
public PieDataset readData() {
JDBCPieDataset data = null;
String url = "jdbc:oracle:thin:@172.16.60.2:1521:njetc";
Connection con;
try {
Class.forName("oracle.jdbc.OracleDriver");
}
catch (ClassNotFoundException e) {
System.err.print("ClassNotFoundException:");
System.err.println(e.getMessage());
}
try {
con = DriverManager.getConnection(url, "staffmanager", "manager");
data = new JDBCPieDataset(con);
String sql = "SELECT NAME,SALARY FROM COMPACTINFO,BASICINFO where COMPACTINFO.STAFF_NUMBER=BASICINFO.STAFF_NUMBER ";
data.executeQuery(sql);
con.close();
}
catch (SQLException e) {
System.err.print("SQLException: ");
System.err.println(e.getMessage());
}
catch (Exception e) {
System.err.print("Exception: ");
System.err.println(e.getMessage());
}
return data;
}

}
