import java.util.Scanner;

public class pr8_findlocationarr {
	public static void main(String[] args) {
        int arr[]={3,4,2,5,6};
        System.out.print("Enter the element to be searched : ");
        Scanner in=new Scanner(System.in);
        int search=in.nextInt();
        boolean check=true;
        for(int idx=0;idx<5;idx++)
        {
        if(search==arr[idx])
        {
        System.out.println("The element located in : "+idx);
        check=false;
        }
        }
        if(check)
        {
        System.out.println("The element is not located in this array!!");
        }
        
    }
}
