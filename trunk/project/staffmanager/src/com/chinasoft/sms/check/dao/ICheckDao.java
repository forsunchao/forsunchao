package com.chinasoft.sms.check.dao;

import java.util.List;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Checkflowinfo;

/**
 * 
 * @author Administrator
 * 考核流程dao接口
 */
public interface ICheckDao {
  /**
   *  查询所有已考核的信息
   * @return List<Basicinfo>
   */ 
	public  List<Basicinfo> queryACheckedByState(String state);
    /**
     * 根据员工编号查询该员工考核进度
     * @param staffNub
     * @return
     */
	public  List<Object[]>  queryFlowinfoBystaffNub(String  staffNub);
}
