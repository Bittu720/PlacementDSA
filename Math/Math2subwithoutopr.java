public class Math2subwithoutopr {
static int subtract(int x, int y)
	{
	while (y != 0)
	{
		int borrow = (~x) & y;
		x = x ^ y;
		y = borrow << 1;
	}
	return x;
}
	public static void main (String[] args) 
	{
		int x = 29, y = 13;
		System.out.println("x - y is " + 
						subtract(x, y));
	}
}
