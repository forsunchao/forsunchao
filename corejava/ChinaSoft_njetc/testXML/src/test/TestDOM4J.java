package test;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class TestDOM4J {

	public static void main(String args[]) {
		long start = System.currentTimeMillis();
		try {
			// 取得SAX解析器
			SAXReader reader = new SAXReader();

			// 解析文件
			File file = new File("src/books.xml");
			Document doc = reader.read(file);

			// 取得根节点
			Element root = doc.getRootElement();

			// 取得子节点列表
			for (int i = 0; i < root.nodeCount(); i++) {
				// 取得某一个子节点
				Element book = (Element) root.node(i);

				// 取得属性值
				String isbn = book.attributeValue("isbn");
				System.out.print(isbn);

				String name = book.node(0).getText();
				String price = book.node(1).getText();
				String author = book.node(2).getText();
				String year = book.node(3).getText();
				System.out.print("\t" + name);
				System.out.print("\t" + price);
				System.out.print("\t" + author);
				System.out.println("\t" + year);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
