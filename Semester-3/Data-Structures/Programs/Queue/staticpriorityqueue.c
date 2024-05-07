#include <stdio.h>
#include <stdlib.h>

struct Person
{
    int id;
    int age;
};
struct Person *priorQueue;
int space = 0;

void add(int id, int age, int size)
{
    if (space < size)
    {
        priorQueue[space].id = id;
        priorQueue[space].age = age;
        space++;
    }
    else
        printf("The Queue is full!\n");
}

void sort()
{
    for (int i = 0; i < space; i++)
    {
        for (int j = i; j < space; j++)
        {
            if (priorQueue[j].age < priorQueue[j + 1].age)
            {
                struct Person temp = priorQueue[j];
                priorQueue[j] = priorQueue[j + 1];
                priorQueue[j + 1] = temp;
            }
        }
    }
}

void delete ()
{
    if (space == 0)
        printf("The Queue is empty!\n");
    else
    {
        for (int i = 0; i < space; i++)
            priorQueue[i] = priorQueue[i + 1];
        priorQueue[space - 1].id = 0;
        priorQueue[space - 1].age = 0;
        space--;
    }
}

void view()
{
    for (int i = 0; i < space; i++)
        printf("Id: %d Age: %d\n", priorQueue[i].id , priorQueue[i].age);
}

void main()
{
    int n, t = -1;
    printf("Enter the size of the priority queue: \n");
    scanf("%d", &n);
    priorQueue = (struct Person *)malloc(sizeof(struct Person) * n);
    while (t != 4)
    {
        printf("(1) Add new entry\n");
        printf("(2) Delete Entry\n");
        printf("(3) View Queue\n");
        printf("(4) Exit\n");
        scanf("%d", &t);
        if (t == 1)
        {
            int id, age;
            printf("Enter person id: ");
            scanf("%d", &id);
            printf("Enter person age: ");
            scanf("%d", &age);
            add(id, age, n);
            sort();
        }
        else if (t == 2)
            delete ();
        else if (t == 3)
            view();
    }
}