package partiallyopen;

public class insertionsorr {
	public static void main(String[] args) {
	int[] array = {29, 30, 64, 69, 24, 42};
	System.out.println("Array before Sort: ");
	printarr(array);
	insertionsort(array);
	System.out.println("\nArray after sort: ");
	printarr(array);
	}

	public static void insertionsort (int[] array) {
		int arraylen = array.length;
		int now;
		int insertp = 0;
		for (int i = 1; i < arraylen; i++) 
		{
		now = array[i];
		for (int j = i - 1; j >= 0; j--) 
		{
		if (now < array[j])
		{
		array[j + 1] = array[j];
		}
		else 
		{
		insertp = j + 1;
		break;
		}
		}
		array[insertp] = now;
		}
	}

	public static void printarr(int[] array) {
		System.out.print("The values is : [");
		for (int i = 0; i < array.length; i++) 
		{
		if (i == 0) 
		{
		System.out.print(array[i]);
		} 
		else 
		{
		System.out.print(", " + array[i]);
		}
		}
		System.out.println("]");
	}
}
