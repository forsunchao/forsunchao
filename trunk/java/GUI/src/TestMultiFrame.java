import java.awt.Color;
import java.awt.Frame;

public class TestMultiFrame {
	public static void main(String[] args) {
		MyFrame myFrame1 = new MyFrame(100,100,200,200,Color.blue);
		MyFrame myFrame2 = new MyFrame(300,100,200,200,Color.red);
		MyFrame myFrame3 = new MyFrame(100,300,200,200,Color.cyan);
		MyFrame myFrame4 = new MyFrame(300,300,200,200,Color.darkGray);
	}

}
class MyFrame extends Frame {
	static int id = 0;
	MyFrame(int x,int y,int w,int h,Color c) {
		super("My Frame " + (++id));
		setVisible(true);
		setBounds(x, y, w, h);
		setBackground(c);
	}
}