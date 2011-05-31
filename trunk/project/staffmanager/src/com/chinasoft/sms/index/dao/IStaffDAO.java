package com.chinasoft.sms.index.dao;

import java.util.List;

import com.chinasoft.sms.check.pojo.Basicinfo;

public interface IStaffDAO {
  public  List<String> query(Basicinfo  bi);
  public List<String> querystaffdate(Basicinfo  bi);
}
