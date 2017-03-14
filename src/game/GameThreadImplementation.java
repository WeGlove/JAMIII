package game;

public class GameThreadImplementation implements Runnable {

	@Override
	public void run() {
		while(true){
			step();
		}
	}
	
	public void step(){
		//TODO implement Pong ;)
	}

}
