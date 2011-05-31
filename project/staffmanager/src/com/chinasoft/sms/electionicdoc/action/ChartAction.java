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
			dataset.setValue(userService.queryCountByMarried("T"),"4","已婚");
			dataset.setValue(userService.queryCountByMarried("F"),"5","未婚");
			chart = ChartFactory.createBarChart3D("婚否比例", "婚否", "人数", dataset,
							PlotOrientation.VERTICAL, true, true, true);
			chart.setTitle(new TextTitle("婚否比例", new Font("黑体", Font.ITALIC,
					22)));
			LegendTitle legend = chart.getLegend(0);
			legend.setItemFont(new Font(" 宋体", Font.BOLD, 14));
			CategoryPlot plot = (CategoryPlot) chart.getPlot();
			BarRenderer3D customBarRenderer = (BarRenderer3D) plot.getRenderer(); 
			customBarRenderer.setSeriesPaint(4, Color.decode("#0099CC")); // 给series5 Bar 
			customBarRenderer.setSeriesPaint(5, Color.decode("#FF3366")); 
			// 给series6 Bar 
			customBarRenderer.setSeriesOutlinePaint(4,Color.BLACK);//边框为黑色 
			customBarRenderer.setSeriesOutlinePaint(5,Color.BLACK); //边框为黑色
			CategoryAxis categorynAxis = plot.getDomainAxis();
			categorynAxis
					.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
			categorynAxis.setTickLabelFont(new Font("宋体", Font.PLAIN, 22));
			// 设置Y轴上的副标题
			categorynAxis.setLabelFont(new Font("宋体", Font.PLAIN, 18));
			// 设置Y轴上的文字
			NumberAxis numberAxis = (NumberAxis) chart.getCategoryPlot().getRangeAxis();
			numberAxis.setTickLabelFont(new Font("宋体", Font.PLAIN, 22));
			return chart;
		}
		
		else if ("2".equals(chartType)) {

			DefaultPieDataset dataset=new DefaultPieDataset();
			dataset.setValue("男",userService.queryCountBySex("男"));
			dataset.setValue("女",userService.queryCountBySex("女"));
		
			chart = ChartFactory.createPieChart3D("男女比例表", dataset, true, true,
					true);
			// chart=ChartFactory.createPieChart3D("图书销售统计表", defaultPieDataset,
			// true, false, false);
			chart.setTitle(new TextTitle("男女比例表", new Font("黑体", Font.ITALIC,
					22)));
			LegendTitle legend = chart.getLegend(0);
			legend.setItemFont(new Font(" 宋体", Font.BOLD, 14));
			PiePlot plot = (PiePlot) chart.getPlot();
			plot.setLabelGenerator(new StandardPieSectionLabelGenerator(
					StandardPieToolTipGenerator.DEFAULT_TOOLTIP_FORMAT));
			plot.setLabelFont(new Font("隶书", Font.BOLD, 18));
			plot.setBackgroundAlpha(0.9f);
			plot.setForegroundAlpha(0.50f);
		
			return chart;
		}
		else if("3".equals(chartType)){
			DefaultCategoryDataset dataset=new DefaultCategoryDataset();
			dataset.setValue(userService.queryCountByEducation("本科"),"0","本科");
			dataset.setValue(userService.queryCountByEducation("硕士"),"1","硕士");
			dataset.setValue(userService.queryCountByEducation("高中"),"2","高中");
			dataset.setValue(userService.queryCountByEducation("大专"),"3","大专");
			chart = ChartFactory.createBarChart3D("学历比例", "学历", "人数", dataset,
							PlotOrientation.VERTICAL, true, true, true);
			chart.setTitle(new TextTitle("学历比例", new Font("黑体", Font.ITALIC,
					22)));
			LegendTitle legend = chart.getLegend(0);
			legend.setItemFont(new Font(" 宋体", Font.BOLD, 14));
			CategoryPlot plot = (CategoryPlot) chart.getPlot();
			BarRenderer3D customBarRenderer = (BarRenderer3D) plot.getRenderer(); 
			customBarRenderer.setSeriesPaint(0, Color.decode("#24F4DB")); // 给series1 Bar 
			customBarRenderer.setSeriesPaint(1, Color.decode("#7979FF")); // 给series2 Bar 
			customBarRenderer.setSeriesPaint(2, Color.decode("#FF5555")); // 给series3 Bar 
			customBarRenderer.setSeriesPaint(3, Color.decode("#F8D661")); // 给series4 Bar 
			customBarRenderer.setSeriesPaint(4, Color.decode("#F284DC")); // 给series5 Bar 
			customBarRenderer.setSeriesPaint(5, Color.decode("#00BF00")); // 给series6 Bar 
			customBarRenderer.setSeriesOutlinePaint(0,Color.BLACK);//边框为黑色 
			customBarRenderer.setSeriesOutlinePaint(1,Color.BLACK);//边框为黑色 
			customBarRenderer.setSeriesOutlinePaint(2,Color.BLACK); //边框为黑色 
			customBarRenderer.setSeriesOutlinePaint(3,Color.BLACK);//边框为黑色 
			customBarRenderer.setSeriesOutlinePaint(4,Color.BLACK);//边框为黑色 
			customBarRenderer.setSeriesOutlinePaint(5,Color.BLACK); //边框为黑色


			plot.setBackgroundPaint(Color.white);

			//设置网格竖线颜色

			plot.setDomainGridlinePaint(Color.pink);

			//设置网格横线颜色

			plot.setRangeGridlinePaint(Color.pink);

			BarRenderer3D renderer = new BarRenderer3D();

			renderer.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BASELINE_LEFT));

			renderer.setItemLabelAnchorOffset(10D);

			//设置每个地区所包含的平行柱的之间距离

			//renderer.setItemMargin(0.3);

			plot.setRenderer(renderer);
			
			CategoryAxis categorynAxis = plot.getDomainAxis();
			categorynAxis
					.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
			categorynAxis.setTickLabelFont(new Font("宋体", Font.PLAIN, 22));
			// 设置Y轴上的副标题
			categorynAxis.setLabelFont(new Font("宋体", Font.PLAIN, 18));
			// 设置Y轴上的文字
			NumberAxis numberAxis = (NumberAxis) chart.getCategoryPlot().getRangeAxis();
			numberAxis.setTickLabelFont(new Font("宋体", Font.PLAIN, 22));
		
		}
		return chart;}
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}

		
	
