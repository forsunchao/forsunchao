package com.chinasoft.sms.contract.action;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.general.PieDataset;

public class PieChartAction {
/**
* @param request
* @param session
* @param pw
* @return string
* @author huiyuan.wang
*/ 
public String generatePieChart(HttpServletRequest request, HttpSession session,  PrintWriter pw) {
String filename = null;
try{
ConnDbAction object = new ConnDbAction();
PieDataset data = object.readData();
PiePlot plot = new PiePlot(data); 

JFreeChart chart = new JFreeChart("",JFreeChart.DEFAULT_TITLE_FONT, plot, true);
//��ѡ������ͼƬ����ɫ
chart.setBackgroundPaint(java.awt.Color.white);
//��ѡ������ͼƬ����
chart.setTitle("Ա����нͳ�Ʊ���");
ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection());
//500��ͼƬ���ȣ�300��ͼƬ�߶�
filename = ServletUtilities.saveChartAsPNG(chart, 700, 500, info, session);
   ChartUtilities.writeImageMap(pw, filename, info,false);
   pw.flush();
}catch(Exception e) {
 System.out.println("Exception - " + e.toString());
 e.printStackTrace(System.out);
 filename = "public_error_700x500.png";
}
return filename;
}
}

