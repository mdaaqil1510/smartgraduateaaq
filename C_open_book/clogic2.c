#include<stdio.h>
int main() 
{
    int dividend, divisor, quotient, remainder;
    printf("Enter dividend : ");
    scanf("%d", &dividend);
    printf("Enter divisor  : ");
    scanf("%d", &divisor);
    quotient = dividend / divisor;
    remainder = dividend % divisor;// Calculates remainder
    printf("Quotient  = \t %d\n",  quotient);
    printf("Remainder = \t %d",  remainder);
    return 0;
}