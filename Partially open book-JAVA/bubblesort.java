package partiallyopen;

public class bubblesort {
	public static void main(String[] args) {
		int[] array = {29, 30, 64, 69, 24, 42};
		System.out.println("Array before Sort: ");
		printarr(array);
		bubble_sort(array);
		System.out.println("\nArray after sort: ");
		printarr(array);
	}

	public static void bubble_sort (int[] array) {
		int n = array.length;
		boolean swap;
		int temp;
		do
		{
		swap = false;
		for (int i = 1; i < n; i++) 
		{
		if (array[i] < array[i - 1]) 
		{
		temp = array[i - 1];
		array[i - 1] = array[i];
		array[i] = temp;
		swap = true;
		}
		}
		n = n - 1;
		}
		while (swap);
	}

	public static void printarr(int[] array) {
		System.out.print("The values are: [");
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
