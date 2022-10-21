package partiallyopen;

public class runnumberseq {
	public static void main(String[] args) {
		System.out.println(len(1));
		System.out.println(len(2));
		System.out.println(len(3));
		System.out.println(len(4));
		System.out.println(len(5));
		System.out.println(len(6));
		System.out.println(len(7));
		System.out.println(len(8));
		System.out.println(len(9));
		System.out.println(len(10));
		System.out.println(len(11));
		System.out.println(len(12));

	}

	public static int len (int n) {
		if (n == 1) 
		{
		return 1;
		}
		return len(n - 1) + numOfDigits(n);
		}

	public static int numOfDigits (int n) {
		String numstr = Integer.toString(n);
		return numstr.length();
		}
}
