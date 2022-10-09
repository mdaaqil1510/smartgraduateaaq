package partiallyopen;

public class copyof {
	public static void main(String[] args) {
        int[] arr={30,69,19,25,22,40};
        int[] arrcpy=copyof(arr);
        System.out.println("The elements on the copied array are");
        for(int i=0;i<arrcpy.length;i++){
            System.out.println(arrcpy[i]+" ");
        }
		}

    public static int[] copyof(int[] arr){
        int[] copy=arr;
        return copy;
    }
}
