package com.etc.jdbc;

public interface DBResource {
  //������sqlserverʱ��Ҫ�ṩ����Դ
  public String dbdiver="com.microsoft.jdbc.sqlserver.SQLServerDriver";
  public String dburl="jdbc:microsoft:sqlserver://127.0.0.1:1433;DatabaseName=netoa";
  public String dbuser="sa";
  String password="123456";

  //������mysqlʱ��Ҫ�ṩ����Դ
  public String mysqldriver="org.gjt.mm.mysql.Driver";
  public String mysqlurl="jdbc:mysql://localhost:3306/etcguestbook?useUnicode=true&characterEncoding=gb2312";
  public String mysqluser="root";
  public String mysqlpassword="1234";

  //������oracleʱ��Ҫ�ṩ����Դ
  public String orcldriver="oracle.jdbc.driver.OracleDriver";
  public String orclurl="jdbc:oracle:thin:@172.16.4.25:1521:cfdb";
  public String orcluser="f1";
  public String orclpassword="f1";




  //public void run();
}
