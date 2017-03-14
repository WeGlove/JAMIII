package game;

import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class GameGUIImplementation implements GameGUI {

	JFrame Frame;
	BufferedImage BImg;
	
	public GameGUIImplementation(){
		
		Frame = new JFrame();
		Frame.setBounds(10, 10, 10, 10);
		Frame.setVisible(true);
		
	}
	
}
