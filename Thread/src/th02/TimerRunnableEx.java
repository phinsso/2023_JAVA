package th02;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimerRunnableEx extends JFrame {
	
	public TimerRunnableEx() {
		setTitle("Thread를 상속 받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane(); // 컨테이너 박스를 생성
		c.setLayout(new FlowLayout()); // c 컨테이너에 오브젝트를 어떻게 배치할 것인지 (flowLayout으로 배치)
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		// 위의 두 문장은 Thread th = new Thread(new TimerRunnable(timerLabel)); 와 같음
		
		setSize(300, 170);
		setVisible(true);
		
		th.start();
	}

	public static void main(String[] args) {
		// main() 메서드도 스레드이다.
		// main() 메서드가 다른 스레드보다 먼저 종료될 수 있다.
		
		new TimerRunnableEx(); // 익명의 객체 생성 후 생성자가 호출됨
		
		for(int i = 0; i < 100; i++) {
			System.out.println("Thread " + i);
		}
	}

}
