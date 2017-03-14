package game;

import java.awt.image.BufferedImage;

public class GameThreadImplementation implements Runnable {

	public GameThreadImplementation(BufferedImage BImg){
		
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
		
	}

}
