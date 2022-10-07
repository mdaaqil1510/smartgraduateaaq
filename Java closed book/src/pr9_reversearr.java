import java.util.Arrays;

public class pr9_reversearr {
	public static void main(String[] args) {
		int[] arr = {30,69,19,25,22,40};
		System.out.println("The array : "+Arrays.toString(arr));
		System.out.println();
		int temp;
		int a = arr.length - 1;	
		System.out.println("Reverse of array is : ");
		for(int i=a; i>=0; i--) 
		{
		System.out.print(arr[i] + " ");
		}
	}
}
