package game;

import java.awt.image.BufferedImage;

import Board.BoardImplementation;

public class GameThreadImplementation implements Runnable {

	BufferedImage BImg;
	BoardImplementation BImp;
	
	public GameThreadImplementation(BufferedImage BImg){
		try {
			this.BImg=BImg;
			
			BImp = new BoardImplementation(100, 100, 3);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		
	}
	
	@Override
	public void run() {
		while(true){
			long ping = System.nanoTime();
			step();
			try {
				Thread.sleep(016666666 - (System.nanoTime() - ping));
				System.out.println("60 FPS");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
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
