#include<stdio.h>
int main()
{
    int a = 9,b = 4, c;
    c = a+b;
    printf("Addition of given two numbers       a+b =  %d \n",c);
    c = a-b;
    printf("Subtraction of given two numbers    a-b =  %d \n",c);
    c = a*b;
    printf("Multiplication of given two numbers a*b =  %d \n",c);
    c = a/b;
    printf("Division of given two numbers       a/b =  %d \n",c);
    c = a%b;
    printf("Remainder when a divided by b           =  %d \n",c);
    return 0;
}