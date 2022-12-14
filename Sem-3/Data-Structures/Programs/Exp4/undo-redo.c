#include <stdio.h>
void push(char *arr, char ele, int n, int *top)
{
    if (*top >= n - 1)
        printf("The Stack is Full\n");
    else
    {
        *top = *top + 1;
        arr[*top] = ele;
    }
}

char pop(char *arr, int *top)
{
    if (*top != -1)
    {
        int temp = arr[*top];
        arr[*top] = 0;
        *top = *top - 1;
        return (temp);
    }
    printf("The Stack is Empty\n");
    return ('@');
}

char peek(char *arr, int *top)
{
    return (arr[*top]);
}

void printStack(char *arr, int *top)
{
    for (int i = *top; i > -1; i--)
        printf("%c\n", arr[i]);
}

int main()
{
    int n;
    printf("Enter Opperation size: ");
    scanf("%d", &n);
    char stack[n], bstack[n];
    int top = -1, btop = -1;
    int j = -1;
    while (j != 5)
    {
        printf("\n\n(1) Add Data\n");
        printf("(2) Undo\n");
        printf("(3) Redo\n");
        printf("(4) View Data\n");
        printf("(5) Exit\n");
        printf("Select an option: ");
        scanf("%d", &j);
        if (j == 1)
        {
            char ele;
            printf("\nEnter Data: ");
            scanf(" %c", &ele);
            push(stack, ele, n, &top);
        }
        else if (j == 2)
        {
            char temp = pop(stack, &top);
            if (temp != '@')
            {
                push(bstack, temp, n, &btop);
                printf("Element %c is removed\n", temp);
                if (peek(stack, &top) == '@')
                    printf("There is no next data!\n");
                else
                    printf("Next data is %c", peek(stack, &top));
            }
        }
        else if (j == 3)
        {
            char temp = pop(bstack, &btop);
            if (temp != '@')
            {
                push(stack, temp, n, &top);
                printf("Element %c is added back!\n", temp);
            }
        }
        else if (j == 4)
            printStack(stack, &top);
        else if (j == 5)
            break;
        else
            printf("Please Enter correct Option\n");
    }
    return 0;
}