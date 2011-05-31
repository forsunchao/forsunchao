package com.chinasoft.sms.check.service;

import java.util.List;

import com.chinasoft.sms.check.pojo.Dynamicinfo;

public interface IDynamicinfoService 
{
  public boolean generalPaper(Dynamicinfo dyi);
  public List<Dynamicinfo> getPaper(long dyid);
}
