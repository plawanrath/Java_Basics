
public class Recursion2 {

	public static int count = 0;
	public static int getIntegers(int[] arrays, int position)
	{
		if(position<arrays.length)
		{
			if(arrays[position]%2 == 1)
			{
				count++;
				System.out.print(count + " ");
				return getIntegers(arrays,position+1);
			}
			else
			{
				return getIntegers(arrays,position+1);
			}
		}
		else
		{
			return -1;
		}
	}
	public static void main(String[] args) {
		int[] arrayValue = {1,2,3,4,5,6,7};
		getIntegers(arrayValue,0);
	}

}
