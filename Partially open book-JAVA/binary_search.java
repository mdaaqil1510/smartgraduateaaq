package partiallyopen;

public class binary_search {
	public static void main(String[] args) {
	int[] array = {29, 30, 64, 69, 58, 77, 33, 44, 22, 11};
	System.out.println(binarySearch(array, 29, 4, 8));
	System.out.println(binarySearch(array, 69, 4, 8));
	System.out.println(binarySearch(array, 30, 1, 8));
	System.out.println(binarySearch(array, 77));
	System.out.println(binarySearch(array, 82));
	}

	public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
	if (fromIdx == toIdx - 1) 
	{
	if (key == array[fromIdx])
	return true;
	return false;
	}
	int middleIdx = (fromIdx + toIdx) / 2;
	if (key == array[middleIdx]) 
	{
	return true;
	} 
	else if (key > array[middleIdx]) 
	{
	fromIdx = middleIdx;
	} 
	else 
	{
	toIdx = middleIdx;
	}
	return binarySearch(array, key, fromIdx, toIdx);
	}

	public static boolean binarySearch(int[] array, int key) {
	int fromIdx = 0;
	int toIdx = array.length - 1;
	return binarySearch(array, key, fromIdx, toIdx);
	}
}	
