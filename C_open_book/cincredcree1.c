#include <stdio.h>
int main()
{
    int a = 10, b = 100;
    float c = 10.5, d = 100.5;
    printf("++a = %d \n", ++a);// incremented first and then printed
    printf("--b = %d \n", --b);//decremented first and then printed
    printf("++c = %f \n", ++c);//incremented first and then printed
    printf("--d = %f \n", --d);//decremented first and then printed
    return 0;
}