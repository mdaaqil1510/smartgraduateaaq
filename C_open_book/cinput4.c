#include <stdio.h>
int main()
{
    int x;
    float y;
    printf("Enter integer and then a float: ");
    scanf("%d%f", &x, &y);
    printf("You entered %d and %f", x, y);
    return 0;
}