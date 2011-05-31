package com.chinasoft.sms.check.action;
import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

//��Ҫ��õ����Ϊperson�б�,position�б�,�Ծ��б�,��ʼ����ʱ�䣬�����ʱ�䣬�¸����ѡ������
public class ReadXML 
{
	private List <StaffFlowInfo> staffFlowList = null;
	
	public ReadXML()
	{
		staffFlowList = new LinkedList<StaffFlowInfo>();
	}
	public List<StaffFlowInfo> getStaffFlowList() {
		return staffFlowList;
	}

	public void setStaffFlowList(List<StaffFlowInfo> staffFlowList) {
		this.staffFlowList = staffFlowList;
	}
	
	public void readXML(String path) throws Exception
	{
	 SAXBuilder sb=new SAXBuilder();//��b������
	 Document doc = sb.build(new FileInputStream(path + "flow1.xml"));// ����ָ���ļ�
        Element root=doc.getRootElement();//��ø�ڵ�
        List list=root.getChildren(); //����ڵ��µ������ӽڵ����List��
       for(int i=0;i<list.size();i++)    
       {   
    	StaffFlowInfo sfi = new StaffFlowInfo();//������
        Element item = (Element)list.get(i);//ȡ�ýڵ�ʵ��
        sfi.setName(item.getAttribute("name").getValue());        //ȡ��name������ֵ
        sfi.setPosition(item.getAttribute("position").getValue());//ȡ��position������ֵ
       //listID.add( ( item.getAttribute("ID").getValue() ) );//ȡ������ֵ
        //String id = item.getAttribute("ID").getValue() ;
        //System.out.println("id-->"+listID.get(i));
        //System.out.println("id-->"+id);
        List shijuanList = item.getChildren();
        for (int j = 0; j < shijuanList.size(); j++)//����Ծ�ڵ�����
        {
           Element subitem=(Element)shijuanList.get(j);//ȡ�ýڵ���ӽڵ�ʵ��
           sfi.setId(subitem.getAttribute("ID").getValue());
           sfi.setStartdate(subitem.getAttribute("startdate").getValue());
           sfi.setEnddate(subitem.getAttribute("enddate").getValue());
            List departmentList = subitem.getChildren();
            for (int m = 0; m < departmentList.size(); m++ )//���department�ڵ�����
            {
            	Element subsubElement = ((Element)departmentList.get(m)).getChild("departmentM");
            	sfi.getCheckNameList().add(subsubElement.getText());
            }
        }
        staffFlowList.add(sfi);
        
        /*
        startdate = item.getAttribute("startdate").getValue();
        System.out.println("startdate-->"+startdate);
        enddate = item.getAttribute("enddate").getValue();
        System.out.println("enddate-->"+enddate);
       List subList = item.getChildren();
       for (int j = 0; j < subList.size(); j++)
       {
    	   Element subElement =  ( (Element) subList.get(j) ).getChild("departmentM");
    	   //item.getChild("flow").getChild("departmentM");
           String subText = subElement.getText();
           listNumber.add(subText);
           System.out.println("subText-->"+listNumber.get(j));
           //String subvalue = subElement.getAttribute("name").getValue();
           //System.out.println("subvalue-->"+subvalue); 
       }
       */
    }
	}
}