package com.chinasoft.util;

import java.io.File;
import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.ComFailException;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

/**
 * 
 * @author Administrator java操作word
 */
public final class WordBean {

	/**
	 * 读取Com接口异常的最多重试次数.
	 */
	private static final int MAX_RETRY = 10;
	/**
	 * word文档.
	 */
	private Dispatch doc;
	/**
	 * word运行程序对象.
	 */
	private ActiveXComponent wordApp = null;
	/**
	 * 选定的范围或插入点.
	 */
	private Dispatch selection;
	/**
	 * 退出时是否保存文档.
	 */
	private boolean saveOnExit = true;

	/**
	 * 字体
	 */
	private Dispatch font;
	/**
	 * 段落
	 */
	private Dispatch paragraphFormat;

	/**
	 * 构造函数.
	 * 
	 * @param show
	 *            是否可见.
	 */
	public WordBean(final boolean show) {
		if (wordApp == null) {
			wordApp = new ActiveXComponent("Word.Application");
			wordApp.setProperty("Visible", new Variant(show));
		}
	}

	/**
	 * 
	 * 初始化字体格式
	 * 
	 */
	private void initFontFormat() {
		font = Dispatch.get(selection, "Font").toDispatch();
		// 字型格式化需要的对象
		Dispatch.put(font, "size", 20); // 默认设置字体大小20
		Dispatch.put(font, "Bold", false); // 默认非粗体(true:粗体 false:非粗体)
		Dispatch.put(font, "name", "宋体"); // 默认字型类型为宋体
		Dispatch.put(font, "Italic", false); // 默认非斜体 true:斜体 false:非斜体
		Dispatch.put(font, "Underline", false); // 默认没有下划线true:下滑线 false:没有下划线
		Dispatch.put(font, "Color", Font.BLACK); // 默认字体颜色
	}

	/**
	 * 将字体还原成默认值
	 */
	public void revertFontFormat() {
		Dispatch.put(font, "size", 20);
		Dispatch.put(font, "Bold", false);
		Dispatch.put(font, "name", "宋体");
		Dispatch.put(font, "Italic", false);
		Dispatch.put(font, "Underline", false);
		Dispatch.put(font, "Color", Font.BLACK);
	}

	/**
	 * 设置字体大小
	 * 
	 * @param size
	 */
	public void setFontSize(int size) {
		Dispatch.put(font, "size", size);
	}

	/**
	 * 设置字体类型
	 * 
	 * @param type
	 */
	public void setFontType(String type) {
		Dispatch.put(font, "name", type);
	}

	/**
	 * 设置字体颜色
	 * 
	 * @param color
	 */
	public void setFontColor(String color) {
		Dispatch.put(font, "Color", color);

	}

	/**
	 * 设置字体是否为粗体true:粗体 false:不是粗体
	 * 
	 * @param bold
	 */
	public void setFontBold(boolean isbold) {
		Dispatch.put(font, "Bold", isbold);

	}

	/**
	 * 设置字体是否有下划线true:有 false:没有
	 * 
	 * @param isItalic
	 */
	public void setFontUnderline(boolean isUnderline) {
		Dispatch.put(font, "Underline", isUnderline);

	}

	/**
	 * 设置字体是否为斜体true:斜体 false:不是斜体
	 * 
	 * @param isItalic
	 */
	public void setFontItalic(boolean isItalic) {
		Dispatch.put(font, "Italic", isItalic);

	}

	/**
	 * 初始化段落格式
	 */
	private void initParagraphFormat() {
		paragraphFormat = Dispatch.get(selection, "ParagraphFormat")
				.toDispatch();
		Dispatch.put(paragraphFormat, "Alignment", 3); // 默认左对齐 1:置中 2:靠右
		// 3:靠左
	}
    /**
     * 设置段落对齐格式
     * @param align
     */
	public void setParagraphAlign(int align) {
		Dispatch.put(paragraphFormat, "Alignment", align);

	}

	/**
	 * 设置退出时参数.
	 * 
	 * @param b boolean true-退出时保存文件，false-退出时不保存文件
	 */
	public void setSaveOnExit(final boolean b) {
		this.saveOnExit = b;
	}

	/**
	 * 把选定的内容或插入点向上移动.
	 * 
	 * @param pos
	 *            移动的距离
	 */
	public void moveUp(final int pos) {

		if (selection == null) {
			selection = Dispatch.get(wordApp, "Selection").toDispatch();
		}

		for (int i = 0; i < pos; i++) {
			Dispatch.call(selection, "MoveUp");
		}
	}

	/**
	 * 把选定的内容或者插入点向下移动.
	 * 
	 * @param pos移动的距离
	 */
	public void moveDown(final int pos) {

		if (selection == null) {
			selection = Dispatch.get(wordApp, "Selection").toDispatch();
		}

		for (int i = 0; i < pos; i++) {
			Dispatch.call(selection, "MoveDown");
		}
	}

	/**
	 * 把选定的内容或者插入点向左移动.
	 * 
	 * @param pos
	 *            移动的距离
	 */
	public void moveLeft(final int pos) {

		if (selection == null) {
			selection = Dispatch.get(wordApp, "Selection").toDispatch();
		}

		for (int i = 0; i < pos; i++) {
			Dispatch.call(selection, "MoveLeft");
		}
	}

	/**
	 * 把选定的内容或者插入点向右移动.
	 * 
	 * @param pos
	 *            移动的距离
	 */
	public void moveRight(final int pos) {

		if (selection == null) {
			selection = Dispatch.get(wordApp, "Selection").toDispatch();
		}

		for (int i = 0; i < pos; i++) {
			Dispatch.call(selection, "MoveRight");
		}
	}

	/**
	 * 把插入点移动到文件首位置.
	 */
	public void moveStart() {
		if (selection == null) {
			selection = Dispatch.get(wordApp, "Selection").toDispatch();
		}

		Dispatch.call(selection, "HomeKey", new Variant(6));
	}

	/**
	 * 把插入点移动到文件尾位置.
	 */
	public void moveEnd() {
		if (selection == null) {
			selection = Dispatch.get(wordApp, "Selection").toDispatch();
		}

		Dispatch.call(selection, "EndKey", new Variant(6));
	}

	/**
	 * 增加缩进.
	 * 
	 * @param pos缩进量
	 */
	public void listIndent(final int pos) {

		Dispatch range = Dispatch.get(this.selection, "Range").toDispatch();
		Dispatch listFormat = Dispatch.get(range, "ListFormat").toDispatch();
		for (int i = 0; i < pos; i++) {
			Dispatch.call(listFormat, "ListIndent");
		}
	}

	/**
	 * 减少缩进.
	 * 
	 * @param pos缩进量
	 */
	public void listOutdent(final int pos) {

		Dispatch range = Dispatch.get(this.selection, "Range").toDispatch();
		Dispatch listFormat = Dispatch.get(range, "ListFormat").toDispatch();
		for (int i = 0; i < pos; i++) {
			Dispatch.call(listFormat, "ListOutdent");
		}
	}

	/**
	 * 回车换行.
	 */
	public void enter() {
		int index = 1;
		while (true) {
			try {
				Dispatch.call(this.selection, "TypeParagraph");
				break;
			} catch (ComFailException e) {
				if (index++ >= MAX_RETRY) {
					throw e;
				} else {
					continue;
				}
			}
		}
	}

	/**
	 * 插入一个换页符.
	 */
	public void insertPageBreak() {
		Dispatch.call(this.selection, "InsertBreak", new Variant(2));
	}

	/**
	 * 设置word文档是否可见.
	 * 
	 * @param isVisible是否可见
	 */
	public void setIsVisible(final boolean isVisible) {

		wordApp.setProperty("Visible", new Variant(isVisible));
	}

	/**
	 * 判断文档是否存在.
	 * 
	 * @param docName
	 *            文档名称.
	 * @return boolean 是否存在.
	 */
	private boolean isExist(final String docName) {

		boolean result = false;
		File file = new File(docName);
		result = file.exists();
		file = null;
		return result;
	}

	/**
	 * 获取文件名称.
	 * 
	 * @param docName
	 *            文档路径.
	 * @return 文件名称
	 */
	public String getFileName(final String docName) {

		int pos = docName.lastIndexOf("\\");
		return docName.substring(pos + 1);
	}

	/**
	 * 打开文档.
	 * 
	 * @param docName
	 *            文档路径.
	 * @throws WordException异常
	 */
	public void openDocument(final String docName) throws WordException {

		Dispatch docs = wordApp.getProperty("Documents").toDispatch();

		if (isExist(docName)) {
			this.closeDocument();
			doc = Dispatch.call(docs, "Open", docName).toDispatch();
		} else {
			wordApp.invoke("Quit", new Variant[] {});
			new WordException("[Open doc failed]: file[" + docName
					+ "] isn't existed!");
		}

		selection = Dispatch.get(wordApp, "Selection").toDispatch();
		// 配置默认字体
		initFontFormat();
		// 默认段落格式
		initParagraphFormat();
	}

	/**
	 * 添加一个新文档.
	 * 
	 * @param docName
	 *            文档路径.
	 * @throws WordException
	 *             异常
	 */
	public void newDocument(final String docName) throws WordException {

		try {
			Dispatch docs = wordApp.getProperty("Documents").toDispatch();
			doc = Dispatch.call(docs, "Add").toDispatch();
			selection = Dispatch.get(wordApp, "Selection").toDispatch();
			// 配置默认字体
			initFontFormat();
			// 默认段落格式
			initParagraphFormat();
		} catch (com.jacob.com.ComFailException cfe) {
			throw new WordException(cfe.getMessage());
		} catch (com.jacob.com.ComException ce) {
			throw new WordException(ce.getMessage());
		}
	}

	/**
	 * 插入一段文字.
	 * 
	 * @param textToInsert 文字
	 *
	 */
	public void insertText(final String textToInsert) {
		Dispatch.put(selection, "Text", textToInsert);
		Dispatch.call(selection, "MoveRight");
		
	}

	/**
	 * 插入一个图片.
	 * 
	 * @param imagePath
	 *            图片路径.
	 *
	 */
	public void insertImage(final String imagePath) {

		Dispatch.call(Dispatch.get(selection, "InLineShapes").toDispatch(),
				"AddPicture", imagePath);
         Dispatch.call(selection, "MoveRight");
		this.enter();
	}

	/**
	 * 获取对应名称的Style对象.
	 * 
	 * @param style
	 *            Style名称.
	 * @return Style对象
	 */
	public Variant getOutlineStyle(final String style) {
		int index = 1;
		while (true) {
			try {
				return Dispatch.call(Dispatch.get(this.doc, "Styles")
						.toDispatch(), "Item", new Variant(style));
			} catch (ComFailException e) {
				if (index++ >= MAX_RETRY) {
					throw e;
				} else {
					continue;
				}
			}
		}

	}

	/**
	 * 插入标题.
	 * 
	 * @param text 标题文字.
	 * 
	 */
	public void insertOutline(final String text) {

		this.insertText(text);
		this.enter();
	}

	/**
	 * 插入目录. tablesOfContents的参数的含义 Add(Range As Range, [UseHeadingStyles],
	 * [UpperHeadingLevel], [LowerHeadingLevel], [UseFields], [TableID],
	 * --这两个要不要都可以 [RightAlignPageNumbers],[IncludePageNumbers], [AddedStyles],
	 * --这个参数必须有值,必须是数字,如果是其它,则报com.jacob.com.ComFailException
	 * [UseHyperlinks],[HidePageNumbersInWeb], [UseOutlineLevels])
	 */
	public void insertTablesOfContents() {
		Dispatch tablesOfContents = Dispatch.get(this.doc, "TablesOfContents")
				.toDispatch();

		Dispatch range = Dispatch.get(this.selection, "Range").toDispatch();
		// Dispatch.call中的参数最多是9个,如果超过9个,请用Dispatch.callN或者Dispathc.invoke
		/*
		 * Dispatch.invoke(tablesOfContents, "Add", Dispatch.Method,new
		 * Object[]{range,new Variant(true),new Variant(1), new Variant(3),new
		 * Variant(true), new Variant(true),new Variant(true) ,new
		 * Variant("1"),new Variant(true),new Variant(true)},new int[10]);
		 */
		Dispatch.callN(tablesOfContents, "Add", new Object[] { range,
				new Variant(true), new Variant(1), new Variant(3),
				new Variant(false), new Variant(true), new Variant(true),
				new Variant("1"), new Variant(true), new Variant(true) });
	}

	/**
	 * 从选定内容或插入点开始查找文本.
	 * 
	 * @param toFindText
	 *            要查找的文本
	 * @return boolean true-查找到并选中该文本，false-未查找到文本
	 */
	public boolean find(final String toFindText) {

		if (toFindText == null || toFindText.equals("")) {
			return false;
		}

		// 从selection所在位置开始查询
		Dispatch find = Dispatch.call(selection, "Find").toDispatch();
		// 设置要查找的内容
		Dispatch.put(find, "Text", toFindText);
		// 向前查找
		Dispatch.put(find, "Forward", "True");
		// 设置格式
		Dispatch.put(find, "Format", "True");
		// 大小写匹配
		Dispatch.put(find, "MatchCase", "True");
		// 全字匹配
		Dispatch.put(find, "MatchWholeWord", "True");
		// 查找并选中
		return Dispatch.call(find, "Execute").getBoolean();
	}

	/**
	 * 把选定选定内容设定为替换文本.
	 * 
	 * @param toFindText
	 *            查找字符串
	 * @param newText
	 *            要替换的内容
	 * @return boolean true-查找到并选中该文本，false-未查找到文本
	 */
	public boolean replaceText(final String toFindText, final String newText) {

		if (!find(toFindText)) {
			return false;
		}

		Dispatch.put(selection, "Text", newText);
		return true;
	}

	/**
	 * 创建表格.
	 * 
	 * @param numCols
	 *            列数
	 * @param numRows
	 *            行数
	 * @param autoFormat
	 *            默认格式
	 * @return 表格对象
	 */
	public Dispatch createTable(final int numRows, final int numCols,
			final int autoFormat) {

		int index = 1;
		while (true) {
			try {
				Dispatch tables = Dispatch.get(doc, "Tables").toDispatch();
				Dispatch range = Dispatch.get(selection, "Range").toDispatch();
				Dispatch newTable = Dispatch.call(tables, "Add", range,
						new Variant(numRows), new Variant(numCols))
						.toDispatch();
                 
				Dispatch.call(selection, "MoveRight");
				Dispatch.call(newTable, "AutoFormat", new Variant(autoFormat));
				return newTable;
			} catch (ComFailException e) {
				if (index++ >= MAX_RETRY) {
					throw e;
				} else {
					continue;
				}
			}
		}
	}

	/**
	 * 在指定的表头里填写数据.
	 * 
	 * @param table
	 *            表格
	 * @param cellColIdx
	 *            列号
	 * @param txt
	 *            文字
	 * @param style
	 *            样式
	 */
	public void putTableHeader(final Dispatch table, final int cellColIdx,
			final String txt, final String style) {

		Dispatch cell = Dispatch.call(table, "Cell", new Variant(1),
				new Variant(cellColIdx)).toDispatch();

		Dispatch.call(cell, "Select");
		Dispatch.put(selection, "Text", txt);
		Dispatch.put(this.selection, "Style", getOutlineStyle(style));
	}

	/**
	 * 在指定的单元格里填写数据.
	 * 
	 * @param table 表格
	 * @param cellRowIdx行号
	 * @param cellColIdx列号
	 * @param txt文字
	 * @param styl 样式
	 */
	public void putTableCell(final Dispatch table, final int cellRowIdx,
			final int cellColIdx, final String txt, final String style) {

		Dispatch cell = Dispatch.call(table, "Cell", new Variant(cellRowIdx),
				new Variant(cellColIdx)).toDispatch();

		Dispatch.call(cell, "Select");
		Dispatch.put(selection, "Text", txt);
		//Dispatch.put(this.selection, "Style", getOutlineStyle(style));
	}

	/**
	 * 关闭当前word文档.
	 */
	private void closeDocument() {
		if (doc != null) {
			Dispatch.call(doc, "Save");
			Dispatch.call(doc, "Close", new Variant(saveOnExit));
			doc = null;
		}
	}

	/**
	 * 文件保存或另存为.
	 * 
	 * @param savePath
	 *            保存或另存为路径
	 */
	public void saveFileAs(final String savePath) {

		Dispatch.call(doc, "SaveAs", savePath);
	}

	/**
	 * 关闭文档.
	 */
	public void close() {
		closeDocument();
		if (wordApp != null) {
			Dispatch.call(wordApp, "Quit");
			wordApp = null;
		}
		selection = null;

	}
}