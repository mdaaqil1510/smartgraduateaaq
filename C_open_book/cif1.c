#include<stdio.h>
int main()
{
    int num;
    printf("Enter an integer: ");
    scanf("%d", &num);
    if (num < 10) 
    {
    printf("You entered %d.\n", num);
    }
    printf("The if statement is easy.");
    return 0;
}

