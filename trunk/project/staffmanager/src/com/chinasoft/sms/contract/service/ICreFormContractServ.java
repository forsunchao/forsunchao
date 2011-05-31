package com.chinasoft.sms.contract.service;

/**
 * 
 * @author Jian.Yao date 2010/09/27
 *
 */

public interface ICreFormContractServ 
{
	public String CreateFormalContract(Long compactId);
	public void writeContract(String strArray[],String conPath);
}
