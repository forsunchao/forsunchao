package com.chinasoft.sms.contract.dao;

import java.util.List;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.contract.pojo.Compactinfo;
/**
 * 
 * @author jinhua.yang
 *
 */




public interface ContractDAO {
	public boolean contractnew(Compactinfo compactinfo);
	public boolean contractmodify(Compactinfo compactinfo);
	public List<Compactinfo> contractquery(String searchType, String conditionValue);
	public List<Basicinfo> basicinfoquery(String conditionValue);
	public Compactinfo contractquery1(Long conditionValue);
	public boolean contracdelete(Long[] delcompactId);
}
