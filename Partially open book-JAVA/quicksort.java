package partiallyopen;

public class quicksort {
	public static void main(String[] args) {
		int[] array = {29, 30, 64, 69, 24, 42};
		System.out.println("Array before Sort: ");
		printarr(array);
		quickSort(array, 0, array.length - 1);
		System.out.println("\nArray after sort: ");
		printarr(array);
	}

	public static void quickSort(int[] array, int fromIdx, int toIdx) {
		if (fromIdx >= toIdx) 
		{
		return;
		}
		int pivotIndex = (fromIdx + toIdx) / 2;
		int pivot = array[pivotIndex];
		int swap = fromIdx;
		int finalp = toIdx;
		int temp;
		while (swap <= finalp) 
		{
		while (array[swap] < pivot)
		{
		swap++;
	}
		while (array[finalp] > pivot) 
		{
		finalp--;
		}
		if (swap <= finalp) 
		{
		temp = array[swap];
		array[swap] = array[finalp];
		array[finalp] = temp;
		swap++;
		finalp--;
		}
		}
		pivotIndex = swap;
		quickSort(array, fromIdx, pivotIndex - 1);
		quickSort(array, pivotIndex, toIdx);
		return;

	}
	public static void quickSort(int[] array)
	{
		int fromIdx = 0;
		int toIdx = array.length - 1;
		quickSort(array, fromIdx, toIdx);
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
