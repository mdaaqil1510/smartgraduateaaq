#include<stdio.h>
#include<conio.h>
int totalThousand =1000;
int totalfivehundred =1000;
int totalonehundred =1000;

void main()
{
    unsigned long withdrawamt;
    unsigned long totmoney;
    int thousand=0,fiveHundred=0,oneHundred=0;
    printf("Enter the amount in multiple of 100: ");
    scanf("%lu",&withdrawamt);
    if(withdrawamt %100 != 0){
    printf("Invalid amount;");
    getch();
    return;
    }
    totmoney = totalThousand * 1000 + totalfivehundred* 500 + totalonehundred*100;
    if(withdrawamt > totmoney){
    printf("Sorry,Insufficient money");
    getch();
    return;
    }
    thousand = withdrawamt / 1000;
    if(thousand > totalThousand)
    thousand = totalThousand;
    withdrawamt = withdrawamt - thousand * 1000;
    if (withdrawamt > 0){
    fiveHundred = withdrawamt / 500;
    if(fiveHundred > totalfivehundred)
    fiveHundred = totalfivehundred;
    withdrawamt = withdrawamt - fiveHundred * 500;
    }
    if (withdrawamt > 0)
    oneHundred = withdrawamt / 100;
    printf("Total 1000 note: %d\n",thousand);
    printf("Total 500 note: %d\n",fiveHundred);
    printf("Total 100 note: %d\n",oneHundred);
    getch();
}