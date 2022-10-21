package partiallyopen;

public class selectsort {
	public static void main(String[] args) {
		int[] array = {29, 30, 64, 69, 24, 42};
		System.out.println("Array before Sort: ");
		printarr(array);
		select_Sort(array);
		System.out.println("\nArray after sort: ");
		printarr(array);
	}

	public static void select_Sort(int[] array) {
		int arrayLen = array.length;
		int min, minIndex, temp;
		for (int i = 0; i < arrayLen; i++) {
		min = array[i];
		minIndex = i;
		for (int j = i; j < arrayLen; j++) {
		if (array[j] < min) {
		min = array[j];
		minIndex = j;
		}
		}
		temp = array[i];
		array[i] = min;
		array[minIndex] = temp;
		}
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
