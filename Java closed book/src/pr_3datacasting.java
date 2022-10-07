
public class pr_3datacasting {
	public static void main(String[] args) {
		int a, b = 2, c;	
		a = 4;				
		double d = 5.5;		
		c = (int)d;			
		float f = 6.5f;		
		d = f;				
		double e = d/(double)a;
		System.out.println(a+","+b+","+c);
	}
}
