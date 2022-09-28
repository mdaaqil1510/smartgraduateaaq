#include <stdio.h>
int main()
{
    int num, orgnum, remain, result = 0;
    printf("Enter a three-digit integer: ");
    scanf("%d", &num);
    orgnum = num;
    while (orgnum != 0)
    {
    remain = orgnum % 10;
    result += remain * remain * remain;
    orgnum /= 10;
    }
    if (result == num)
    printf("%d is an Armstrong number.", num);
    else
    printf("%d is not an Armstrong number.", num);
    return 0;
}