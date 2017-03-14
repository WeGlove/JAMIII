package Board;

public class BoardImplementation {

	int w,h, panelsize;
	
	boolean [] [] board;
	
	int []  Panelright;
	int []  Panelleft;
	
	int [] ball;

	/**
	 * @param x -> width
	 * @param y -> height
	 * @param p -> panel size
	 * @throws Exception if too small
	 */
	public BoardImplementation (int x, int y, int p) throws Exception 
	{ w = x;
		h = y;
		if ((w > 5) && (h > 5) && ( p < ( h - 2))){
			panelsize = p;
			
			board = new boolean [w] [h];
			
			Panelright = new int [2] ;
			Panelright [0] = 1;
			Panelright [1] =  h - 2;
			
			Panelleft = new int [2] ;
			Panelleft [0] = w - 2;
			Panelleft [1] = h - 2;
			
			ball = new int [2];
			ball  [0] = w / 2;
			ball [1] = h / 2;
			
			Initialize ();
			} else throw new Exception ();
	}
	
	public int GetPanelsize () {
		return panelsize;
	}
	
	
	public int GetPanelPosition (boolean Panel) {
		if (Panel)
		return Panelright [0] *10 + Panelright [1];
		else
		return Panelleft [0]*10+ Panelleft [1];	
	
	}
	
	public int GetBalls () {
		return ball[0]*10 + ball[1];
	}
	
	private void Initialize () {
		int Index, x, y;
		
		Index = panelsize;
		x = Panelright [0];
		y = Panelright [1];
		
		while ( Index > 0){
			if (y + Index - 1 < h){
				board [x] [y + Index - 1] = true;
			}
			Index --;
		}
		
		Index = panelsize;
		x = Panelleft [0];
		y = Panelright [1];
		
		while ( Index > 0){
			if (y + Index - 1 < h){
				board [x] [y + Index - 1] = true;
			}
			Index --;
		}
		
		x = ball [0];
		y = ball [1];
		
		board [x] [y] = true;
	
	}
	
	public void SetBalls (int x , int y) throws Exception {
		if ((x < w ) && (y < h))
		{
			board [x] [y] = false;
			board [ball [0]]  [ball [1]] = false;
			ball [0] = x;
			ball [1] = y;
		}
		else 
			throw new Exception ();
	}
	
	public void SetPanels (boolean Panel, int direction) throws Exception
	{int x, y, Index;
		if (Panel)
		{   Index = panelsize;
			x = Panelright [0];
			y = Panelright [1];
					
					
				if ( x - direction < 0)
					throw new Exception ();
				if (x + direction > h)
					throw new Exception ();
					
				 
				
				
					while (Index > 0)
					{
						board [x] [y + Index -1] = false;
						board [x] [y + direction + Index - 1] = true;
						Index--;
						
					}
					Panelright [1] = Panelright [1] + direction;
				
					
			}
		else
		{
			Index = panelsize;
			x = Panelleft [0];
			y = Panelleft [1];
					
					
				if ( x - direction < 0)
					throw new Exception ();
				if (x + direction > h)
					throw new Exception ();
					
				 
				
				
					while (Index > 0)
					{
						board [x] [y + Index -1] = false;
						board [x] [y + direction + Index - 1] = true;
						Index--;
						
					}
					Panelleft [1] = Panelleft [1] + direction;
		}
		
	}
	
}
