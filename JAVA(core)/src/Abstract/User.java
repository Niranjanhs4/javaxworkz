package Abstract;

public class User extends Car {
	
	void stop() {
		System.out.println("car stopped");
	}
	
	void start()
	{
		System.out.println("car started");
	}
	
	public static void main(String[] args) {
		User u = new User();
		 u.start();
		 u.shiftgears();
	     u.stop();
	     
	}

}
