package partiallyopen;

public class equals {
	public static void main(String[] args) {
        int[] arr1={30,69,19,25,22,40};
        int[] arr2={99,20,15,02,10,25};
        if(equals(arr1, arr2))
        {
        System.out.println("Both of the arrays are equal");
        }
        else
        System.out.println("The arrays are not equal");
		}
	
    	public static boolean equals(int[] arr1,int[] arr2){
        boolean isvalid=true;
        if(arr1.length==arr2.length){
        for(int i=0;i<arr1.length;i++){
        if(!(arr1[i]==arr2[i])){
        isvalid=false;
        break;
        }
        }
        }
        return isvalid;
    }
}
