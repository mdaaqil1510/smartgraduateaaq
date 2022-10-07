
public class pr17_modifyaccess {
	static int d = 10; //it is right so no error
	public static void main(String[] args) {
		final int n  = 100; // constant variable
		//n =10; 	error occurs, constants can't be changed 
		
		int a = 10; //static member inside a static method
	}
	
	int test(int b) {
		//static int's  c = b;	error, static can't go inside non static
		//static is only executed inside
		return 0;
	}
	test ts = new test();
	//ts.test();	shows an error
}

//class is created
class test{
	int test(int i){
		return i;
	}
}
