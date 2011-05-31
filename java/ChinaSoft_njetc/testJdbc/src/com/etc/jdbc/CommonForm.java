package com.etc.jdbc;


public abstract class CommonForm{
  public String tablename="";
  public CommonForm() {
  }
  public abstract String[] getPrimary();
}
