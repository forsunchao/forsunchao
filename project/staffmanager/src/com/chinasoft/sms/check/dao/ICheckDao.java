package com.chinasoft.sms.check.dao;

import java.util.List;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Checkflowinfo;

/**
 * 
 * @author Administrator
 * ��������dao�ӿ�
 */
public interface ICheckDao {
  /**
   *  ��ѯ�����ѿ��˵���Ϣ
   * @return List<Basicinfo>
   */ 
	public  List<Basicinfo> queryACheckedByState(String state);
    /**
     * ����Ա����Ų�ѯ��Ա�����˽���
     * @param staffNub
     * @return
     */
	public  List<Object[]>  queryFlowinfoBystaffNub(String  staffNub);
}
