package com.chinasoft.sms.contract.service;
import com.chinasoft.sms.contract.dao.ICreFormContractDao;
import com.chinasoft.util.Font;
import com.chinasoft.util.WordBean;
/**
 * 
 * @author Jian.Yao Date 10/09/27
 *
 */
public class CreFormContractServImpl implements ICreFormContractServ 
{
	private ICreFormContractDao cfcd;
	public ICreFormContractDao getCfcd() {
		return cfcd;
	}
	public void setCfcd(ICreFormContractDao cfcd) {
		this.cfcd = cfcd;
	}
	public String CreateFormalContract(Long compactId) 
	{
		//锟矫猴拷同签锟斤拷锟斤拷锟斤拷锟轿猅
		String flag=cfcd.setCompactState(compactId);
		//锟斤拷锟斤拷值为"true"锟斤拷"fail"
		return flag;
		
	}
	/**
	 * 
	 * @param strArray  鍚堝悓鍐呭
	 * @param conPath 鍚堝悓璺緞
	 */
	public void writeContract(String strArray[],String conPath) {

		try {
			WordBean wb = new WordBean(false);
			//
			wb.newDocument("con");
			// 
			wb.setFontBold(true);
			wb.setFontSize(16);
			// 
			wb.setParagraphAlign(3);
			//
			wb.insertOutline(strArray[0]);
			wb.setFontBold(false);
			wb.setParagraphAlign(3);
			wb.listIndent(2);
			wb.setFontSize(10);
			wb.setFontType(Font.CYAN);
			int length=strArray.length;
			for(int index=1;index<length;index++){
				wb.insertText(strArray[index]);
				wb.enter();
			}
			// 
			wb.enter();
			wb.saveFileAs(conPath);
			wb.close();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}


}
