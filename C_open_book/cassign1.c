#include <stdio.h>
int main()
{
    int a = 5, c;
    c = a; //c=5
    printf("c = %d\n", c);
    c += a;//c=5+5=10
    printf("c = %d\n", c);
    c -= a;//c=10-5=5
    printf("c = %d\n", c);
    c *= a; //c=5*5=25
    printf("c = %d\n", c);
    c /= a; //c=25/5=5
    printf("c = %d\n", c);
    c %= a; //reminder of 25/5=0
    printf("c = %d\n", c);
    return 0;
}