package method;

public class Overloadingmethod {
 
	public static void main(String[] args) {
	
		System.out.println("Hello");
		main(10);
		main("nikhi");
		
	}
   public static void main(int a) {
      System.out.println(a);	
    }
   
  public static void main(String a) {
	  System.out.println(a);  
	}
}
