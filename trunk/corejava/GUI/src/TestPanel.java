import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class TestPanel {
	public static void main(String[] args) {
		Frame frame = new Frame("My First Frame");
		Panel panel = new Panel(null);
		frame.setVisible(true);//���ÿɼ�
		frame.setBounds(100, 100, 400, 200);//�����ĵ�����
		frame.setLayout(null);
		frame.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(50, 50, 200, 100);
		panel.setBackground(Color.blue);
		frame.add(panel);
	}
}
