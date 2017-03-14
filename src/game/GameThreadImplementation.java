package game;

import java.awt.image.BufferedImage;

public class GameThreadImplementation implements Runnable {

	BufferedImage BImg;
	
	public GameThreadImplementation(BufferedImage BImg){
		this.BImg=BImg;
	}
	
	@Override
	public void run() {
		while(true){
			step();
		}
	}
	
	private void step(){
		//TODO implement Pong ;)
	}
	
	public void LeftPaddleUp(){
		BImg.setRGB(2, 2, 0x00ffffff);
	}
	
	public void RightPaddleUp(){
		
	}
	
	public void LeftPaddleDown(){
		
	}
	
	public void RightPaddleDown(){
		
	}
	
	public void LeftPaddlehalt(){
		
	}
	
	public void RightPaddlehalt(){
		//
	}

}
