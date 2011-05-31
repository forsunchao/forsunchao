import java.awt.Color;
import java.awt.Frame;

public class TestFrame {
	public static void main(String[] args) {
		Frame frame = new Frame("My First Frame");
		frame.setVisible(true);//设置可见
		frame.setLocation(300, 300);//设置位置
		frame.setResizable(true);//设置是否可调整大小，默认为true
		//frame.setSize(300, 200);//设置窗口大小
		//frame.pack();
		frame.setBackground(Color.LIGHT_GRAY);
	}

}
