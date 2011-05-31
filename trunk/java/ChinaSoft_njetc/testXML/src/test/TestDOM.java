package test;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TestDOM {

	public static void main(String args[]) {
		long start = System.currentTimeMillis();
		try {
			// 取得DOM工厂
			DocumentBuilderFactory factory = DocumentBuilderFactory
					.newInstance();

			// 取得DOM解析器
			DocumentBuilder builder = factory.newDocumentBuilder();

			// 解析文件
			File file = new File("src/books.xml");
			Document doc = builder.parse(file);

			// 取得根节点
			Element root = doc.getDocumentElement();

			// 取得子节点列表
			NodeList books = root.getChildNodes();
			for (int i = 0; i < books.getLength(); i++) {
				// 取得某一个子节点
				Node book = books.item(i);

				if (book.getNodeType() == Node.ELEMENT_NODE) {
					// 取得属性值
					String isbn = book.getAttributes().getNamedItem("isbn")
							.getNodeValue();
					System.out.print(isbn);

					// 轮循子节点
					for (Node node = book.getFirstChild(); node != null; node = node
							.getNextSibling()) {
						if (node.getNodeType() == Node.ELEMENT_NODE) {
							if (node.getNodeName().equals("name")) {
								String name = node.getFirstChild()
										.getNodeValue();
								System.out.print("\t" + name);
							}
							if (node.getNodeName().equals("price")) {
								String price = node.getFirstChild()
										.getNodeValue();
								System.out.print("\t" + price);
							}
							if (node.getNodeName().equals("author")) {
								String author = node.getFirstChild()
										.getNodeValue();
								System.out.print("\t" + author);
							}
							if (node.getNodeName().equals("year")) {
								String year = node.getFirstChild()
										.getNodeValue();
								System.out.println("\t" + year);
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
