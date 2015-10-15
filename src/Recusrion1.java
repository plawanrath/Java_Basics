
public class Recusrion1 {

	public static int end = -1;
	public static int displayValues(int n,int found)
	{
		if(found == 0)
		{
			end++;
			System.out.print(n + " ");
			if(n == 0)
			{
				return displayValues(n+1,1);
			}
			else
			{
				return displayValues(n-1,0);
			}
		}
		else
		{
			System.out.print(n + " ");
			if(n == end)
			{
				return -1;
			}
			else
			{
				return displayValues(n+1,1);
			}
		}
	}
	public static void main(String[] args) {
		displayValues(5,0);
	}

}
