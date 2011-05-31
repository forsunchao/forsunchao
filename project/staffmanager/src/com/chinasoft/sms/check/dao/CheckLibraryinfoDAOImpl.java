package com.chinasoft.sms.check.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Checklibraryinfo;
import com.chinasoft.sms.check.pojo.Dynamicinfo;

public class CheckLibraryinfoDAOImpl extends HibernateDaoSupport implements ICheckLibraryinfoDAO{

	public boolean addCheckLibraryinfo(Checklibraryinfo cli) //�����Ϣ
	{
	
			this.getHibernateTemplate().saveOrUpdate(cli);  
		    return true;
	}

	public boolean deleteCheckLibraryinfo(long id) //���IDɾ����Ϣ
	{
		//Object p = getHibernateTemplate().load(Checklibraryinfo.class, new Long(id));
		Checklibraryinfo p =new Checklibraryinfo();
		p.setChecklibraryId(id);
        //ɾ���ض�ʵ��
       this.getHibernateTemplate().delete(p);
       return true;
	}
   
	public List<Checklibraryinfo> getAll() //����������
	{
		
		String sql = "from Checklibraryinfo c order by  c.checklibraryId";
		return this.getHibernateTemplate().find(sql);
		
	}

	public Checklibraryinfo findByID(long id) //���ID��ѯ���
	{
		String sql = "from Checklibraryinfo order by checklibraryId where  checklibraryId = ";
		List <Checklibraryinfo> list = this.getHibernateTemplate().find(sql+id);
		return list.get(0);
		
	}
	public List<Basicinfo> queryACheckedByState(String state) {
        String  hql="SELECT bi FROM Basicinfo bi ,Checkflowinfo cf WHERE bi.staffNumber=cf.checktableinfo.basicinfo.staffNumber and cf.checkflowState='"+state+"'";
        List<Basicinfo> list=this.getHibernateTemplate().find(hql);
        //System.out.println(list.get(0).getDepartmentinfo().getDepartmentName());
        return list;
	}
	public Checklibraryinfo updateCheckLibraryinfoByObject(long id,String content) 
	{
		 Checklibraryinfo cli = new  Checklibraryinfo();
		 cli.setChecklibraryId(id);
		 cli.setChecklibraryContent(content);
		 this.getHibernateTemplate().update(cli);
		return cli;
	}
	  public Dynamicinfo Getcheckpaper()
	  {    
		   Dynamicinfo dynifo = new Dynamicinfo();
		   return (Dynamicinfo) this.getHibernateTemplate().save(dynifo);
	  }

}
