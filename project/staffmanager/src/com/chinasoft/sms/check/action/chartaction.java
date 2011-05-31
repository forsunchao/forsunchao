package com.chinasoft.sms.check.action;

import org.apache.struts2.ServletActionContext;
import org.jfree.chart.JFreeChart;

import com.chinasoft.sms.check.service.chartService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.awt.Font;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
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
public class chartaction extends ActionSupport  {
	
	private chartService chartservice;

	
	
	private JFreeChart chart;
    
	
	public JFreeChart getChart() {
		return chart;
	}

	public void setChart(JFreeChart chart) {
     System.out.println("chart"+chart);
		this.chart = chart;
	}
	
	
	
	public JFreeChart getchart() throws SQLException {
		
			DefaultCategoryDataset dataset=new DefaultCategoryDataset();
			dataset.setValue(chartservice.queryBygrade("<20"),"0-20","人数");
			dataset.setValue(chartservice.queryBygrade("<40"),"20-40","人数");
			dataset.setValue(chartservice.queryBygrade("<60"),"40-60","人数");
			dataset.setValue(chartservice.queryBygrade("<80"),"60-80","人数");
			dataset.setValue(chartservice.queryBygrade("<=100"),"80-100","人数");
			chart = ChartFactory.createBarChart3D("考核结果", "是否合格", "人数", dataset,
							PlotOrientation.VERTICAL, true, true, true);
			chart.setTitle(new TextTitle("考核结果", new Font("黑体", Font.ITALIC,
					22)));
			LegendTitle legend = chart.getLegend(0);
			legend.setItemFont(new Font(" 宋体", Font.BOLD, 14));
			CategoryPlot plot = (CategoryPlot) chart.getPlot();
			CategoryAxis categorynAxis = plot.getDomainAxis();
			categorynAxis
					.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
			categorynAxis.setTickLabelFont(new Font("宋体", Font.PLAIN, 22));
		
			categorynAxis.setLabelFont(new Font("宋体", Font.PLAIN, 18));
		
			NumberAxis numberAxis = (NumberAxis) chart.getCategoryPlot().getRangeAxis();
			numberAxis.setTickLabelFont(new Font("宋体", Font.PLAIN, 22));
			return chart;
		}

	
	
	
	
	
	
	
	
	public chartService getChartservice() {
		return chartservice;
	}
	public void setChartservice(chartService chartservice) {
		this.chartservice = chartservice;
	}

}
