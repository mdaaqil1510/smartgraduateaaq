
public class pr19_numtoword {
	static int m = 3;
	static int n = 3;
	static void revarr(int arr[][])
	{
	for (int i = 0; i < m; i++)
	{
	int start = 0;
	int end = n - 1;
	while (start < end) 
	{
	int temp = arr[i][start];
	arr[i][start] = arr[i][end];
	arr[i][end] = temp;
	start++;
	end--;
	}
	}
	for (int i = 0; i < m; i++) 
	{
	for (int j = 0; j < n; j++) 
	{
	System.out.print(arr[i][j] + " ");
	}
	System.out.println();
	}
	}
	public static void main(String[] args)
	{
	int arr[][] = { { 1, 2, 3 },{ 4, 5, 6 },{ 7, 8, 9 } };
	System.out.println("The reverse of the given array is : ");
	revarr(arr);
	}
}
