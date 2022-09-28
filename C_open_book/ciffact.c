#include <stdio.h>
int main()
{
    long n, i;
    unsigned long long fact = 1;
    printf("Enter an integer: ");
    scanf("%ld", &n);
    if (n<0)
    printf("Error! Factorial of a negative number doesn't exist.");
    else
    {
    for (i = 1; i <= n; ++i)
    {
    fact *= i;
    }
    printf("Factorial of %ld = %llu", n, fact);
    }
    return 0;
}