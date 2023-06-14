package th01;

import javax.swing.JLabel;

public class TimerThread extends Thread { // Thread 클래스를 상속 받음 (자바에서 제공되는 클래스)
	private JLabel timerLabel;
	
	public TimerThread(JLabel timerLable) {
		this.timerLabel = timerLable;
	}
	
	@Override
	public void run() {
		int n = 0;
		
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
			
		}
	}
}
