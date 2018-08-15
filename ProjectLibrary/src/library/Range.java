package library;

public class Range {
	
	private int low;
	private int high;
	
	/**
	 * 
	 * @param l start range
	 * @param h end range
	 */
	
	public Range(int l, int h)
	{
		this.low = l;
		this.high = h;
	}
	
	/**
	 * check number belong to range
	 * @param number 
	 * @return
	 */
	public boolean contains(int number)
	{
		return (number >= low && number <= high);
	}

}
