package com.chinasoft.sms.check.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class GetScoreAction extends ActionSupport {

	private List<String>  score;
	private String nextcheckor;
	private int j = 0;
	public String getNextcheckor() {
		return nextcheckor;
	}

	public void setNextcheckor(String nextcheckor) {
		this.nextcheckor = nextcheckor;
	}

	public String subCheck ()
	{
		
		for (int i = 0; i < score.size(); i++)
		{
			
			j = Integer.parseInt(score.get(i))+j;
			
		}
		System.out.println("您的总分为："+j);
		return SUCCESS;
		
	}

	public List<String> getScore() {
		return score;
	}


	public void setScore(List<String> score) {
		this.score = score;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
	
	
	


}
