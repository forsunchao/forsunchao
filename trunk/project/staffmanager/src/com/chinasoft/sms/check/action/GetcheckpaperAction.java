package com.chinasoft.sms.check.action;

import java.net.URLDecoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.chinasoft.sms.check.pojo.Basicinfo;
import com.chinasoft.sms.check.pojo.Checkflowinfo;
import com.chinasoft.sms.check.pojo.Checklibraryinfo;
import com.chinasoft.sms.check.pojo.Checkparticularresultinfo;
import com.chinasoft.sms.check.pojo.Checktableinfo;
import com.chinasoft.sms.check.pojo.Dynamicinfo;
import com.chinasoft.sms.check.service.ChecklibraryinfoService;
import com.chinasoft.sms.check.service.IDynamicinfoService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GetcheckpaperAction extends ActionSupport implements
		ServletRequestAware {
	private long paperid;
	private long id;
	private String nextcheckor;
	private String commitname;
	private String beizhu;
	private Long totalscore;
	private Long checkLib[];
	private IDynamicinfoService cliPaperService;
	private ChecklibraryinfoService checkservice;
	private List<Dynamicinfo> paperList;
	private List<String> checkperson;
	private String username;
	private long role;
	private long staffnum;
	private List<StaffFlowInfo> linkedList;
	private String state;
	private String step;
    private List<Checkflowinfo> checkResult;
	private HttpServletRequest request;
	private List<Checkflowinfo> steplist;

	public void setCheckResult(List<Checkflowinfo> checkResult) {
		this.checkResult = checkResult;
	}

	public List<Checkflowinfo> getSteplist() {
		return steplist;
	}

	public void setSteplist(List<Checkflowinfo> steplist) {
		this.steplist = steplist;
	}

	public void init() throws Exception {
		//System.out.println("hashCode=" + this.hashCode());
		ReadXML readXML = new ReadXML();
		readXML.readXML(request.getRealPath("/") + "/WEB-INF/classes/");
		// linkedList = new LinkedList<StaffFlowInfo>();
		linkedList = readXML.getStaffFlowList();
		Basicinfo object = (Basicinfo) request.getSession()
				.getAttribute("user");
		username = object.getName();
		role = object.getRole();
		staffnum = object.getStaffNumber();
		int size = linkedList.size();
		for (int i = 0; i < size; i++) {
			if (linkedList.get(i).getName().equals(username)) {
				int j = i;
				checkperson = linkedList.get(j).getCheckNameList();
				id = Long.parseLong(linkedList.get(j).getId());
				break;
			}
		}
		if(role == 1)
			step = "bb";
		else if(role == 4){
			step =  "cc";
		}
		request.getSession().setAttribute("id", id);
	
	}
	public String getcheckpaper() {
		int size = checkLib.length;
		for (int i = 0; i < size; i++) {
			Dynamicinfo Dyinfo = new Dynamicinfo();
			Checklibraryinfo checkinfo = new Checklibraryinfo();

			Dyinfo.setDynamicNumber(paperid);
			checkinfo.setChecklibraryId(checkLib[i]);
			Dyinfo.setChecklibraryinfo(checkinfo);
			cliPaperService.generalPaper(Dyinfo);
		}
		return SUCCESS;
	}

	public String getPaper() throws Exception {
		init();

		paperList = cliPaperService.getPaper(id);

		if (role == 3) {
			return "success1";
		} else if (role == 1) {
			return "success2";
		} else
			return INPUT;
	}

	public String verifyDate() throws Exception {
		init();
		VerifyDate vd = new VerifyDate();
		vd.setLinkedList(linkedList);
		if (!vd.verifyDate()) {
			return ERROR;
		} else if (checkservice.isCheck(username)) {
			return INPUT;
		} else {
			return SUCCESS;
		}

	}

	private List<String> score;

	public String subCheck() throws Exception {
		init();
		long j = 0;
		for (int i = 0; i < score.size(); i++) {
			if(role == 3){
			j = (long)((Integer.parseInt(score.get(i)) + j)*0.1);
		}
		 else if(role == 1) {
			j = (long)((Integer.parseInt(score.get(i)) + j)*0.4);	
			}
		}
		Checktableinfo checktableinfo = new Checktableinfo();
		Checkflowinfo checkflowinfo = new Checkflowinfo();
		checktableinfo.setIscheck("T");
		Basicinfo basicinfo = new Basicinfo();
		basicinfo.setStaffNumber(staffnum);
		checktableinfo.setBasicinfo(basicinfo);
		checktableinfo.setDynamicNumber(id);
	//checktableinfo.setChecktableGrade(Long.toString(j));
		checkflowinfo.setDynamicNumber(id);
		checkflowinfo.setCommiter(username);
		checkflowinfo.setAccepter(nextcheckor);
		checkflowinfo.setCheckflowGrade(Long.toString(j));
		checkflowinfo.setChecktableinfo(checktableinfo);
		checkflowinfo.setCheckflowState("1");
		if (role == 3 )
			checkflowinfo.setCheckflowStep("bb");
		else if (role == 1)
			checkflowinfo.setCheckflowStep("cc");
		    checkflowinfo.setRejectRemark(beizhu);
		    request.getSession().setAttribute("score",j);
		if (checkservice.insertCheck(checktableinfo, checkflowinfo))
			return SUCCESS;
		else
			return INPUT;
	}
	public String commitcheck() throws Exception {
		request.getSession().setAttribute("commitname", commitname);
		return SUCCESS;
	}
	public String subCheckto() throws Exception {
		init();
		//score = (long)((totalscore*0.3)+(Long)(request.getSession().getAttribute("score")));
		String commitname=URLDecoder.decode((String)request.getSession().getAttribute("commitname"), "UTF-8");
		//String bz=URLDecoder.decode(beizhu, "UTF-8");
		checkservice.updateCheck(commitname, beizhu, username,totalscore);
		
		Checktableinfo checktableinfo = new Checktableinfo();
		Checkflowinfo checkflowinfo = new Checkflowinfo();
		checktableinfo.setIscheck("T");
		Basicinfo basicinfo = new Basicinfo();
		basicinfo.setStaffNumber(staffnum);
		checktableinfo.setBasicinfo(basicinfo);
		checktableinfo.setDynamicNumber(id);
	    //checktableinfo.setChecktableGrade(Long.toString(score));
		checkflowinfo.setDynamicNumber(id);
		
		checkflowinfo.setCommiter(commitname);
		checkflowinfo.setAccepter(nextcheckor);
		checkflowinfo.setCheckflowGrade(Long.toString(totalscore));
		checkflowinfo.setChecktableinfo(checktableinfo);
		checkflowinfo.setCheckflowState("1");
		checkflowinfo.setCheckflowStep("cc");
		checkflowinfo.setRejectRemark(beizhu);
		//request.getSession().setAttribute("scoreto",score);
		if (checkservice.insertCheck(checktableinfo, checkflowinfo))
				return SUCCESS;
		else
				return INPUT;
	}		
	public String subChecktoo() throws Exception {
		init();
		long scoretoo;
		//scoretoo = (long)((totalscore*0.6)+(Long)(request.getSession().getAttribute("scoreto")));
		String commitname=URLDecoder.decode((String)request.getSession().getAttribute("commitname"), "UTF-8");
		checkservice.updateCheckto(commitname, beizhu,username, totalscore);
		return SUCCESS;
	}
	public String viewcheck() throws Exception {
		init();
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);
		//request.setAttribute("checkflowlist", cliService.queryACheckedByState(state));
			request.setAttribute("list", checkservice.viewCheck(username, state,step));
		if ("0".equals(state)) {
			return "aaCheck";
		} else if ("1".equals(state)) {
			return "nnCheck";
		} else {
			return "rejectCheck";
		}
	}
	/*public String vaildb() {
		if(checkservice.vaildb(commitname,nextcheckor))
		return SUCCESS;
		else 
			return INPUT;
	}*/
	public String checkResult () throws Exception {
		  checkResult = checkservice.checkresult();
		return SUCCESS;
	}
	public String personstep() throws Exception {
		init();
		steplist = checkservice.personstep(username);
		return SUCCESS;
	}
	public String checkstep() throws Exception{
		steplist = checkservice.checkstep();
        return SUCCESS;		
	}
	public List<String> getScore() {
		return score;
	}

	public void setScore(List<String> score) {
		this.score = score;
	}

	public IDynamicinfoService getCliPaperService() {
		return cliPaperService;
	}

	public void setCliPaperService(IDynamicinfoService cliPaperService) {
		this.cliPaperService = cliPaperService;
	}

	public long getPaperid() {
		return paperid;
	}

	public void setPaperid(long paperid) {
		this.paperid = paperid;
	}

	public List<Dynamicinfo> getPaperList() {
		return paperList;
	}

	public void setPaperList(List<Dynamicinfo> paperList) {
		this.paperList = paperList;
	}

	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}

	public List<String> getCheckperson() {
		return checkperson;
	}

	public void setCheckperson(List<String> checkperson) {
		this.checkperson = checkperson;
	}

	public ChecklibraryinfoService getCheckservice() {
		return checkservice;
	}

	public void setCheckservice(ChecklibraryinfoService checkservice) {
		this.checkservice = checkservice;
	}

	public List<StaffFlowInfo> getLinkedList() {
		return linkedList;
	}

	public void setLinkedList(List<StaffFlowInfo> linkedList) {
		this.linkedList = linkedList;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long[] getCheckLib() {
		return checkLib;
	}

	public void setCheckLib(Long[] checkLib) {
		this.checkLib = checkLib;
	}

	public String getNextcheckor() {
		return nextcheckor;
	}

	public void setNextcheckor(String nextcheckor) {
		this.nextcheckor = nextcheckor;
	}

	public String getBeizhu() {
		return beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getTotalscore() {
		return totalscore;
	}

	public void setTotalscore(Long totalscore) {
		this.totalscore = totalscore;
	}

	public String getCommitname() {
		return commitname;
	}

	public void setCommitname(String commitname) {
		this.commitname = commitname;
	}

	public List<Checkflowinfo> getCheckResult() {
		return checkResult;
	}

}
