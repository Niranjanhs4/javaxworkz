package method;

class Addmethod {
	void add(int a, int b)
	{
		int sum =a+b;
		System.out.println("sum of "+a+" and "+b+" is "+sum);
	}
	public static void main(String[] args)
	{
		Addmethod am = new Addmethod();
		am.add(10,20);
		am.add(30,40);
		am.add(45,60);
	}
	
}
