import java.util.Scanner;

public class pr16_searchlocation {
	 public static void main(String[] args) {
		 int arr[]={30,69,19,25,22,40,30};
	     System.out.print("Enter the element to be searched : ");
	     Scanner in=new Scanner(System.in);
	     int search=in.nextInt();
	     boolean check=true;
	     int count=0;
	     for(int idx=0;idx<arr.length;idx++)
	     {
	     if(search==arr[idx])
	     {
	     System.out.println("The searched element located in : "+idx);
	     check=false;
	     count++;
	     }
	     }
	     if(check){
	     System.out.println("The searched element is not in the array");
	     }
	     else{
	     System.out.println("The Searched number repeats "+count+" number of times");
	     }
	     }
}
