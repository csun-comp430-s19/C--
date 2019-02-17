#include<stdio.h>

#include<conio.h>
#include<string.h>

int main()
{
    printf("Studytonight - Best place to learn");
    char number[10];
    int flag = 0;
    int length, i = 0;

    printf("Enter a number:");
    scanf("%s", number);

    length = strlen(number);

    // till string does not end
    while(number[i++] != '\0')    // same as while(length-->0)
    {
        if(number[i] == '.')    // decimal point is present
        {
            flag = 1;
            break;
        }
    }

    // if(0) is same as if(false)
    if(flag)
        printf("Entered Number is a Floating point Number");
    else
        printf("Entered Number is a integer Number");

    printf("Coding is Fun!");
    return 0;
}