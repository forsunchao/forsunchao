package com.chinasoft.sms.check.dao;

import java.util.List;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Checklibraryinfo;
import com.chinasoft.sms.check.pojo.Dynamicinfo;

public interface IDynamicinfoDAO 
{
   public boolean insertLibrarypaper(Dynamicinfo dyi);
   public List<Dynamicinfo> querycheckpaper(long dyid);
}
