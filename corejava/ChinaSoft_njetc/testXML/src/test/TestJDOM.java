package test;

import java.io.File;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

public class TestJDOM {

	public static void main(String args[]) {
		long start = System.currentTimeMillis();
		try {
			// 取得解析器
			SAXBuilder builder = new SAXBuilder();

			// 解析文件
			File file = new File("src/books.xml");
			Document doc = builder.build(file);

			// 取得根节点
			Element root = doc.getRootElement();

			// 取得子节点列表
			List<?> books = root.getChildren();
			for (int i = 0; i < books.size(); i++) {
				// 取得某一个子节点
				Element book = (Element)books.get(i);

				// 取得属性值
				String isbn = book.getAttributeValue("isbn");
				System.out.print(isbn);

				String name = book.getChild("name").getText();
				String price = book.getChild("price").getText();
				String author = book.getChild("author").getText();
				String year = book.getChild("year").getText();
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
