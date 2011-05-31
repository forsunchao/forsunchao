package test;

import java.io.File;
import java.util.Stack;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TestSAX extends DefaultHandler {
	Stack<String> tags = new Stack<String>();

	public TestSAX() {
		super();
	}

	public void characters(char ch[], int start, int length)
			throws SAXException {
		String tag = (String) tags.peek();
		if (tag.equals("name")) {
			System.out.print("\t" + new String(ch, start, length));
		}
		if (tag.equals("price")) {
			System.out.print("\t" + new String(ch, start, length));
		}
		if (tag.equals("author")) {
			System.out.print("\t" + new String(ch, start, length));
		}
		if (tag.equals("year")) {
			System.out.println("\t" + new String(ch, start, length));
		}
	}

	public void startElement(String uri, String localName, String qName,
			Attributes attrs) {
		if (qName.equals("book")) {
			System.out.print(attrs.getValue("isbn"));
		}
		tags.push(qName);
	}

	public static void main(String args[]) {
		long start = System.currentTimeMillis();
		try {
			// 取得SAX工厂
			SAXParserFactory factory = SAXParserFactory.newInstance();

			// 取得SAX解析器
			SAXParser parser = factory.newSAXParser();

			// 解析文件
			File file = new File("src/books.xml");
			TestSAX sax = new TestSAX();
			parser.parse(file, sax);

		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
