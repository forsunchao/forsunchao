package test;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestTimerTask extends TimerTask {

	public void run() {
		System.out.println(new Date());
	}
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task = new TestTimerTask();
		timer.schedule(task, 1000, 1000);
	}
}
