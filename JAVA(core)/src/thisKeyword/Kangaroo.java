package thisKeyword;
//Example for this keyword.

public class Kangaroo {
      double height = 5.5;
      
      void display()
      {
    	  double height = 4.4;
    	  
    	  System.out.println(height);
    	  System.out.println(this.height);
    	  
      }
      public static void main(String[] args) {
		
    	 Kangaroo k = new Kangaroo();
    	
    	 k.display();
	}
}
