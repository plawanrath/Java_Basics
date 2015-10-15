
public class MyFour<T> {
	
	private T item1,item2,item3,item4;
	
	public MyFour(T t1,T t2,T t3,T t4)
	{
		this.item1 = t1;
		this.item2 = t2;
		this.item3 = t3;
		this.item4 = t4;
	}

	public boolean allEquals()
	{
		return(item1.equals(item2) && item2.equals(item3) && item3.equals(item4) && item4.equals(item1));
	}
	
	public void shiftLeft()
	{
		T temp;
		temp = item1;
		item1 = item2;
		item2 = item3;
		item3 = item4;
		item4 = temp;
	}
	
	public String toString()
	{
		String result = String.valueOf(item1) + " " + String.valueOf(item2) + " " + String.valueOf(item3) + " " + String.valueOf(item4);
		return(result);
	}
	
	public static void main(String []args)
	{
		MyFour<String> f1 = new MyFour("First","First","First","First");
		System.out.println(f1);
		System.out.println(f1.allEquals());
		MyFour<Integer> f2 = new MyFour(12,13,14,15);
		System.out.println(f2);
		System.out.println(f2.allEquals());
		f2.shiftLeft();
		System.out.println(f2);
	}
}
