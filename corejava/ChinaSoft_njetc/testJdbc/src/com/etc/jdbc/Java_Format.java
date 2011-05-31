package com.etc.jdbc;

public class Java_Format {
  public Java_Format() {
  }
  public static String getMethodname(String fname,int type)
  {
    if(type==0)
    {
      return "set"+fname.substring(0,1).toUpperCase()+fname.substring(1);
    }else{
      return "get"+fname.substring(0,1).toUpperCase()+fname.substring(1);
    }
  }
}
