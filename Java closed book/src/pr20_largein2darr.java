import java.util.Arrays;

public class pr20_largein2darr {

public static void main(String[] args) {
	int[][] arr = {{30,25}, {10,19}, {69,55}, {42,14}, {16,17}, {20,44} };
	System.out.println("This is the array: ");
	System.out.println(Arrays.deepToString(arr));
	System.out.println();
	
	for(int i=0; i<arr.length; i++)
	{
	if(arr[i][0] > arr[i][1]) 
	{
	System.out.println("In the row " + i + ", the greatest element is : " + arr[i][0]);
	}
	else 
	{
	System.out.println("In the row " + i + ", the greatest element is : " + arr[i][1]);
	}
}
}
}
