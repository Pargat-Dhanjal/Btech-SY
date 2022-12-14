#include <stdio.h>
#include <stdlib.h>
struct node
{
    int value;
    struct node *hash;
};

struct node *list;

void insertBeg(int x)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->value = x;
    ptr->hash = list;
    list = ptr;
}

void deleteBeg()
{
    if (list == NULL)
        printf("The list is empty!\n");
    else
    {
        struct node *ptr = list;
        list = ptr->hash;
        free(ptr);
    }
}

void insertEnd(int x)
{
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->value = x;
    ptr->hash = NULL;
    struct node *i = list;
    if (i == NULL)
        list = ptr;
    else
    {
        while (i->hash != NULL)
            i = i->hash;
        i->hash = ptr;
    }
}

void deleteEnd()
{
    if (list == NULL)
        printf("The list is empty!\n");
    else
    {
        struct node *i = list;
        struct node *j = i;
        while (i->hash != NULL)
        {
            j = i;
            i = i->hash;
        }
        j->hash = NULL;
        free(i);
    }
}

void insertAt(int x, int pos)
{
    if (list == NULL || pos == 0)
        insertBeg(x);
    else
    {
        struct node *ptr = (struct node *)malloc(sizeof(struct node));
        ptr->value = x;
        ptr->hash = NULL;
        struct node *i = list->hash;
        struct node *j = list;
        int counter = 0;
        while (i != NULL)
        {
            if (++counter == pos)
            {
                j->hash = ptr;
                ptr->hash = i;
                break;
            }
            j = i;
            i = i->hash;
        }
    }
}

void deleteAt(int pos)
{
    if (list == NULL)
        printf("The list is empty!\n");
    else if (pos == 0)
        deleteBeg();
    else
    {
        struct node *i = list->hash;
        struct node *j = list;
        int counter = 0;
        while (i != NULL)
        {
            if (++counter == pos)
            {
                j->hash = i->hash;
                free(i);
                break;
            }
            j = i;
            i = i->hash;
        }
    }
}

void printList()
{
    if (list == NULL)
        printf("The list is empty!\n");
    else
    {
        struct node *i = list;
        printf("\n\nThe list Elements are :\n");
        while (i != NULL)
        {
            printf("%d", i->value);
            i = i->hash;
            if (i != NULL)
                printf(" -> ");
        }
    }
}

void searchList(int x)
{
    if (list == NULL)
        printf("The list is empty!\n");
    else
    {
        struct node *i = list;
        int pos = 0;
        while (i != NULL)
        {
            if (i->value == x)
            {
                printf("Element found at pos: %d\n", pos);
                pos = -1;
                break;
            }
            i = i->hash;
            pos++;
        }
        if (pos != -1)
            printf("Element Not Found!\n");
    }
}

int main()
{
    int t = 0;
    while (t != 11)
    {
        printf("\nSelect a function\n");
        printf("(1) Print List\n");
        printf("(2) Insert at Beginning\n");
        printf("(3) Delete Beginning\n");
        printf("(4) Insert at End\n");
        printf("(5) Delete End\n");
        printf("(6) Insert at position\n");
        printf("(7) Insert after position\n");
        printf("(8) Delete at position\n");
        printf("(9) Delete after position\n");
        printf("(10) Search Element\n");
        printf("(11) Exit\n");
        scanf("%d", &t);
        if (t == 1)
            printList();
        else if (t == 2)
        {
            int x;
            printf("Enter element to insert : ");
            scanf("%d", &x);
            insertBeg(x);
        }
        else if (t == 3)
            deleteBeg();
        else if (t == 4)
        {
            int x;
            printf("Enter element to insert : ");
            scanf("%d", &x);
            insertEnd(x);
        }
        else if (t == 5)
            deleteEnd();
        else if (t == 6)
        {
            int x, pos;
            printf("Enter element to insert : ");
            scanf("%d", &x);
            printf("Enter element position : ");
            scanf("%d", &pos);
            insertAt(x, pos);
        }
        else if (t == 7)
        {
            int x, pos;
            printf("Enter element to insert : ");
            scanf("%d", &x);
            printf("Enter position to insert after: ");
            scanf("%d", &pos);
            insertAt(x, pos + 1);
        }
        else if (t == 8)
        {
            int pos;
            printf("Enter position to delete: ");
            scanf("%d", &pos);
            deleteAt(pos);
        }
        else if (t == 9)
        {
            int pos;
            printf("Enter position to delete after: ");
            scanf("%d", &pos);
            deleteAt(pos + 1);
        }
        else if (t == 10)
        {
            int x;
            printf("Enter element to search: ");
            scanf("%d", &x);
            searchList(x);
        }
        else if (t == 11)
            break;
        else
            printf("Wrong entry!\n");
    }
    return 0;
}