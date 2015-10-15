
public class Square {
	
	int side;
	public Square()
	{
		side = 1;
	}
	
	public Square(int x)
	{
		side = x;
	}
	
	public int getArea()
	{
		return((this.side*this.side));
	}
}
