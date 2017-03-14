package Board;

public class BoardImplementation {
int w,h, panelsize;
boolean [] [] board;
int []  Panelright;
int []  Panelleft;
int [] ball;
	public BoardImplementation (int x, int y, int p) throws Exception 
	{ w = x;
		h = y;
		if ((w > 5) && (h > 5) && ( p < ( h - 2)))
		{panelsize = p;
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
		Initialize ();}
		else
			throw new Exception ();
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
	
	public void Initialize () {
		int Index, x, y;
		Index = panelsize;
		x = Panelright [0];
		y = Panelright [1];
		while ( Index > 0)
		{ board [x] [y + Index - 1] = true;
		Index --;
			
		}
		
		Index = panelsize;
		x = Panelleft [0];
		y = Panelright [1];
		
		while ( Index > 0)
		{ board [x] [y + Index - 1] = true;
		Index --;
			
		}
		
		x = ball [0];
		y= ball [1];
		
		board [x] [y] = true;
	
	}
	
	
}
