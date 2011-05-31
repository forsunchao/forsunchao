package com.chinasoft.sms.check.dao;

import java.util.List;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Checkflowinfo;
import com.chinasoft.sms.check.pojo.Checklibraryinfo;

public interface ICheckLibraryinfoDAO
{
  public boolean addCheckLibraryinfo(Checklibraryinfo cli);
  public boolean deleteCheckLibraryinfo (long id);
  public Checklibraryinfo findByID (long id);
  public List<Checklibraryinfo> getAll();
  public Checklibraryinfo updateCheckLibraryinfoByObject(long id,String content);
  public List<Basicinfo> queryACheckedByState(String state) ;
}
