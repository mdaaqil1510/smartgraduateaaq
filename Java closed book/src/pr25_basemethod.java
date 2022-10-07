
public class pr25_basemethod {
	public static void main(String[] args) {
		derived cl = new derived();
		cl.useD();
		}
	}
	class base{			
	String method() 
	{
	return "Wow";
	}
	}

	class derived{
	public void useD() 
	{
	base z = new base();
	System.out.println("base says: " + z.method());
	}
	
}
