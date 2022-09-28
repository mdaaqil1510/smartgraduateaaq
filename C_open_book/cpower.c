#include <math.h>
#include <stdio.h>
int main()
{
    double base, exp, result;
    printf("Enter a base number: ");
    scanf("%lf", &base);
    printf("Enter an exponent  : ");
    scanf("%lf", &exp);
    result = pow(base, exp);
    printf("%.lf^%.lf = %.lf", base, exp, result);
    return 0;
}