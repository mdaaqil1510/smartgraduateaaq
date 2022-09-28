#include <math.h>
#include <stdio.h>
int main()
{
    int num, orgnum, remain, n = 0;
    float result = 0.0;
    printf("Enter an integer: ");
    scanf("%d", &num);
    orgnum = num;
    for (orgnum = num; orgnum != 0; ++n)
    {
    orgnum /= 10;
    }
    for (orgnum = num; orgnum != 0; orgnum /= 10) 
    {
    remain = orgnum % 10;
    result += pow(remain, n);
    }
    if ((int)result == num)
    printf("%d is an Armstrong number.", num);
    else
    printf("%d is not an Armstrong number.", num);
    return 0;
}