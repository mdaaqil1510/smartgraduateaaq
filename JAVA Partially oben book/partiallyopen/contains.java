package partiallyopen;

public class contains {
	 public static void main(String[] args) {
	        int arr[]={30,69,19,25,22,40};
	        if(contains(arr, 30))
	        {
	        System.out.println("The given array contains the key");
	        }
	        else
	        System.out.println("The given array doesn't contain the key");
	        }

	    public static boolean contains(int[] arr,int key){
	        boolean isvalid=false;
	        for(int row=0;row<arr.length;row++)
	        {
	        if(arr[row]==key)
	        isvalid=true;
	        }
	        return isvalid;
	    } 
}
