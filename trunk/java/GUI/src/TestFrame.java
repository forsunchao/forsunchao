import java.awt.Color;
import java.awt.Frame;

public class TestFrame {
	public static void main(String[] args) {
		Frame frame = new Frame("My First Frame");
		frame.setVisible(true);//���ÿɼ�
		frame.setLocation(300, 300);//����λ��
		frame.setResizable(true);//�����Ƿ�ɵ�����С��Ĭ��Ϊtrue
		//frame.setSize(300, 200);//���ô��ڴ�С
		//frame.pack();
		frame.setBackground(Color.LIGHT_GRAY);
	}

}
