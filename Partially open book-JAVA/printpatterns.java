package partiallyopen;

public class printpatterns {
	public static void main(String[] args) {
		int rows = 5, k = 0, count = 0, count1 = 0;
	    for (int i = 1; i <= rows; ++i, k = 0) 
	    {
	    for (int space = 1; space <= rows - i; ++space) 
	    {
	    System.out.print("  ");
	    }
	    while (k != 2 * i - 1) {
	    System.out.print("* ");
	    ++k;
	      }
	    System.out.println();
	    }
	    System.out.println();
	    
	    for(int i = rows; i >= 1; --i) {
	    for(int space = 1; space <= rows - i; ++space) {
	    System.out.print("  ");
	    }
	    for(int j=i; j <= 2 * i - 1; ++j) {
	    System.out.print("* ");
	    }
	    for(int j = 0; j < i - 1; ++j) {
	    System.out.print("* ");
	    }
	    System.out.println();
	    }
	    System.out.println();
	    
	    int rowc=rows;
	    for (int i = 1; i <= rows; ++i) {
	    for (int space = 1; space <= rows - i; ++space) {
	    System.out.print("  ");
	    ++count;
	    }
	    while (k != 2 * i - 1) {
	    if (count <= rows - 1) {
	    System.out.print((i + k) + " ");
	    ++count;
	    } else {
	    ++count1;
	    System.out.print((i + k - 2 * count1) + " ");
	    }
	    ++k;
	    }
	    count1 = count = k = 0;
	    System.out.println();
	    }
	    System.out.println();

	    for (int i = 0; i < rows; i++) 
	    {
		for (int j = 1; j <= i*2; j++)
		{
		System.out.print(" ");
		}
		for (int j = 1; j <= rowc; j++) 
		{
		System.out.print(j+" ");
		}
		for (int j = rowc-1; j >= 1; j--) 
		{
		System.out.print(j+" ");
		}
		System.out.println();
		rowc--;
		}
	    System.out.println();
	    
	    	int num= 9;
	    	int m, n;
         	for (m = 1; m <= num; m++) 
         	{
        	for (n = 1; n <= num - m; n++)
        	{
            System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) 
            {
            System.out.print("*");
            }
            System.out.println();
        }
 
        	for (m = num - 1; m > 0; m--) 
        	{
        	for (n = 1; n <= num - m; n++)
        	{
            System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) 
            {
            System.out.print("*");
            }
            System.out.println();
        }
        	
    	}
}
