#include <stdio.h>  
int main()  
{  
    int i, j, rows, k, l = 1;  
    printf (" Enter numbrs of rowss: ");  
    scanf ("%d", &rows);   
    printf("\n");  
    for ( i = rows; i >= 1; i--)  
    {  
    for ( j = 1; j <= l; j++)  
    {  
    printf ("  "); 
    }  
    for ( k = 1; k <= ( 2 * i - 1); k++)  
    {  
    printf ("* ");   
    }  
    l++;  
    printf ("\n");  
    }  
}  