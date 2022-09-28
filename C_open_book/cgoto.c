#include <stdio.h>
    int main()
    {
    const int maxInput = 10;
    int i;
    double num, average, sum = 0.0;
    for (i = 1; i <= maxInput; ++i)
    {
    printf("%d. Enter a num: ", i);
    scanf("%lf", &num);
    if (num < 0.0)
    {
    goto jump;
    }
    sum += num;
    }
    jump:
    average = sum / (i - 1);
    printf("Sum = %.2f\n", sum);
    printf("Average = %.2f", average);
    return 0;
}