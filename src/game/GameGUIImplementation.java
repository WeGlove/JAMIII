package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Implements a GUI class for a Pong game.
 * Listens to w, s, o and l keys.
 * @author WeGlove
 *
 */
public class GameGUIImplementation implements GameGUI {

	JFrame Frame;
	BufferedImage BImg;
	
	public GameGUIImplementation(){
		
		Frame = new JFrame();
		Frame.setBounds(10, 10, 10, 10);
		Frame.setSize(100, 100);
		Frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		
		BImg = new BufferedImage(100,100,BufferedImage.TYPE_INT_RGB);
		BImg.setRGB(10, 10, 0x00ff00ff);
		
		ImageIcon image = new ImageIcon(BImg);
        JLabel label = new JLabel(image);
        GameThreadImplementation T = new GameThreadImplementation(BImg);
        
		Frame.addKeyListener(new KeyListener() {
				public void keyPressed(KeyEvent e) { 
					if (e.getKeyChar()=='w') {
						System.out.println("Pressing W");
						T.LeftPaddleUp();
					}
					
					if (e.getKeyChar()=='s'){ 
						System.out.println("Pressing S");
						T.LeftPaddleDown();
					}
					
					if (e.getKeyChar()=='o'){
						System.out.println("Pressing O");
						T.RightPaddleUp();
					}
					
					if (e.getKeyChar()=='l'){
						System.out.println("Pressing L");
						T.RightPaddleDown();
					}
			    }

				@Override
				public void keyReleased(KeyEvent e) {
					if (e.getKeyChar()== 'w' || e.getKeyChar()== 's'){
						System.out.println("W/S Halt");
						T.LeftPaddlehalt();
					}
					
					if (e.getKeyChar()== 'o' || e.getKeyChar()== 'l'){
						System.out.println("O/L Halt");
						T.RightPaddlehalt();
					}
				}

				@Override
				public void keyTyped(KeyEvent e) {
					//Do nothing!!!!
				}
				}
				);
		
		Frame.add(label);
		Frame.setVisible(true);
	}
	
}
