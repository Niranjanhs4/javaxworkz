package method;

class Square {
   int findsquare(int n)
   {
	 return(n*n);  
   }

public static void main(String[] args)
{
	Square s = new Square();
	
	s.findsquare(5);
	
System.out.println(s.findsquare(5));
  }
}
