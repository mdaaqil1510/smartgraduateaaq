package partiallyopen;

public class linearsearch {
	public static void main(String[] args) {
	int[] array = {29, 30, 64, 69	};
	System.out.println(linsearch(array, 29));
	System.out.println(linsearch(array, 43));
	System.out.println(linearsearchindex(array, 45));
	System.out.println(linearsearchindex(array, 30));
	}

	public static boolean linsearch(int[] array, int key) {
	for (int i = 0; i < array.length; i++) 
	{
	if (key == array[i]) 
	{
	return true;
	}
	}
	return false;
	}

	public static int linearsearchindex(int[] array, int key) {
	for (int i = 0; i < array.length; i++) 
	{
	if (key == array[i]) 
	{
	return i;
	}
	}
	return -1;
	}
}
