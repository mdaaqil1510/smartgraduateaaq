#include <stdio.h>
int main()
{
    int base, ex;
    long double result = 1.0;
    printf("Enter a base number: ");
    scanf("%d", &base);
    printf("Enter an exonent: ");
    scanf("%d", &ex);
    while (ex != 0)
    {
    result *= base;
    --ex;
    }
    printf("Answer = %.0Lf", result);
    return 0;
}