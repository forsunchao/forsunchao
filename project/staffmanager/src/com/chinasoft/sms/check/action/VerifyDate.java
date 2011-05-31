package com.chinasoft.sms.check.action;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class VerifyDate 
{   
	//private HttpServletRequest request;
	private List<StaffFlowInfo> linkedList ;
	
	public boolean verifyDate()
	{ 
		String startdate = null;
		String enddate = null;
		//ReadXML readXML = new ReadXML();
		try {
			//readXML.readXML(request.getRealPath("/")+"/WEB-INF/classes/");
			 startdate =	linkedList.get(1).getStartdate();
			 enddate = linkedList.get(1).getEnddate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  Calendar c = Calendar.getInstance();
	  c.setTimeInMillis(new Date().getTime());
	  //SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	  int time = Integer.parseInt(dateFormat.format(c.getTime()));
	  //int time = int(dateFormat.format(c.getTime()));
	    if ( time >= Integer.parseInt(startdate) && time <= Integer.parseInt(enddate) )
	    	return true;
	    else 
	    	return false;
	
	}
	//public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
	//	request=arg0;
	//}
	public List<StaffFlowInfo> getLinkedList() {
		return linkedList;
	}
	public void setLinkedList(List<StaffFlowInfo> linkedList) {
		this.linkedList = linkedList;
	}
}
