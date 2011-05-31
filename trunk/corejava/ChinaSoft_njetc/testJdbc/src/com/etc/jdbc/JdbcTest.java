package com.etc.jdbc;

import java.util.List;

public class JdbcTest {
	 public static void main(String arg[])
	 {
		 JavaDB_Util db=new JavaDB_Util();
		 JdbcTest jt=new JdbcTest();
		// jt.doQuery();

		 
	 }
	 ///
	 public static void doQuery()
	 {
		 JavaDB_Util db=new JavaDB_Util();
		 List ls=db.getColsList("SELECT * FROM guestbook g");
		 for(int i=0;i<ls.size();i++){
			 System.out.println(":"+ls.get(i));
		 }
		 
	 }
}
