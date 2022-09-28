#include<stdio.h>
int main()
{
    double a, b;
    printf("Enter a:\t\t");
    scanf("%lf", &a);
    printf("Enter b:\t\t");
    scanf("%lf", &b);
    a = a - b;
    b = a + b;
    a = b - a;
    printf("After swapping,  a =    %.2lf\n", a);
    printf("After swapping,  b =    %.2lf", b);
    return 0;
}