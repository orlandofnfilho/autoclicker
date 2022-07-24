package autoclicker;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class AutoClicker implements KeyListener{

	static boolean enabled = false;
	public static void main(String[] args) {
		
		  AutoClicker ac = new AutoClicker();
	        try {

	            JFrame f=new JFrame();
	            f.addKeyListener(ac);
	            f.setSize(100, 100);
	            f.setVisible(true);

	            Robot r = new Robot();
	            int button = InputEvent.BUTTON1_DOWN_MASK;

	            while (true) {
	                if(enabled) {
	                    System.out.println("Click");
	                    r.mousePress(button);
	                    Thread.sleep(400);
	                    r.mouseRelease(button);
	                }
	                Thread.sleep( 2000);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		  if (e.getKeyCode() == KeyEvent.VK_A) {
	            enabled = !enabled;
	        }
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
