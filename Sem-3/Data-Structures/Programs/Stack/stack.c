#include <stdio.h>
int top = -1;
void push(int *arr, int ele, int n)
{
    if (top >= n - 1)
        printf("The Stack is Full\n");
    else
        arr[++top] = ele;
}

int pop(int *arr)
{
    if (top != -1)
    {
        int temp = arr[top];
        arr[top--] = 0;
        return (temp);
    }
    printf("The Stack is Empty\n");
    return (0);
}

int peek(int *arr)
{
    return (arr[top]);
}

char *isempty(int *arr)
{
    if (top == -1)
        return ("Yes");
    return ("No");
}

char *overflow(int *arr, int n)
{
    if (top >= n - 1)
        return ("Yes");
    return ("No");
}

void printStack(int *arr)
{
    for (int i = top; i > -1; i--)
        printf("%d\n", arr[i]);
}

int main()
{
    int n;
    printf("Enter Stack size: ");
    scanf("%d", &n);
    int stack[n];
    int j = -1;
    while (j != 7)
    {
        printf("(1) Push\n");
        printf("(2) Pop\n");
        printf("(3) Peek\n");
        printf("(4) Overflow\n");
        printf("(5) Underflow\n");
        printf("(6) Print Stack\n");
        printf("(7) Exit\n");
        scanf("%d", &j);
        if (j == 1)
        {
            int ele;
            printf("Enter element to push: ");
            scanf("%d", &ele);
            push(stack, ele, n);
        }
        else if (j == 2)
            printf("Element %d is poped\n", pop(stack));
        else if (j == 3)
            printf("Top peek Element is: %d\n", peek(stack));
        else if (j == 4)
            printf("Is overflow: %s\n", overflow(stack, n));
        else if (j == 5)
            printf("Is it empty: %s\n", isempty(stack));
        else if (j == 6)
            printStack(stack);
        else
            printf("Please Enter correct Option\n");
    }
    return 0;
}