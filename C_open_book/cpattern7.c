#include <stdio.h>  
int main()  
{  
    int i, j, rows, k = 0;  
    printf (" Enter number of rows: ");  
    scanf ("%d", &rows);
    printf("\n");
    for ( i =1; i <= rows; i++)  
    {  
    for(j = 1; j <= rows - i; j++)
    {  
    printf ("  ");   
    }  
    for ( k = 1; k <= ( 2 * i - 1); k++)  
    {  
    printf ("%d ",i);  
    }  
    printf ("\n");  
    }  
}  