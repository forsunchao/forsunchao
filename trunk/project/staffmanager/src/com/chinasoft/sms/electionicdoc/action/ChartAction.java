package com.chinasoft.sms.electionicdoc.action;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.RectangleInsets;
import org.jfree.ui.TextAnchor;

import com.chinasoft.sms.electionicdoc.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ChartAction  extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1228393889L;
	private UserService userService;
	private JFreeChart chart;
    
	
	public JFreeChart getChart() {
		return chart;
	}

	public void setChart(JFreeChart chart) {
     System.out.println("chart"+chart);
		this.chart = chart;
	}

	public JFreeChart getchart() throws SQLException {
		ActionContext  ctx=ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);
		String chartType=request.getParameter("chartType");
		if ("1".equals(chartType)) {
			DefaultCategoryDataset dataset=new DefaultCategoryDataset();
			dataset.setValue(userService.queryCountByMarried("T"),"4","�ѻ�");
			dataset.setValue(userService.queryCountByMarried("F"),"5","δ��");
			chart = ChartFactory.createBarChart3D("������", "���", "����", dataset,
							PlotOrientation.VERTICAL, true, true, true);
			chart.setTitle(new TextTitle("������", new Font("����", Font.ITALIC,
					22)));
			LegendTitle legend = chart.getLegend(0);
			legend.setItemFont(new Font(" ����", Font.BOLD, 14));
			CategoryPlot plot = (CategoryPlot) chart.getPlot();
			BarRenderer3D customBarRenderer = (BarRenderer3D) plot.getRenderer(); 
			customBarRenderer.setSeriesPaint(4, Color.decode("#0099CC")); // ��series5 Bar 
			customBarRenderer.setSeriesPaint(5, Color.decode("#FF3366")); 
			// ��series6 Bar 
			customBarRenderer.setSeriesOutlinePaint(4,Color.BLACK);//�߿�Ϊ��ɫ 
			customBarRenderer.setSeriesOutlinePaint(5,Color.BLACK); //�߿�Ϊ��ɫ
			CategoryAxis categorynAxis = plot.getDomainAxis();
			categorynAxis
					.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
			categorynAxis.setTickLabelFont(new Font("����", Font.PLAIN, 22));
			// ����Y���ϵĸ�����
			categorynAxis.setLabelFont(new Font("����", Font.PLAIN, 18));
			// ����Y���ϵ�����
			NumberAxis numberAxis = (NumberAxis) chart.getCategoryPlot().getRangeAxis();
			numberAxis.setTickLabelFont(new Font("����", Font.PLAIN, 22));
			return chart;
		}
		
		else if ("2".equals(chartType)) {

			DefaultPieDataset dataset=new DefaultPieDataset();
			dataset.setValue("��",userService.queryCountBySex("��"));
			dataset.setValue("Ů",userService.queryCountBySex("Ů"));
		
			chart = ChartFactory.createPieChart3D("��Ů������", dataset, true, true,
					true);
			// chart=ChartFactory.createPieChart3D("ͼ������ͳ�Ʊ�", defaultPieDataset,
			// true, false, false);
			chart.setTitle(new TextTitle("��Ů������", new Font("����", Font.ITALIC,
					22)));
			LegendTitle legend = chart.getLegend(0);
			legend.setItemFont(new Font(" ����", Font.BOLD, 14));
			PiePlot plot = (PiePlot) chart.getPlot();
			plot.setLabelGenerator(new StandardPieSectionLabelGenerator(
					StandardPieToolTipGenerator.DEFAULT_TOOLTIP_FORMAT));
			plot.setLabelFont(new Font("����", Font.BOLD, 18));
			plot.setBackgroundAlpha(0.9f);
			plot.setForegroundAlpha(0.50f);
		
			return chart;
		}
		else if("3".equals(chartType)){
			DefaultCategoryDataset dataset=new DefaultCategoryDataset();
			dataset.setValue(userService.queryCountByEducation("����"),"0","����");
			dataset.setValue(userService.queryCountByEducation("˶ʿ"),"1","˶ʿ");
			dataset.setValue(userService.queryCountByEducation("����"),"2","����");
			dataset.setValue(userService.queryCountByEducation("��ר"),"3","��ר");
			chart = ChartFactory.createBarChart3D("ѧ������", "ѧ��", "����", dataset,
							PlotOrientation.VERTICAL, true, true, true);
			chart.setTitle(new TextTitle("ѧ������", new Font("����", Font.ITALIC,
					22)));
			LegendTitle legend = chart.getLegend(0);
			legend.setItemFont(new Font(" ����", Font.BOLD, 14));
			CategoryPlot plot = (CategoryPlot) chart.getPlot();
			BarRenderer3D customBarRenderer = (BarRenderer3D) plot.getRenderer(); 
			customBarRenderer.setSeriesPaint(0, Color.decode("#24F4DB")); // ��series1 Bar 
			customBarRenderer.setSeriesPaint(1, Color.decode("#7979FF")); // ��series2 Bar 
			customBarRenderer.setSeriesPaint(2, Color.decode("#FF5555")); // ��series3 Bar 
			customBarRenderer.setSeriesPaint(3, Color.decode("#F8D661")); // ��series4 Bar 
			customBarRenderer.setSeriesPaint(4, Color.decode("#F284DC")); // ��series5 Bar 
			customBarRenderer.setSeriesPaint(5, Color.decode("#00BF00")); // ��series6 Bar 
			customBarRenderer.setSeriesOutlinePaint(0,Color.BLACK);//�߿�Ϊ��ɫ 
			customBarRenderer.setSeriesOutlinePaint(1,Color.BLACK);//�߿�Ϊ��ɫ 
			customBarRenderer.setSeriesOutlinePaint(2,Color.BLACK); //�߿�Ϊ��ɫ 
			customBarRenderer.setSeriesOutlinePaint(3,Color.BLACK);//�߿�Ϊ��ɫ 
			customBarRenderer.setSeriesOutlinePaint(4,Color.BLACK);//�߿�Ϊ��ɫ 
			customBarRenderer.setSeriesOutlinePaint(5,Color.BLACK); //�߿�Ϊ��ɫ


			plot.setBackgroundPaint(Color.white);

			//��������������ɫ

			plot.setDomainGridlinePaint(Color.pink);

			//�������������ɫ

			plot.setRangeGridlinePaint(Color.pink);

			BarRenderer3D renderer = new BarRenderer3D();

			renderer.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BASELINE_LEFT));

			renderer.setItemLabelAnchorOffset(10D);

			//����ÿ��������������ƽ������֮�����

			//renderer.setItemMargin(0.3);

			plot.setRenderer(renderer);
			
			CategoryAxis categorynAxis = plot.getDomainAxis();
			categorynAxis
					.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
			categorynAxis.setTickLabelFont(new Font("����", Font.PLAIN, 22));
			// ����Y���ϵĸ�����
			categorynAxis.setLabelFont(new Font("����", Font.PLAIN, 18));
			// ����Y���ϵ�����
			NumberAxis numberAxis = (NumberAxis) chart.getCategoryPlot().getRangeAxis();
			numberAxis.setTickLabelFont(new Font("����", Font.PLAIN, 22));
		
		}
		return chart;}
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}

		
	
